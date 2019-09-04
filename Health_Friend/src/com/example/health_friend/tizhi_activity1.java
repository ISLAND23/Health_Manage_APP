package com.example.health_friend;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tizhi_activity1 extends Activity {
	
	private TextView textview;
	
	private Button but_save;
	private EditText edittive,edittive2,edittive3,edittive4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tizhi);
		
		 textview=(TextView) findViewById(R.id.text_tizhi);
		 
		 but_save=(Button) findViewById(R.id.tizhi_save);
		
	     SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss");
         String str=sdf.format(new Date());
         
	     textview.setText(str);//year+"年"+month+"月"+day+"日");
	     but_save.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 edittive=(EditText) findViewById(R.id.tizhi_edittext);
					 String inputText=edittive.getText().toString();
					 edittive.setInputType( InputType.TYPE_CLASS_NUMBER);//输入为数字
					 
					 edittive2=(EditText) findViewById(R.id.tizhi_jirou_edittixt);
					 String inputText_jirou=edittive2.getText().toString();
					 edittive2.setInputType( InputType.TYPE_CLASS_NUMBER);//输入为数字
					 
					 edittive3=(EditText) findViewById(R.id.tizhi_guge_edittixt);
					 String inputText_guge=edittive3.getText().toString();
					 edittive3.setInputType( InputType.TYPE_CLASS_NUMBER);//输入为数字
					 
					 edittive4=(EditText) findViewById(R.id.tizhi_shuifen_edittixt);
					 String inputText_shuifen=edittive4.getText().toString();
					 edittive4.setInputType( InputType.TYPE_CLASS_NUMBER);//输入为数字
					 
					 String inputText2=textview.getText().toString();
					 
					 String serch_textip=edittive.getText().toString().trim();
		                if(serch_textip.length()==0)                              //判断IP输入框是否为空
		                {
		                	Toast.makeText(tizhi_activity1.this, "请输入您的体脂", Toast.LENGTH_SHORT).show();
		                }

		                else{
					Intent intent=new Intent();
					intent.setClass(tizhi_activity1.this,tizhi_activity2.class);
					intent.putExtra("data",inputText);
					intent.putExtra("data2",inputText_jirou);
					intent.putExtra("data3",inputText_guge);
					intent.putExtra("data4",inputText_shuifen);
					intent.putExtra("data5",inputText2);
					tizhi_activity1.this.startActivity(intent);}

				}
			});     
	     
	}

}
