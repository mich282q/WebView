package com.jfdimarzio.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = wv.getSettings();
        webSettings.setBuiltInZoomControls(true);
        wv.loadUrl(
                "http://chart.apis.google.com/chart" +
                        "?chs=300x225" +
                        "&cht=v" +
                        "&chco=FF6342,ADDE63,63C6DE" +
                        "&chd=t:100,80,60,30,30,30,10" +
                        "&chdl=A|B|C");
    }
}
