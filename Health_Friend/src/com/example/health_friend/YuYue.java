package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class YuYue extends Activity{
	WebView wv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yuyue);
		
		Intent intent_wv = getIntent();
		wv = (WebView) findViewById(R.id.wv1);
		
		WebSettings webSettings = wv.getSettings();
		webSettings.setJavaScriptEnabled(true);
		//webSettings.setUseWideViewPort(true); //将图片调整到适合WebView的大小
		webSettings.setAllowFileAccess(true);
		webSettings.setBuiltInZoomControls(true);
		
		wv.loadUrl("https://ysk.familydoctor.com.cn/");
		wv.setWebViewClient(new webClient());
	}
	
	private class webClient extends WebViewClient{
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			// TODO 自动生成的方法存根
			view.loadUrl(url);
			return true;
		}
	}
		
}
