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
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yuyue);
		
		Intent intent_wv = getIntent();
		wv = (WebView) findViewById(R.id.wv1);
		
		WebSettings webSettings = wv.getSettings();
		webSettings.setJavaScriptEnabled(true);
		//webSettings.setUseWideViewPort(true); //��ͼƬ�������ʺ�WebView�Ĵ�С
		webSettings.setAllowFileAccess(true);
		webSettings.setBuiltInZoomControls(true);
		
		wv.loadUrl("https://ysk.familydoctor.com.cn/");
		wv.setWebViewClient(new webClient());
	}
	
	private class webClient extends WebViewClient{
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			// TODO �Զ����ɵķ������
			view.loadUrl(url);
			return true;
		}
	}
		
}
