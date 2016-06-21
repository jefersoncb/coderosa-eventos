package br.cesed.coderosa;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by jeferson on 6/8/16.
 */
public class activityVideos extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        WebView browser = (WebView) findViewById(R.id.webView);
        browser.loadUrl("http://www.youtube.com/user/facisapb");
    }
}
