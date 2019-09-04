package com.example.health_friend;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.Toast;

public class wendu_activity1 extends Activity{
	private DatePicker datePicker_weight;
	private TimePicker timePicker_weight;
	EditText editText;
	private TextView textview;
	private Calendar calander;
	private int year;
	 private int month;
	private int day;
	
	boolean date_open = false;
	LinearLayout linear_date;
	Button but_save;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wendu_layout1);
		datePicker_weight=(DatePicker) findViewById(R.id.DatePicker_wendut);
		 timePicker_weight=(TimePicker) findViewById(R.id.timePicker_wendu);
		 
		 textview=(TextView) findViewById(R.id.text_wendu);
		 linear_date = (LinearLayout) findViewById(R.id.wendu_date_linearlayout);
		 editText=(EditText) findViewById(R.id.wdEDIT);
		 but_save=(Button) findViewById(R.id.wendu_save);
				 
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
				Toast.makeText(wendu_activity1.this, "保存成功",  Toast.LENGTH_SHORT).show();
				
				Intent intent=new Intent();
				intent.setClass(wendu_activity1.this,wendu_activity2.class);
				String str=editText.getText().toString();
				intent.putExtra("fromMain", str);
				
				wendu_activity1.this.startActivity(intent);

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
