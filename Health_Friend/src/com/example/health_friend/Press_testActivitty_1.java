package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class Press_testActivitty_1 extends Activity{
	ImageButton img_1;
	ImageButton img_2;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.press_test_activitty_1);
		Intent intent=getIntent();
		img_1=(ImageButton) findViewById(R.id.img_1);
		img_2=(ImageButton) findViewById(R.id.img_2);
		img_1.setOnClickListener(new myOnClickListener_img_1());
		img_2.setOnClickListener(new myOnClickListener_img_2());
	
}
	class myOnClickListener_img_1 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			int img_1=2;
			intent.putExtra("value_1", img_1);
			
			intent.setClass(Press_testActivitty_1.this, Press_testActivitty_2.class);
			Press_testActivitty_1.this.startActivity(intent);
		}
	
	}
	
	class myOnClickListener_img_2 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			int img_2=8;
			intent.putExtra("value_1",img_2 );

			intent.setClass(Press_testActivitty_1.this, Press_testActivitty_2.class);
			Press_testActivitty_1.this.startActivity(intent);
		}
	
	}
}
