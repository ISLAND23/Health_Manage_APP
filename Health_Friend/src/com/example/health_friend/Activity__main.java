package com.example.health_friend;



import android.app.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity__main extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.data);
		Button but1=(Button) findViewById(R.id.sport1);
		Button but2=(Button) findViewById(R.id.sleep);
		Button but3=(Button) findViewById(R.id.weight);
		Button but4=(Button) findViewById(R.id.xueya);
		Button but5=(Button) findViewById(R.id.xuetang);
		Button but6=(Button) findViewById(R.id.xinlv);
		Button but7=(Button) findViewById(R.id.tizhi);
		Button but8=(Button) findViewById(R.id.weidu);
		
		but1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(Activity__main.this, sport_first.class);
				Activity__main.this.startActivity(intent);
			}
		});
		
		
		but2.setOnClickListener(new Onbuttonlistener2());
		but3.setOnClickListener(new Onbuttonlistener3());
		but4.setOnClickListener(new Onbuttonlistener4());
		but5.setOnClickListener(new Onbuttonlistener5());
		but6.setOnClickListener(new Onbuttonlistener6());
		but7.setOnClickListener(new Onbuttonlistener7());
		but8.setOnClickListener(new Onbuttonlistener8());
		
	}
	/*	class Onbuttonlistener1 implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(Activity__main.this, sport_first.class);
				Activity__main.this.startActivity(intent);
			}
		}*/
		class Onbuttonlistener2 implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(Activity__main.this, sleep1.class);
				Activity__main.this.startActivity(intent);
			}
		}
		class Onbuttonlistener3 implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(Activity__main.this, weight_layout1_activity.class);
				Activity__main.this.startActivity(intent);
			}
		}
		class Onbuttonlistener4 implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(Activity__main.this, xueya_activity1.class);
				Activity__main.this.startActivity(intent);
			}
		}
		class Onbuttonlistener5 implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(Activity__main.this, xuetang_activity1.class);
				Activity__main.this.startActivity(intent);
			}
		}
		class Onbuttonlistener6 implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(Activity__main.this, xinlv_activity1.class);
				Activity__main.this.startActivity(intent);
			}
		}


		class Onbuttonlistener7 implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(Activity__main.this, tizhi_activity1.class);
				Activity__main.this.startActivity(intent);
			}
		}
		class Onbuttonlistener8 implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(Activity__main.this, wendu_activity1.class);
				Activity__main.this.startActivity(intent);
			}
		}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

}
