package br.cesed.coderosa;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by jeferson on 6/8/16.
 */
public class activityMapa extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        ImageButton bm1 = (ImageButton) findViewById(R.id.imageView5);
        bm1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                AlertDialog alert = new AlertDialog.Builder(activityMapa.this).create();
                alert.setTitle("Ops...");
                alert.setMessage("Coloquei um print do mapa, a API do google eu não consegui.");
                alert.setCancelMessage(null);
                alert.show();
            }
        });
    }}
