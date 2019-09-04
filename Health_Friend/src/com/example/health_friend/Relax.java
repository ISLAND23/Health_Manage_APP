package com.example.health_friend;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Relax extends Activity{
	private MediaPlayer mediaPlayer;
	boolean playing = false;
	ImageButton music_button_1;
	ImageButton music_button_2;
	ImageButton music_button_3;
	ImageButton music_button_4;
	ImageButton music_button_5;
	ImageButton music_button_6;
	ImageButton music_button_7;
	ImageButton music_button_8;
	
	ImageButton music_button_9;
	ImageButton music_button_10;
	ImageButton music_button_11;
	ImageButton music_button_12;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.relax);
     Intent intent=getIntent();
     music_button_1=(ImageButton) findViewById(R.id.click_music_1);
     music_button_2=(ImageButton) findViewById(R.id.click_music_2);
     music_button_3=(ImageButton) findViewById(R.id.click_music_3);
     music_button_4=(ImageButton) findViewById(R.id.click_music_4);
     music_button_5=(ImageButton) findViewById(R.id.click_music_5);
     music_button_6=(ImageButton) findViewById(R.id.click_music_6);
     music_button_7=(ImageButton) findViewById(R.id.click_music_7);
     music_button_8=(ImageButton) findViewById(R.id.click_music_8);
     
     music_button_9=(ImageButton) findViewById(R.id.click_music_9);
     music_button_10=(ImageButton) findViewById(R.id.click_music_10);
     music_button_11=(ImageButton) findViewById(R.id.click_music_11);
     music_button_12=(ImageButton) findViewById(R.id.click_music_12);
     
     music_button_1.setOnClickListener(new onclickmusic());
     music_button_2.setOnClickListener(new onclickmusic());
     music_button_3.setOnClickListener(new onclickmusic());
     music_button_4.setOnClickListener(new onclickmusic());
     music_button_5.setOnClickListener(new onclickmusic());
     music_button_6.setOnClickListener(new onclickmusic());
     music_button_7.setOnClickListener(new onclickmusic());
     music_button_8.setOnClickListener(new onclickmusic());
     
     music_button_9.setOnClickListener(new onclickmusic());
     music_button_10.setOnClickListener(new onclickmusic());
     music_button_11.setOnClickListener(new onclickmusic());
     music_button_12.setOnClickListener(new onclickmusic());
  
     
	}
	class onclickmusic implements OnClickListener{
	   
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (playing) {
				mediaPlayer.stop();
				playing = false;
			} else {
				//设置音乐路径，播放器初始化
			     try
			     {
				     // 创建MediaPlayer对象,将raw文件夹下的fighter.mp3
			    	 if(v.getId()==R.id.click_music_1){
			    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_2); 
			    	 }
			    	 else if(v.getId()==R.id.click_music_2){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_3); 
				    	 }
			    	 else if(v.getId()==R.id.click_music_3){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_1); 
				    	 }
			    	 else if(v.getId()==R.id.click_music_4){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_4); 
				    	 }
			    	 else if(v.getId()==R.id.click_music_5){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_5); 
				    	 }
			    	 else if(v.getId()==R.id.click_music_6){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_6); 
				    	 }
			    	 else if(v.getId()==R.id.click_music_7){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_7); 
				    	 }
			    	 else if(v.getId()==R.id.click_music_8){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_8); 
				    	 }
			    	 
			    	 else if(v.getId()==R.id.click_music_9){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_2); 
				    	 }
			    	 else if(v.getId()==R.id.click_music_10){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_3); 
				    	 }
			    	 else if(v.getId()==R.id.click_music_11){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_4); 
				    	 }
			    	 else if(v.getId()==R.id.click_music_12){
				    	 mediaPlayer = MediaPlayer.create(Relax.this, R.raw.music_5); 
				    	 }
			    	 mediaPlayer.setLooping(true);
				     mediaPlayer.start();
				     playing = true;
				     System.out.println("mediaPlayer.start(); ----------------");
			     }
			     catch (IllegalArgumentException e)
			     {
			    	 // TODO Auto-generated catch block
			    	 e.printStackTrace();
			     }
			}


			     
		//	     mediaPlayer.start();
			     //暂停,用start()可恢复播放
		//	     mediaPlayer.pause();
			     //停止播放，清除播放器，需重新设置音乐路径
		/*	     if (mediaPlayer != null)
			     {
			     
			     mediaPlayer.release();
			     }
			     */
		}
	}
}