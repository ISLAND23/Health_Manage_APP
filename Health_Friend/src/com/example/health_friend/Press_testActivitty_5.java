package com.example.health_friend;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Press_testActivitty_5 extends Activity{
	ImageButton img_9;
	ImageButton img_10;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.press_test_activitty_5);
		Intent intent=getIntent();
		img_9=(ImageButton) findViewById(R.id.img_9);
		img_10=(ImageButton) findViewById(R.id.img_10);
		img_9.setOnClickListener(new myOnClickListener_img_9());
		img_10.setOnClickListener(new myOnClickListener_img_10());
	
}
	class myOnClickListener_img_9 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			Intent intent0=getIntent();
			int a=0;
			int value_4=intent0.getIntExtra("value_4", a);
			
			int img_9=1;
			int value_5=value_4+img_9;
			intent.putExtra("value_5", value_5);
			intent.setClass(Press_testActivitty_5.this, Press_testActivitty_result.class);
			Press_testActivitty_5.this.startActivity(intent);
		}

	}
	
	class myOnClickListener_img_10 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			Intent intent0=getIntent();
			int a=0;
			int value_4=intent0.getIntExtra("value_4", a);
			//System.out.println("*******************"+value_4);
			
			int img_10=1;
			int value_5=value_4+img_10;
			intent.putExtra("value_5", value_5);
			intent.setClass(Press_testActivitty_5.this, Press_testActivitty_result.class);
			Press_testActivitty_5.this.startActivity(intent);
		}

	}
}
