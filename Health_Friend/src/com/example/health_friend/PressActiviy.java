package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class PressActiviy extends Activity{
	
	ImageButton PressTestButton;
	ImageButton btn_game;
	ImageButton btn_music;
	ImageButton btn_nature;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.press_activity_first);
		
		PressTestButton=(ImageButton) findViewById(R.id.press_test);
		btn_game=(ImageButton) findViewById(R.id.enter_game);
		btn_music=(ImageButton) findViewById(R.id.enter_music);
		btn_nature=(ImageButton) findViewById(R.id.enter_nature);
		PressTestButton.setOnClickListener(new Onbuttonlistener_press_test());
		btn_game.setOnClickListener(new Onbuttonlistener_enter_game());
		btn_music.setOnClickListener(new Onbuttonlistener_enter_music());
		btn_nature.setOnClickListener(new Onbuttonlistener_enter_nature());
}
	class Onbuttonlistener_press_test implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.setClass(PressActiviy.this,Press_testActivitty_1.class);
			PressActiviy.this.startActivity(intent);
			
		}
		
	}
	
	class Onbuttonlistener_enter_game implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.setClass(PressActiviy.this,Game.class);
			PressActiviy.this.startActivity(intent);
		}
		
	}
	
	class Onbuttonlistener_enter_music implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(PressActiviy.this,Relax.class);
				PressActiviy.this.startActivity(intent);
			}
		}
		
	
	
	class Onbuttonlistener_enter_nature implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.setClass(PressActiviy.this,Nature.class);
			PressActiviy.this.startActivity(intent);
		}
		
	}
	}