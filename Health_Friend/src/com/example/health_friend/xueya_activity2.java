package com.example.health_friend;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class xueya_activity2 extends Activity {
	private TextView textview;
private TextView textview2,textview3,text_return;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xueya_layout2);
		
		  textview=(TextView) findViewById(R.id.xueya_get_text);
          textview2=(TextView) findViewById(R.id.xueya_get_text2);
          textview3=(TextView) findViewById(R.id.xueya_getdate_text);
          text_return=(TextView) findViewById(R.id.xueya_return_text);
		   
		   String receivedata=getIntent().getStringExtra("data");
		   textview.setText(receivedata);
		   
		  String receivedata2=getIntent().getStringExtra("data2");
		  textview2.setText(receivedata2);
		  
		  String receivedata3=getIntent().getStringExtra("data3");
		  textview3.setText(receivedata3);
		  
		  int i=Integer.parseInt(receivedata);
		  
		  if( i>0 && i<70 )
		  {
			  text_return.setText("����Ѫѹ����ֵ��������,��������֢״������ʱ�۲�Ѫѹ������ע����λ�任�����е������뼰ʱ��ѯҽ����ע�������ʳ����ǿӪ�������ؼ�ԣ����������ʳ,��֤����ȫ������Ӫ�����ʣ�ʹ���ʴ������𽥱�ý�׳����. ��˯����ͷ����ߣ��ɼ����Ѫѹ֢״����������,��ǿ���ʡ�ƽʱ�����˶���ϰ�ߣ��������ʵĸ��ԣ���֤�㹻��˯�ߡ��������������");
		  }
		  else if(i>=70 && i<120)
		  { 
			  text_return.setText("����Ѫѹ�����������������Ŷ�������ƽʱע������ʶ��˶�����ʳ���ɣ���֤�����˯�ߣ���������߲˺�ˮ�������ε�֬��ʳ��");
		  }
		  else if(i>=120 && i<150)
		  {
			  text_return.setText("������Ѫѹ����ֵ����ƫ�ߣ����ȡ���������ʽ��������ʳ�������޾ƣ�����Ƽأ���ǿ��������������ƽ�ͣ����ڼ��Ѫѹ�����й�עѪѹ�仯��");
		  }
		  else
		  {
			   text_return.setText("����Ѫѹ״����̫����Ŷ���Ѿ����˸�Ѫѹ����������飬�����������������ڼ��Ѫѹ�����й�עѪѹ�仯����ʱ��ҽ��������ơ�");
		  }
	}

}
