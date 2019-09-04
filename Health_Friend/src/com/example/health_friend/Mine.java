package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Mine extends Activity{
	ImageButton imgtx,imgbtn1,imgbtn2,imgbtn3,imgbtn4,imgbtn5,imgbtn6;
	TextView usrname;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personalcenter);
		Intent intent=getIntent();
		
		imgtx = (ImageButton) findViewById(R.id.touxiang);
		imgbtn1 = (ImageButton) findViewById(R.id.imgbtn1);
		imgbtn2 = (ImageButton) findViewById(R.id.imgbtn2);
		imgbtn3 = (ImageButton) findViewById(R.id.imgbtn3);
		imgbtn4 = (ImageButton) findViewById(R.id.imgbtn4);
		imgbtn5 = (ImageButton) findViewById(R.id.imgbtn5);
		imgbtn6 = (ImageButton) findViewById(R.id.imgbtn6);
		
		usrname = (TextView) findViewById(R.id.user_name);
		String receive_name = getIntent().getStringExtra("NAME");
		usrname.setText(receive_name);
		
		key_events();
	}

	private void key_events() {
		// TODO 自动生成的方法存根
		
		imgtx.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent_0 = new Intent();
				intent_0.setClass(Mine.this, MyDangAn.class);
				startActivity(intent_0);
			}
		});
		
		imgbtn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent_1 = new Intent();
				intent_1.setClass(Mine.this, MyPlan.class);
				startActivity(intent_1);
			}
		});
		
		imgbtn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent_2 = new Intent();
				intent_2.setClass(Mine.this, MedicalReport.class);
				startActivity(intent_2);
			}
		});
		
		imgbtn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent_3 = new Intent();
				intent_3.setClass(Mine.this, YuYue.class);
				startActivity(intent_3);
			}
		});
		
		imgbtn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent_4 = new Intent();
				intent_4.setClass(Mine.this, save.class);
				startActivity(intent_4);
			}
		});
		
		imgbtn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent_5 = new Intent();
				intent_5.setClass(Mine.this, Help.class);
				startActivity(intent_5);
			}
		});
		
		imgbtn6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent_6 = new Intent();
				intent_6.setClass(Mine.this, ContactService.class);
				startActivity(intent_6);
			}
		});
		
	}

}
