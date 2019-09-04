package com.example.health_friend;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public class AlarmActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		//闹钟对话框
		new AlertDialog.Builder(AlarmActivity.this).setTitle("闹钟提醒").
		setMessage("您该上床睡觉了！").
		setPositiveButton("OK", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO 自动生成的方法存根
				AlarmActivity.this.finish();
			}
		}).create().show();
	}
	
}
