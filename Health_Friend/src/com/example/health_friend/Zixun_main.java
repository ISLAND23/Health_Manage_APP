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
	String ma[]={ "����ס�����ڣ������������֣���������һЩ��������£��ؼ����ڰ�","ʱ��������ֻ������һȥ���ء��ҵ�ִ�ţ�����Ϊ����ֵ��" , 
			"����������ȫ����Σ�յ�ʱ����ν������������΢����΢","������ʱ���������⡣������������������ʱ����������������ʼ�ճ�����" ,"���ر��ں����˺����ˣ�����ѹ��������ѹ����ǣ��㻹Ҫװ�����ں�"};
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
				// TODO �Զ����ɵķ������
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixunitem1.class);
				startActivity(intent1);
				
			}
		});
         in2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO �Զ����ɵķ������
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem2.class);
				startActivity(intent1);
				
			}
		});
         in3.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO �Զ����ɵķ������
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem3.class);
				startActivity(intent1);
				
			}
		});
         in4.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO �Զ����ɵķ������
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem4.class);
				startActivity(intent1);
				
			}
		});
         in5.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO �Զ����ɵķ������
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem5.class);
				startActivity(intent1);
				
			}
		});
         in6.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO �Զ����ɵķ������
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem6.class);
				startActivity(intent1);
				
			}
		});
         in7.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO �Զ����ɵķ������
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem7.class);
				startActivity(intent1);
				
			}
		});
         in8.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO �Զ����ɵķ������
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem8.class);
				startActivity(intent1);
				
			}
		});
         in9.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO �Զ����ɵķ������
				Intent intent1 =new Intent();
				intent1.setClass(Zixun_main.this,Zixinitem9.class);
				startActivity(intent1);
				
			}
		});
         in10.setOnClickListener(new OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO �Զ����ɵķ������
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
	
	//������û����ͼ���
	private void xiaoxi() {
		// TODO �Զ����ɵķ������
		String service = Context.NOTIFICATION_SERVICE;         
		mNotificationManager = (NotificationManager) getSystemService(service);   //���ϵͳ���������ڹ�����Ϣ
		Notification n = new Notification();     //����һ����Ϣ��
		
		n.icon = R.drawable.mainicon;                                //����ͼ��
		n.tickerText = "Notification";  // ������Ϣ
		n.when = System.currentTimeMillis();                             //����ʱ��
		// Notification n1 =new Notification(icon,tickerText,when);    //Ҳ������������촴��
		Intent intent = new Intent(Zixun_main.this,Zixun_main.class);       
		PendingIntent pi = PendingIntent.getActivity(Zixun_main.this, 0,intent, 0);       //��Ϣ���������
		n.setLatestEventInfo(Zixun_main.this, "ÿ��һ��",ma[num] ,pi); //�����¼���Ϣ�������±������ʾ������
		mNotificationManager .notify(1, n);      //����֪ͨ
	}
//�󶨿ؼ�
	private void findid() {
		// TODO �Զ����ɵķ������
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
