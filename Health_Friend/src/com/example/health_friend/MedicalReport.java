package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MedicalReport extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Button btn;
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.report);
		
		btn = (Button) findViewById(R.id.btn);
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent_btn2 = new Intent();
				intent_btn2.setClass(MedicalReport.this,Camera.class);
				startActivity(intent_btn2);
			}
		});
	}
	
}
