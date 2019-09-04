package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Game extends Activity{
	private WebView webview;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.game);
     Intent intent=getIntent();
     webview = (WebView) findViewById(R.id.webview_1);
		WebSettings webSettings = webview.getSettings();
		webSettings.setJavaScriptEnabled(true); 
		webSettings.setAllowFileAccess(true);
		webSettings.setBuiltInZoomControls(true);
		webview.loadUrl("http://games.huhugame.com/game/?url=http://szhong.4399.com/4399swf/upload_swf/ftp17/gamehwq/20150906/08/game.swf&title=°«ÈËÓÂÊ¿"); 
		//webview.getSettings().setDomStorageEnabled(true);
		webview.setWebViewClient(new webViewClient ());  

}
	 private class webViewClient extends WebViewClient {  
	        public boolean shouldOverrideUrlLoading(WebView view, String url) {  
	            view.loadUrl(url);  
	            return true;  
	        }  
	    }  
	 


	
	}
