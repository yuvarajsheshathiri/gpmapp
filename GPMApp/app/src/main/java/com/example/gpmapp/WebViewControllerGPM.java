package com.example.gpmapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewControllerGPM extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
