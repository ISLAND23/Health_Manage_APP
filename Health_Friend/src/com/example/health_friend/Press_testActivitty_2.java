package com.example.health_friend;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Press_testActivitty_2 extends Activity{
	ImageButton img_3;
	ImageButton img_4;
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.press_test_activitty_2);
		Intent intent=getIntent();
		
		img_3=(ImageButton) findViewById(R.id.img_3);
		img_4=(ImageButton) findViewById(R.id.img_4);
		img_3.setOnClickListener(new myOnClickListener_img_3());
		img_4.setOnClickListener(new myOnClickListener_img_4());
	
}
	class myOnClickListener_img_3 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			Intent intent0=getIntent();
			int a=0;
			int value_1=intent0.getIntExtra("value_1", a);
			System.out.println("///////////////"+value_1);
			int img_3=1;
			int value_2=value_1+img_3;
			intent.putExtra("value_2", value_2);
			intent.setClass(Press_testActivitty_2.this, Press_testActivitty_3.class);
			Press_testActivitty_2.this.startActivity(intent);
		}

	
	}
	
	class myOnClickListener_img_4 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			Intent intent0=getIntent();
			int a=0;
			int value_1=intent0.getIntExtra("value_1", a);
			System.out.println("///////////////"+value_1);
			int img_4=4;
			int value_2=value_1+img_4;
			intent.putExtra("value_2", value_2);
			intent.setClass(Press_testActivitty_2.this, Press_testActivitty_3.class);
			Press_testActivitty_2.this.startActivity(intent);
		}

	
	}
}


