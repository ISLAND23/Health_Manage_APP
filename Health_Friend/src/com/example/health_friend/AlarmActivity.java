package com.example.health_friend;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public class AlarmActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		//���ӶԻ���
		new AlertDialog.Builder(AlarmActivity.this).setTitle("��������").
		setMessage("�����ϴ�˯���ˣ�").
		setPositiveButton("OK", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO �Զ����ɵķ������
				AlarmActivity.this.finish();
			}
		}).create().show();
	}
	
}
