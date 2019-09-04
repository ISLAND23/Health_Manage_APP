package com.example.health_friend;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Press_testActivitty_4 extends Activity{
	ImageButton img_7;
	ImageButton img_8;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.press_test_activitty_4);
		Intent intent=getIntent();
		img_7=(ImageButton) findViewById(R.id.img_7);
		img_8=(ImageButton) findViewById(R.id.img_8);
		img_7.setOnClickListener(new myOnClickListener_img_7());
		img_8.setOnClickListener(new myOnClickListener_img_8());
	
}
	class myOnClickListener_img_7 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			Intent intent0=getIntent();
			int a=0;
			int value_3=intent0.getIntExtra("value_3", a);
			
			int img_7=3;
			int value_4=value_3+img_7;
			intent.putExtra("value_4", value_4);
			intent.setClass(Press_testActivitty_4.this, Press_testActivitty_5.class);
			Press_testActivitty_4.this.startActivity(intent);
		}

	}
	
	class myOnClickListener_img_8 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			Intent intent0=getIntent();
			int a=0;
			int value_3=intent0.getIntExtra("value_3", a);
			
			int img_8=6;
			int value_4=value_3+img_8;
			intent.putExtra("value_4", value_4);
			intent.setClass(Press_testActivitty_4.this, Press_testActivitty_5.class);
			Press_testActivitty_4.this.startActivity(intent);
		}

	}
}

