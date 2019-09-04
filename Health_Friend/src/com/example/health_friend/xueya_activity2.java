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
			  text_return.setText("您的血压测量值低于正常,若无明显症状建议随时观察血压波动，注意体位变换。若感到不适请及时咨询医生。注意调节饮食，加强营养，荤素兼吃，合理搭配膳食,保证摄入全面充足的营养物质，使体质从纤弱逐渐变得健壮，晚. 上睡觉将头部垫高，可减轻低血压症状。锻炼身体,增强体质。平时养成运动的习惯，培养开朗的个性，保证足够的睡眠、规律正常的生活。");
		  }
		  else if(i>=70 && i<120)
		  { 
			  text_return.setText("您的血压基本正常，情况良好哦！请继续平时注意规律适度运动，饮食规律，保证充足的睡眠，多吃新鲜蔬菜和水果，低盐低脂饮食。");
		  }
		  else if(i>=120 && i<150)
		  {
			  text_return.setText("您本次血压测量值正常偏高，请采取健康的生活方式，低盐饮食，戒烟限酒，补充钙钾，加强锻炼，保持心情平和，定期监测血压，密切关注血压变化。");
		  }
		  else
		  {
			   text_return.setText("您的血压状况不太理想哦，已经到了高血压，请放松心情，避免情绪激动，定期监测血压，密切关注血压变化，及时就医，配合治疗。");
		  }
	}

}
