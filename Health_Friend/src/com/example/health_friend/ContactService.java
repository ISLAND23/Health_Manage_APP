package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class ContactService extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.server);
		
		call("13415629770");
	}
	private void call(String phoneNumber) {
		// TODO �Զ����ɵķ������
		//��ת�����Ž��棬ͬʱ���ݵ绰����
		Intent intent_phone =  new Intent(Intent.ACTION_DIAL,
				Uri.parse("tel:" + phoneNumber));
		intent_phone.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intent_phone);
	}

}
