package com.example.pregnant;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Detail extends Activity {
	
	WebView webView;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail);
		webView=(WebView)findViewById(R.id.webView1);
		
	    WebSettings webSettings = webView.getSettings();
	    webSettings.setLoadWithOverviewMode(true);
        //webSettings.setUseWideViewPort(true);
	    //webView.setBackgroundColor(Color.TRANSPARENT);  //  WebView 背景透明效果 
        //webSettings.setJavaScriptEnabled(true);
	    //webSettings.setRenderPriority(RenderPriority.HIGH);	    
	    webView.loadUrl(getIntent().getStringExtra("url"));  
	}
}
