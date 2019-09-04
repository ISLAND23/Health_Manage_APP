package com.example.health_friend;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SportStart extends Activity{
	Button btn_cancle;
	TextView tv,textshow1,textshow2,textshow3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startsport);
		
		btn_cancle = (Button) findViewById(R.id.btn_cancel);
		tv = (TextView) findViewById(R.id.tv);
		textshow1 = (TextView) findViewById(R.id.text_show1);
		textshow2 = (TextView) findViewById(R.id.text_show2);
		textshow3 = (TextView) findViewById(R.id.text_show3);
		
		String data1 = getIntent().getStringExtra("spn_zhouqi");
		textshow1.setText(data1);
		
		String data2 = getIntent().getStringExtra("spn_pinlv");
		textshow2.setText(data2);
		
		String data3 = getIntent().getStringExtra("spn_juli");
		textshow3.setText(data3);
		
		final AlertDialog.Builder builder = new AlertDialog.Builder(this);
		btn_cancle.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				builder.setMessage("你确定要终止当前的计划吗？").setPositiveButton("确定", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO 自动生成的方法存根
						tv.setText("成功取消当前计划");
						textshow1.setText("请选择");
						textshow2.setText("请选择");
						textshow3.setText("请选择");
					}
				}).setNegativeButton("取消",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO 自动生成的方法存根
						tv.setText("取消终止计划");
					}
				});
				AlertDialog ad = builder.create();
				ad.show();
			}
		});
	}

}
