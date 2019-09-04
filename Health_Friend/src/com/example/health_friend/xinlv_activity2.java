package com.example.health_friend;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class xinlv_activity2 extends Activity {
	//SharedPreferences call_help;
	private TextView textview,textview2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xinlv_layout2);
		Intent intent=getIntent();
		//Intent intent_1=getIntent();
		//String call_call=intent_1.getStringExtra("send_call");
		//System.out.println("=========================="+call_call);
		
		//Context context=xinlv_activity2.this;
		//call_help=context.getSharedPreferences("call_help",MODE_APPEND);
		
		//SharedPreferences.Editor editor_call_help=call_help.edit();
		//editor_call_help.putString("call_help_call", call_call);
		//editor_call_help.commit();
		
		textview=(TextView) findViewById(R.id.xinlv_get_text);
		textview2=(TextView) findViewById(R.id.xinlv_getdate_text);
		
		 String receivedata=getIntent().getStringExtra("data");
		   textview.setText(receivedata);
		   System.out.println("============="+receivedata);
		   
		   
		  
		   //if(xintiao>200)
		  /* {
			   String read_call=call_help.getString("call_help_call", "not exit");
				// 1. 到了拨号界面，但是实际的拨号是由用户点击实现的。
				//Intent intent = new Intent(Intent.ACTION_DIAL);
				// 2. 对用户没有提示，直接拨打电话
				 Intent intent0 = new Intent(Intent.ACTION_CALL);
				Uri data_0 = Uri.parse("tel:" + read_call);
				intent0.setData(data_0);
				startActivity(intent);

			   
			   
		   }*/
		   
		   
		 
		   String receivedata2=getIntent().getStringExtra("data2");
		   textview2.setText(receivedata2);
		  
	}

}
