package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class weight_activity2 extends Activity{
	private TextView textview,textview2,textview_return_text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weight_layout2);
		 textview=(TextView) findViewById(R.id.weight_get_text);
		 textview_return_text=(TextView) findViewById(R.id.weight_return_text);
		 textview2=(TextView) findViewById(R.id.weight_getdate_text);
		   
		   String receivedata=getIntent().getStringExtra("data");
		   textview.setText(receivedata);
		   
		   String receivedata2=getIntent().getStringExtra("data2");
		   textview2.setText(receivedata2);
		   
		   int i=Integer.parseInt(receivedata);
		   
		  if(i>0 && i<40)
		  {
			  textview_return_text.setText("����BMI��ʾ���ᣬ������������ʳ������ʽ������ʳ����ֻ������������������ĵ��������˲����𽥱���Ŷ��");
		  }
		  else if(i>=40&& i<65)
		  {
			  textview_return_text.setText("����BMI��������������������������أ�������ʳ���й��ɵĶ����Ǻܱ�Ҫ�ġ���ᷢ�����Ѫѹ��Ѫ֬��Ѫ�Ƕ������Խ��͡�");
		  }
		  else if(i>=65&& i<78)
		  {
			  textview_return_text.setText("���ѳ��أ���Ҫ���������ˡ�ÿ����45���ӵ�1��Сʱ�������˶�Ϊ�ˣ��������ܡ���Ӿ�ȡ����⣬�����һЩ����ѵ�����������Ժ����Ӽ��⡢ǿ׳���������á�");
		  }
		  else
		  {
			  textview_return_text.setText("����BMI�Ѵ���28��Ӧ��������ʰɣ���Ҫ�õ�ҽʦ��Ӫ��ʦ��ָ������Ϊ������һ�����Բ���û��רҵָ�����뵱Ȼ�ļ��ʻ����鷳.");
		  }	
	}
@Override
protected void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();

}
}
