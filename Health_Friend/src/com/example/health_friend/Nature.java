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

public class Nature extends Activity{
	private MediaPlayer mediaPlayer;
	boolean playing = false;
	ImageButton music_button_hailang;
	ImageButton music_button_xiaoxi;
	ImageButton music_button_grid;
	ImageButton music_button_xiangjian;
	ImageButton music_button_chongming;
	ImageButton music_button_rain;
	ImageButton music_button_xiangwan;
	ImageButton music_button_xingye;
	
	ImageButton music_button_conglin;
	ImageButton music_button_pubu;
	ImageButton music_button_heliu;
	ImageButton music_button_tianye;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nature);
     Intent intent=getIntent();
     music_button_hailang=(ImageButton) findViewById(R.id.music_nature_hailang);
     music_button_xiaoxi=(ImageButton) findViewById(R.id.music_nature_xiaoxi);
     music_button_grid=(ImageButton) findViewById(R.id.music_nature_grid);
     music_button_xiangjian=(ImageButton) findViewById(R.id.music_nature_xiangjian);
     music_button_chongming=(ImageButton) findViewById(R.id.music_nature_chongming);
     music_button_rain=(ImageButton) findViewById(R.id.music_nature_rain);
     music_button_xiangwan=(ImageButton) findViewById(R.id.music_nature_xiangwan);
     music_button_xingye=(ImageButton) findViewById(R.id.music_nature_xingye);
     
     music_button_conglin=(ImageButton) findViewById(R.id.music_nature_conglin);
     music_button_pubu=(ImageButton) findViewById(R.id.music_nature_pubu);
     music_button_heliu=(ImageButton) findViewById(R.id.music_nature_heliu);
     music_button_tianye=(ImageButton) findViewById(R.id.music_nature_tianye);
     
     music_button_hailang.setOnClickListener(new onclickmusic());
     music_button_xiaoxi.setOnClickListener(new onclickmusic());
     music_button_grid.setOnClickListener(new onclickmusic());
     music_button_xiangjian.setOnClickListener(new onclickmusic());
     music_button_chongming.setOnClickListener(new onclickmusic());
     music_button_rain.setOnClickListener(new onclickmusic());
     music_button_xiangwan.setOnClickListener(new onclickmusic());
     music_button_xingye.setOnClickListener(new onclickmusic());
     
     music_button_conglin.setOnClickListener(new onclickmusic());
     music_button_pubu.setOnClickListener(new onclickmusic());
     music_button_heliu.setOnClickListener(new onclickmusic());
     music_button_tianye.setOnClickListener(new onclickmusic());
  
     
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
			    	 if(v.getId()==R.id.music_nature_hailang){
			    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.hailang); 
			    	 }
			    	 else if(v.getId()==R.id.music_nature_xiaoxi){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.xiaoxi); 
				    	 }
			    	 else if(v.getId()==R.id.music_nature_grid){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.grid); 
				    	 }
			    	 else if(v.getId()==R.id.music_nature_xiangjian){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.xiangjian); 
				    	 }
			    	 else if(v.getId()==R.id.music_nature_chongming){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.chongming); 
				    	 }
			    	 else if(v.getId()==R.id.music_nature_rain){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.rain); 
				    	 }
			    	 else if(v.getId()==R.id.music_nature_xiangwan){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.xiangwan); 
				    	 }
			    	 else if(v.getId()==R.id.music_nature_xingye){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.xingye); 
				    	 }
			    	 
			    	 else if(v.getId()==R.id.music_nature_conglin){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.conglin); 
				    	 }
			    	 else if(v.getId()==R.id.music_nature_pubu){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.pubu); 
				    	 }
			    	 else if(v.getId()==R.id.music_nature_heliu){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.heliu); 
				    	 }
			    	 else if(v.getId()==R.id.music_nature_tianye){
				    	 mediaPlayer = MediaPlayer.create(Nature.this, R.raw.tianye); 
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