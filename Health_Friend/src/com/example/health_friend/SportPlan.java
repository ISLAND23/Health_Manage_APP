package com.example.health_friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class SportPlan extends Activity{
	Spinner spn_zhouqi,spn_pinlv,spn_juli;
	Button btn_build;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.plan_sport);
		
		spn_zhouqi = (Spinner) findViewById(R.id.spn_zhouqi);
		spn_pinlv = (Spinner) findViewById(R.id.spn_pinlv);
		spn_juli = (Spinner) findViewById(R.id.spn_juli);
		
		String[] zhouqi = {"7��","�����","һ����"};
		ArrayAdapter<String> zhouqi_adapter = new ArrayAdapter<String>(SportPlan.this,
				android.R.layout.simple_dropdown_item_1line,zhouqi);
		spn_zhouqi.setAdapter(zhouqi_adapter);
		
		String[] pinlv = {"1��1���˶�","2��1���˶�","һ����1���˶�"};
		ArrayAdapter<String> pinlv_adapter = new ArrayAdapter<String>(SportPlan.this,
				android.R.layout.simple_dropdown_item_1line,pinlv);
		spn_pinlv.setAdapter(pinlv_adapter);
		
		String[] juli = {"1����","2����","5����","10����"};
		ArrayAdapter<String> juli_adapter = new ArrayAdapter<String>(SportPlan.this,
				android.R.layout.simple_dropdown_item_1line,juli);
		spn_juli.setAdapter(juli_adapter);
		
		OnItemSelectedListener spinner_listener = new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				// TODO �Զ����ɵķ������
				Toast.makeText(SportPlan.this, parent.getItemAtPosition(position).toString() + " ��ѡ�� ", 
						Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO �Զ����ɵķ������
				
			}
		};
		spn_zhouqi.setOnItemSelectedListener(spinner_listener);
		spn_pinlv.setOnItemSelectedListener(spinner_listener);
		spn_juli.setOnItemSelectedListener(spinner_listener);
		
		btn_build = (Button) findViewById(R.id.build);
		btn_build.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				Intent intent = new Intent();
				intent.setClass(SportPlan.this, SportStart.class);
				
				intent.putExtra("spn_zhouqi", spn_zhouqi.getSelectedItem().toString());
				intent.putExtra("spn_pinlv", spn_pinlv.getSelectedItem().toString());
				intent.putExtra("spn_juli", spn_juli.getSelectedItem().toString());
				
				startActivity(intent);
			}
		});
		
	}

}
