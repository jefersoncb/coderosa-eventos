package br.cesed.coderosa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by jeferson on 6/8/16.
 */


public class activityCharges extends Activity {
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charges);
    }

    public void biggerView(View v)
    {
        im=(ImageView)findViewById(R.id.selected);

        switch (v.getId())
        {
            case R.id.image1: im.setImageResource(R.drawable.tirinha1580);
                break;
            case R.id.image2: im.setImageResource(R.drawable.tirinha1581);
                break;
            case R.id.image3: im.setImageResource(R.drawable.tirinha1582);
                break;
            case R.id.image4: im.setImageResource(R.drawable.tirinha1583);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

