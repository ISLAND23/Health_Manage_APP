package com.example.health_friend;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Zixinitem3 extends Activity {
	WebView webView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zixinitem3);
		Intent intent =getIntent();
		webView = (android.webkit.WebView) findViewById(R.id.webview_zixun3);
		WebSettings webSettings = webView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webSettings.setAllowFileAccess(true);
		webSettings.setBuiltInZoomControls(true);
		webView.loadUrl("https://jingyan.baidu.com/article/a65957f499b19f24e67f9bc4.htmll");
		webView.setWebViewClient(new WebViewClient());
		
		class webViewClient extends WebViewClient{
			
			public boolean shouldOverrideUrlLoading(WebView view,String url) {
				view.loadUrl(url);
				return true;
			}
			
		}
	}

	

}
