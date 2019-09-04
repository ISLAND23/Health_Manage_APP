package com.example.health_friend;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Zixunitem1 extends Activity {
	WebView webView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zixunitem1);
		Intent intent =getIntent();
		webView = (android.webkit.WebView) findViewById(R.id.webview_zixun1);
		WebSettings webSettings = webView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webSettings.setAllowFileAccess(true);
		webSettings.setBuiltInZoomControls(true);
		webView.loadUrl("https://jingyan.baidu.com/article/925f8cb8b9e6ebc0dce0564a.html");
		webView.setWebViewClient(new WebViewClient());
		
		class webViewClient extends WebViewClient{
			
			public boolean shouldOverrideUrlLoading(WebView view,String url) {
				view.loadUrl(url);
				return true;
			}
			
		}
		
		
	}

	
	}


