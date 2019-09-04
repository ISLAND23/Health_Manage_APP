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
		
	     SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��   HH:mm:ss");
         String str=sdf.format(new Date());
         
	     textview.setText(str);//year+"��"+month+"��"+day+"��");
	     but_save.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 edittive=(EditText) findViewById(R.id.tizhi_edittext);
					 String inputText=edittive.getText().toString();
					 edittive.setInputType( InputType.TYPE_CLASS_NUMBER);//����Ϊ����
					 
					 edittive2=(EditText) findViewById(R.id.tizhi_jirou_edittixt);
					 String inputText_jirou=edittive2.getText().toString();
					 edittive2.setInputType( InputType.TYPE_CLASS_NUMBER);//����Ϊ����
					 
					 edittive3=(EditText) findViewById(R.id.tizhi_guge_edittixt);
					 String inputText_guge=edittive3.getText().toString();
					 edittive3.setInputType( InputType.TYPE_CLASS_NUMBER);//����Ϊ����
					 
					 edittive4=(EditText) findViewById(R.id.tizhi_shuifen_edittixt);
					 String inputText_shuifen=edittive4.getText().toString();
					 edittive4.setInputType( InputType.TYPE_CLASS_NUMBER);//����Ϊ����
					 
					 String inputText2=textview.getText().toString();
					 
					 String serch_textip=edittive.getText().toString().trim();
		                if(serch_textip.length()==0)                              //�ж�IP������Ƿ�Ϊ��
		                {
		                	Toast.makeText(tizhi_activity1.this, "������������֬", Toast.LENGTH_SHORT).show();
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
