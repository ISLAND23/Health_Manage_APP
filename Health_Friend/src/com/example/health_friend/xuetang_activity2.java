package com.example.health_friend;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class xuetang_activity2 extends Activity {

	private TextView textview1;
	private TextView textview2;
	private TextView text_return;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xuetang_layout2);
		
   textview1=(TextView) findViewById(R.id.xuetang_get_text);
   String receivedata=getIntent().getStringExtra("data");
   textview1.setText(receivedata);
   
   textview2=(TextView) findViewById(R.id.xuetang_getdate_text);
   String receivedata2=getIntent().getStringExtra("data2");
   textview2.setText(receivedata2);
   
   text_return=(TextView) findViewById(R.id.xuetang_return_text);
  
  
    int i=Integer.parseInt(receivedata);
    
    if(i>0 && i<4)
	  {
    	text_return.setText("�ף�����Ѫ��ƫ�ͣ���������ʳ��ֹͣ�˶������龭������Я��С�ǿ��Ա���ʱ֮�裡");
	  }
	  else if(i>=4&& i<8)
	  {
		  text_return.setText("����Ѫ����������������֣����鶨�ڼ��Ѫ�ǣ���ʱ�˽�Ѫ�ǵı仯��������ʳ���ؾ����������Σ�������Ȼ����ߵ�λ����ʳ���е�Ӫ���������򲻿���Ϊ���ǣ������Լ�ÿ�����뼢����ʹ�൱�С�");
	  }
	  else if(i>=8&& i<12)
	  {
		  text_return.setText("�ף�����Ѫ����������ǰ���ˣ�����ǰ�ڵĸ�Ԥ�����ʽ��ԤΪ������������ʳ�������˶����������صȡ����о����������ؼ���1�������ǰ�ڽ�չΪ���򲡵ķ��վ��ܼ���16%;�ж�����������Ѫ�Ǵӿ����������ؿ�ʼ��!��Ҫע�ⶨ�ڼ��,Ѫ��Ŷ!");
	  }
	  else
	  {
		  text_return.setText("�ף�����Ѫ���Ѿ��ﵽ�����ˣ����������ڼ��Ѫ��,����ҽ��ȷ��ϣ��ƶ����ʵ����Ʒ��������ԭ�еĿ��Ʒ���;��ʳ���Ͻ������̼ˮ���������,�ɴ���һЩ������ָ��ʳ�� ,��ȫ������߲�,����Ѫ����������!");
	  }

	}
}
