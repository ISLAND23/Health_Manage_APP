package com.example.health_friend;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class tizhi_activity2 extends Activity {
	private TextView textview,textview2,textview3,textview4,textview5;
	private TextView textview_reture;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tizhi2);
		
		 textview=(TextView) findViewById(R.id.tizhi_get_text);
		 textview2=(TextView) findViewById(R.id.tizhi_jirou);
		 textview3=(TextView) findViewById(R.id.tizhi_guge);
		 textview4=(TextView) findViewById(R.id.tizhi_shuifen);
		 textview5=(TextView) findViewById(R.id.tizhi_getdate_text);
		 textview_reture=(TextView) findViewById(R.id.tizhi_return_text);
		   
		   String receivedata=getIntent().getStringExtra("data");
		   textview.setText(receivedata);
		   
		   String receivedata2=getIntent().getStringExtra("data2");
		   textview2.setText(receivedata2+"kg");
		   
		   String receivedata3=getIntent().getStringExtra("data3");
		   textview3.setText(receivedata3+"kg");
		   
		   String receivedata4=getIntent().getStringExtra("data4");
		   textview4.setText(receivedata4+"%");
		   
		   String receivedata5=getIntent().getStringExtra("data5");
		   textview5.setText(receivedata5);
		   
		   int i=Integer.parseInt(receivedata);
		   if(i>0 && i<13)
			  {
			   textview_reture.setText("�ף�������֬��ƫ�ͣ���������֬�ʶ���Ů����˵֬�������Եͣ�ֻ�н����˶�Ա�Ż�ﵽ���״̬���������������״̬��");
			  }
			  else if(i>=13&& i<20)
			  {
				  textview_reture.setText("���״̬�������ǽ����Ľ���״̬���Ǽ�����������������״̬��");
			  }
			  else if(i>=20&& i<25)
			  {
				  textview_reture.setText("���ǵ��㾡����һЩ���⣬�������ı�����Ů����˵������ģ���������Ŷ��");
			  }
			  else if(i>=25&& i<32)
			  {
				  textview_reture.setText("���ڵ���ȫ�����λ֬��������������֬�������ɳڣ���������¶�������ʵ���֬��");
			  }
			
			  else
			  {
				  textview_reture.setText("���Ѿ��Ƿ����ˣ���������Ϊ�˶����㡢Ӫ����ʣ��ɵģ����ֳ��Ტ���������Բ������Խ�������ȥ���ʡ�");
			  }
	}

}
