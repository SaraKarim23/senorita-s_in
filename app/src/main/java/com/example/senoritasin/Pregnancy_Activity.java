package com.example.senoritasin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Pregnancy_Activity extends AppCompatActivity {

    WebView webViewP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregnency_);

        webViewP=(WebView) findViewById(R.id.web_View_P);
        webViewP.setWebViewClient(new WebViewClient());
        webViewP.loadUrl("https://www.pregnancy.com/");

        WebSettings webSettings=webViewP.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (webViewP.canGoBack()){
            webViewP.goBack();
        }
    }
}