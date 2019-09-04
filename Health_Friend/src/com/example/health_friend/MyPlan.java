package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MyPlan extends Activity{
	ImageButton imgsport,imgsleep;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.plan);
		
		imgsport = (ImageButton) findViewById(R.id.sportplan);
		imgsleep = (ImageButton) findViewById(R.id.sleepplan);
		
		imgsport.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent_1 = new Intent();
				intent_1.setClass(MyPlan.this, SportPlan.class);
				startActivity(intent_1);
			}
		});
		
		imgsleep.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent_2 = new Intent();
				intent_2.setClass(MyPlan.this, SleepPlan.class);
				startActivity(intent_2);
			}
		});
	}

}
