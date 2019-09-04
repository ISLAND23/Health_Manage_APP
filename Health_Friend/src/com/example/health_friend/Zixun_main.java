package com.example.health_friend;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Delayed;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Zixun_main extends Activity {

	int min =0;
	int max =4;
	Random random =new Random();
	int num =random.nextInt(max)%(max-min+1)+min;
	String ma[]={ "熬得住，出众，熬不过，出局！人生总有一些不如意的事，关键在于熬","时光如此珍贵，只是我们一去不回。我的执着，是因为，你值得" , 
			"真正遇到安全或者危险的时候，所谓的起跑线力量微乎其微","生活有时不尽如人意。我们挣扎、哭泣，有时甚至放弃。但内心始终充满爱" ,"被特别在乎的人忽略了，会很难过，而更难过的是，你还要装作不在乎"};
	TextView tx;
	Button in1,in2,in3,in4,in5,in6,in7,in8,in9,in10;
	String NOTI_ACTION = "com.example.zixuntest.notification";
	NotificationManager mNotificationManager;
	
	ImageView imageView1,imageView2, imageView3;
	

	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zixun_main);
		Intent intent=getIntent();
		findid();
		xiaoxi();
	    //imageView1.setVisibility(View.INVISIBLE);
		

		        
		    
		

		
		in1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixunitem1.class);
				startActivity(intent1);
				
			}
		});
         in2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem2.class);
				startActivity(intent1);
				
			}
		});
         in3.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem3.class);
				startActivity(intent1);
				
			}
		});
         in4.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem4.class);
				startActivity(intent1);
				
			}
		});
         in5.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem5.class);
				startActivity(intent1);
				
			}
		});
         in6.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem6.class);
				startActivity(intent1);
				
			}
		});
         in7.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem7.class);
				startActivity(intent1);
				
			}
		});
         in8.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem8.class);
				startActivity(intent1);
				
			}
		});
         in9.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem9.class);
				startActivity(intent1);
				
			}
		});
         in10.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem10.class);
				startActivity(intent1);
				
			}
		});
         tx.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixun_more.class);
				startActivity(intent1);
			}
		});
	}
	
	//随机向用户发送鸡汤
	private void xiaoxi() {
		// TODO 自动生成的方法存根
		String service = Context.NOTIFICATION_SERVICE;         
		mNotificationManager = (NotificationManager) getSystemService(service);   //获得系统级服务，用于管理消息
		Notification n = new Notification();     //定义一个消息类
		
		n.icon = R.drawable.mainicon;                                //设置图标
		n.tickerText = "Notification";  // 设置消息
		n.when = System.currentTimeMillis();                             //设置时间
		// Notification n1 =new Notification(icon,tickerText,when);    //也可以用这个构造创建
		Intent intent = new Intent(Zixun_main.this,Zixun_main.class);       
		PendingIntent pi = PendingIntent.getActivity(Zixun_main.this, 0,intent, 0);       //消息触发后调用
		n.setLatestEventInfo(Zixun_main.this, "每日一语",ma[num] ,pi); //设置事件信息就是拉下标题后显示的内容
		mNotificationManager .notify(1, n);      //发送通知
	}
//绑定控件
	private void findid() {
		// TODO 自动生成的方法存根
		tx = (TextView) findViewById(R.id.text_title);
		in1 =(Button) findViewById(R.id.zixun_item1);
		in2 =(Button) findViewById(R.id.zixun_item2);
		in3 =(Button) findViewById(R.id.zixun_item3);
		in4 =(Button) findViewById(R.id.zixun_item4);
		in5 =(Button) findViewById(R.id.zixun_item5);
		in6 =(Button) findViewById(R.id.zixun_item6);
		in7 =(Button) findViewById(R.id.zixun_item7);
		in8 =(Button) findViewById(R.id.zixun_item8);
		in9 =(Button) findViewById(R.id.zixun_item9);
		in10 =(Button) findViewById(R.id.zixun_item10);
		imageView1=(ImageView) findViewById(R.id.IM1);
		tx=(TextView) findViewById(R.id.text_title);
		
	}

		


}
