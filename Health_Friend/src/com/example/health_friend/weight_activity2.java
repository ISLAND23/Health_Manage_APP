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
			  textview_return_text.setText("您的BMI显示过轻，建议您均衡饮食并渐进式的增加食欲，只有摄入的能量大于消耗的能量，人才能逐渐变胖哦！");
		  }
		  else if(i>=40&& i<65)
		  {
			  textview_return_text.setText("您的BMI处于正常，请继续保持理想体重，健康饮食和有规律的锻炼是很必要的。你会发现你的血压、血脂和血糖都会明显降低。");
		  }
		  else if(i>=65&& i<78)
		  {
			  textview_return_text.setText("您已超重，需要控制体重了。每天坚持45分钟到1个小时的有氧运动为宜，比如慢跑、游泳等。此外，配合做一些力量训练，能起到塑性和增加肌肉、强壮骨骼的作用。");
		  }
		  else
		  {
			  textview_return_text.setText("您的BMI已大于28，应当尽早减肥吧，并要得到医师或营养师的指导。因为肥胖是一种慢性病，没有专业指导的想当然的减肥会有麻烦.");
		  }	
	}
@Override
protected void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();

}
}
