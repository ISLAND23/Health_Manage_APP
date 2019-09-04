
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
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.DatePicker.OnDateChangedListener;

public class xueya_activity1 extends Activity {
	private DatePicker datePicker_weight;
	private TimePicker timePicker_weight;

	private TextView textview;
	private Calendar calander;
	private int year;
	 private int month;
	private int day;
	
	boolean date_open = false;
	LinearLayout linear_date;
	
	Button but_save;
	private EditText edittive;
	private EditText edittive2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xueya);
		
		datePicker_weight=(DatePicker) findViewById(R.id.DatePicker_xueya);
		 timePicker_weight=(TimePicker) findViewById(R.id.timePicker_xueya);
		 
		 textview=(TextView) findViewById(R.id.xueya_gettime);
		 linear_date = (LinearLayout) findViewById(R.id.xueya_date_linearlayout);
		 
		 but_save=(Button) findViewById(R.id.xueya_save);
				 
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
					 edittive=(EditText) findViewById(R.id.xueya_editext);
					 String inputText=edittive.getText().toString();
					 edittive.setInputType( InputType.TYPE_CLASS_NUMBER);//输入为数字
					 
					 edittive2=(EditText) findViewById(R.id.xueya_editext2);
					 String inputText2=edittive2.getText().toString();
					 edittive2.setInputType( InputType.TYPE_CLASS_NUMBER);//输入为数字
					 
					 String inputText3=textview.getText().toString();
					 
					 String serch_textip=edittive.getText().toString().trim();
					 String serch_textip2=edittive2.getText().toString().trim();
		                if(serch_textip.length()==0 || serch_textip2.length()==0)                              //判断IP输入框是否为空
		                {
		                	Toast.makeText(xueya_activity1.this, "请输入您的血压", Toast.LENGTH_SHORT).show();
		                }

		                else{	
					Intent intent=new Intent();
					intent.putExtra("data",inputText);
					 intent.putExtra("data2",inputText2);
					 intent.putExtra("data3",inputText3);
					intent.setClass(xueya_activity1.this,xueya_activity2.class);
					xueya_activity1.this.startActivity(intent);
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