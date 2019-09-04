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
    	text_return.setText("亲，您的血糖偏低，请立即进食并停止运动，建议经常随身携带小糖块以备不时之需！");
	  }
	  else if(i>=4&& i<8)
	  {
		  text_return.setText("您的血糖正常，请继续保持！建议定期监测血糖，随时了解血糖的变化。健康饮食的秘诀是少油少盐，新鲜天然，提高单位重量食物中的营养质量，万不可因为控糖，而让自己每天陷入饥饿的痛苦当中。");
	  }
	  else if(i>=8&& i<12)
	  {
		  text_return.setText("亲，您的血糖疑似糖尿病前期了，糖尿病前期的干预以生活方式干预为主，即控制饮食、增加运动、减轻体重等。有研究表明，体重减轻1公斤，糖尿病前期进展为糖尿病的风险就能减少16%;行动起来，控制血糖从控制您的体重开始吧!还要注意定期监测,血糖哦!");
	  }
	  else
	  {
		  text_return.setText("亲，您的血糖已经达到糖尿病了，建议您定期监测血糖,并就医明确诊断，制定合适的治疗方案或调整原有的控制方案;饮食，上建议控制碳水化合物的量,可搭配一些低升糖指数食物 ,如全谷类和蔬菜,会让血糖上升缓慢!");
	  }

	}
}
