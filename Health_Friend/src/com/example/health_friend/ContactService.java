package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class ContactService extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.server);
		
		call("13415629770");
	}
	private void call(String phoneNumber) {
		// TODO 自动生成的方法存根
		//跳转到拨号界面，同时传递电话号码
		Intent intent_phone =  new Intent(Intent.ACTION_DIAL,
				Uri.parse("tel:" + phoneNumber));
		intent_phone.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intent_phone);
	}

}
