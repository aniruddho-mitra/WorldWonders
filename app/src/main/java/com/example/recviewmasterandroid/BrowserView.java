package com.example.recviewmasterandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BrowserView extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_view);
        webView=findViewById(R.id.webView);
        webView.loadUrl("https://en.wikipedia.org/wiki/New7Wonders_of_the_World");
        webView.setWebViewClient(new WebViewClient());

    }
    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}