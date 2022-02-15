package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class View_Website extends AppCompatActivity {
 WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_website);
        webView=findViewById(R.id.webview);
        webView.loadUrl("https://www.youtube.com/");
    }
}