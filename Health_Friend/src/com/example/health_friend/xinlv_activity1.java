package com.example.health_friend;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.DatePicker.OnDateChangedListener;

public class xinlv_activity1 extends Activity{
	//SharedPreferences call_help;
	
	private DatePicker datePicker_weight;
	private TimePicker timePicker_weight;

	private TextView textview;
	private Calendar calander;
	private int year;
    private int month;
	private int day;
	boolean date_open = false;
	LinearLayout linear_date;
	
	private Button but_save;
	private EditText edittive;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xinlv_layout1);
		
		/*Intent intent_1=getIntent();
		String call_call=intent_1.getStringExtra("send_call");
		System.out.println("=========================="+call_call);
		Context context=xinlv_activity1.this;
		call_help=context.getSharedPreferences("call_help",MODE_APPEND);
		SharedPreferences.Editor editor_call_help=call_help.edit();
		
		editor_call_help.putString("call_help_call", call_call);
		editor_call_help.commit();*/
		
		
		 datePicker_weight=(DatePicker) findViewById(R.id. DatePicker_xinlv);
		 timePicker_weight=(TimePicker) findViewById(R.id.timePicker_xinlv);
		 
		 textview=(TextView) findViewById(R.id.xinlv_text);
		 linear_date = (LinearLayout) findViewById(R.id.xinlv_date_linearlayout);
		 
		 but_save=(Button) findViewById(R.id.xinlv_save);
		 
		 calander=Calendar.getInstance();
	     year=calander.get(Calendar.YEAR);
	     month=calander.get(Calendar.MONTH+1);
	     day=calander.get(Calendar.DAY_OF_YEAR);
	     
	     SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss");
         String str1=sdf1.format(new Date());
         
         textview.setText(str1);//year+"年"+month+"月"+day+"日");
	     datePicker_weight.init(year,month,day, new MyDateChangeListener());
	  
	     textview.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (date_open) {
						linear_date.setVisibility(View.GONE);
						date_open = false;
						
					} else {
						linear_date.setVisibility(View.VISIBLE);
						date_open = true;
					}
				}
			});
	     but_save.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					//Toast.makeText(xinlv_activity1.this, "上传成功",  Toast.LENGTH_SHORT).show();
					
					 edittive=(EditText) findViewById(R.id.xinlv_edit);
					 String inputText=edittive.getText().toString();
					 edittive.setInputType( InputType.TYPE_CLASS_NUMBER);//输入为数字
					 
					 String inputText2=textview.getText().toString();
					 
					 //判断是否输入了值
					 String serch_textip=edittive.getText().toString().trim();
		                if(serch_textip.length()==0)                              //判断IP输入框是否为空
		                {
		                	Toast.makeText(xinlv_activity1.this, "请输入您的心率", Toast.LENGTH_SHORT).show();
		                }

		                else{
		                	int xintiao = Integer.parseInt(inputText); 
		                	if(xintiao>200){
		                		 //String read_call=call_help.getString("call_help_call", "not exit");
		         				// 1. 到了拨号界面，但是实际的拨号是由用户点击实现的。
		         				//Intent intent = new Intent(Intent.ACTION_DIAL);
		         				// 2. 对用户没有提示，直接拨打电话
		         				 /*Intent intent0 = new Intent(Intent.ACTION_CALL);
		         				Uri data_0 = Uri.parse("tel:" + read_call);
		         				intent0.setData(data_0);
		         				startActivity(intent0);*/
		                		int i=1;
		                		Intent intent=new Intent();
		                		intent.setClass(xinlv_activity1.this, save.class);
		                		intent.putExtra("a",i);
		                		xinlv_activity1.this.startActivity(intent);
		                	}
		                	else{      	
					Intent intent=new Intent();
					intent.setClass(xinlv_activity1.this,xinlv_activity2.class);
					intent.putExtra("data",inputText);
					intent.putExtra("data2", inputText2);
					xinlv_activity1.this.startActivity(intent);
		                }
		                	}
				}
			});

	    
	}
private class MyDateChangeListener implements OnDateChangedListener{
		
		@Override
		public void onDateChanged(DatePicker arg0, int nowyear, int nowmonth, int nowday) {
			// TODO Auto-generated method stub
			year=nowyear;
			month=nowmonth;
			day=nowday;
			textview.setText(year+"年"+month+"月"+day+"日");
		}
	}

}
