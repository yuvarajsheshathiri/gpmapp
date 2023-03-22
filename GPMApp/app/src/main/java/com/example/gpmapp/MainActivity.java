package com.example.gpmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView GPM_WEBView;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GPM_WEBView = findViewById(R.id.gpm_web);
        GPM_WEBView.getSettings().setJavaScriptEnabled(true);
        GPM_WEBView.setWebViewClient(new WebViewControllerGPM());

        GPM_WEBView.loadUrl("https://www.paytronix.com/");


    }
}