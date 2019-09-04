package com.example.health_friend;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TimePicker;
import android.widget.Toast;

import android.widget.TextView;


public class weight_layout1_activity extends Activity {
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
		setContentView(R.layout.weight_layout1);
		 datePicker_weight=(DatePicker) findViewById(R.id.DatePicker_weight);
		 timePicker_weight=(TimePicker) findViewById(R.id.timePicker_weight);
		 
		 textview=(TextView) findViewById(R.id.text_weight);
		 linear_date = (LinearLayout) findViewById(R.id.weight_date_linearlayout);
		 
		 but_save=(Button) findViewById(R.id.weight_save);
				 
		 calander=Calendar.getInstance();
	     year=calander.get(Calendar.YEAR);
	     month=calander.get(Calendar.MONTH+1);
	     day=calander.get(Calendar.DAY_OF_YEAR);
	    
	     
	     SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss");
         String str=sdf.format(new Date());
	    
	     textview.setText(str);//year+"年"+month+"月"+day+"日");
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
					 edittive=(EditText) findViewById(R.id.weight_edittext);
					 edittive.setInputType( InputType.TYPE_CLASS_NUMBER);//输入为数字
					 
					 String inputText=edittive.getText().toString();	 
					 String inputText2=textview.getText().toString();
					 
					 //判断是否输入了值
					 String serch_textip=edittive.getText().toString().trim();
		                if(serch_textip.length()==0)                              //判断IP输入框是否为空
		                {
		                	Toast.makeText(weight_layout1_activity.this, "请输入您的体重", Toast.LENGTH_SHORT).show();
		                }

		                else{		         
					Intent intent=new Intent();
					intent.setClass(weight_layout1_activity.this,weight_activity2.class);
					intent.putExtra("data",inputText);
					intent.putExtra("data2",inputText2);
					weight_layout1_activity.this.startActivity(intent);}

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