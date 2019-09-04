package com.example.health_friend;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Press_testActivitty_3 extends Activity{
	ImageButton img_5;
	ImageButton img_6;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.press_test_activitty_3);
		Intent intent=getIntent();
		
		img_5=(ImageButton) findViewById(R.id.img_5);
		img_6=(ImageButton) findViewById(R.id.img_6);
		img_5.setOnClickListener(new myOnClickListener_img_5());
		img_6.setOnClickListener(new myOnClickListener_img_6());
	
}
	class myOnClickListener_img_5 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			Intent intent0=getIntent();
			int a=0;
			int value_2=intent0.getIntExtra("value_2", a);
			
			int img_5=2;
			int value_3=value_2+img_5;
			intent.putExtra("value_3", value_3);
			intent.setClass(Press_testActivitty_3.this, Press_testActivitty_4.class);
			Press_testActivitty_3.this.startActivity(intent);
		}

		
	}
	
	class myOnClickListener_img_6 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			Intent intent0=getIntent();
			int a=0;
			int value_2=intent0.getIntExtra("value_2", a);
			
			int img_6=5;
			int value_3=value_2+img_6;
			intent.putExtra("value_3", value_3);
			intent.setClass(Press_testActivitty_3.this, Press_testActivitty_4.class);
			Press_testActivitty_3.this.startActivity(intent);
		}

		
	}
}


