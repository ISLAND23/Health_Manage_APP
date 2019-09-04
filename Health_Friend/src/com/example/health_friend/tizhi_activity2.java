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
			   textview_reture.setText("亲，您的体脂率偏低，这样的体脂率对于女生来说脂肪比例略低，只有健美运动员才会达到这个状态，但并不是最健康的状态。");
			  }
			  else if(i>=13&& i<20)
			  {
				  textview_reture.setText("这个状态基本都是健身房的教练状态，是几乎所有人最向往的状态。");
			  }
			  else if(i>=20&& i<25)
			  {
				  textview_reture.setText("这是的你尽管有一些肉肉，但这样的比例对女生来说是最健康的，继续保持哦！");
			  }
			  else if(i>=25&& i<32)
			  {
				  textview_reture.setText("现在的你全身各部位脂肪，尤其腰腹部脂肪明显松弛，腹肌不显露，建议适当减脂了");
			  }
			
			  else
			  {
				  textview_reture.setText("你已经是肥胖了，可能是因为运动不足、营养过剩造成的，肥胖常会并发多种慢性病，所以建议立刻去减肥。");
			  }
	}

}
