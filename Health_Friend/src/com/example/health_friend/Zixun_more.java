package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Zixun_more extends Activity {
	WebView webView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zixun_more);
		
		Intent intent =getIntent();
		webView = (android.webkit.WebView) findViewById(R.id.webview_zixun1);
		WebSettings webSettings = webView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webSettings.setAllowFileAccess(true);
		webSettings.setBuiltInZoomControls(true);
		webView.loadUrl("http://m.ttys5.com/");
		webView.setWebViewClient(new WebViewClient());
		
		class webViewClient extends WebViewClient{
			
			public boolean shouldOverrideUrlLoading(WebView view,String url) {
				view.loadUrl(url);
				return true;
			}
			
		}
		
	}

}
