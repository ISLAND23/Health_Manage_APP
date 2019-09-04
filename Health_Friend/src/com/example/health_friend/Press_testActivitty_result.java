package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Press_testActivitty_result extends Activity{
	ImageView myImageView;
	ImageButton img_game;
	ImageButton img_relax;
	ImageButton img_nature;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.press_test_activitty_result);
		Intent intent=getIntent();
		Intent intent0=getIntent();
		int a=0;
		int result=intent0.getIntExtra("value_5", a);
		System.out.println("=================="+result);
		if(result==9){
			setContentView(R.layout.press_test_activitty_result_no_stress);
		}
		else if(result>=10 && result<=23){
			setContentView(R.layout.press_test_activitty_result_little_stress);
		}
		else if(result==24){
			setContentView(R.layout.press_test_activitty_result_stress);
		}
		
		
		img_game=(ImageButton) findViewById(R.id.press_game);
		img_relax=(ImageButton) findViewById(R.id.press_relax);
		img_nature=(ImageButton) findViewById(R.id.press_nature);
		img_game.setOnClickListener(new myClickListener_game());
		img_relax.setOnClickListener(new myClickListener_relax());
		img_nature.setOnClickListener(new myClickListener_nature());
}
	class myClickListener_game implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			Intent intent=new Intent();
			intent.setClass(Press_testActivitty_result.this, Game.class);
			Press_testActivitty_result.this.startActivity(intent);
		}
		
	}
	
	class myClickListener_relax implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			Intent intent=new Intent();
			intent.setClass(Press_testActivitty_result.this, Relax.class);
			Press_testActivitty_result.this.startActivity(intent);
		}
		
	}
	
	class myClickListener_nature implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			Intent intent=new Intent();
			intent.setClass(Press_testActivitty_result.this, Nature.class);
			Press_testActivitty_result.this.startActivity(intent);
		}
		
	}
	}
