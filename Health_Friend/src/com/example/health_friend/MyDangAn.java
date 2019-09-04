package com.example.health_friend;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MyDangAn extends Activity{
	EditText ET_name, ET_sex, ET_high, ET_weight;
	Button base;
	Spinner SP;
	SharedPreferences share_pf;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dangan);
		
		Context context = MyDangAn.this;
		share_pf = context.getSharedPreferences("mydata",MODE_APPEND);
		
		ET_name = (EditText) findViewById(R.id.et_name);
		ET_sex = (EditText) findViewById(R.id.et_sex);
		ET_high = (EditText) findViewById(R.id.et_high);
		ET_weight = (EditText) findViewById(R.id.et_weight);
		base = (Button) findViewById(R.id.base_id);
		SP = (Spinner) findViewById(R.id.SP);
		
		Spinner();
		base.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				String get_name = ET_name.getText().toString();
				String get_sex = ET_sex.getText().toString();
				String get_high = ET_high.getText().toString();
				String get_weight = ET_weight.getText().toString();
				String get_jiankang = SP.getSelectedItem().toString();
				
				SharedPreferences.Editor editer = share_pf.edit();
				editer.putString("NAME", get_name);
				editer.putString("SEX", get_sex);
				editer.putString("HIGH", get_high);
				editer.putString("WEIGHT", get_weight);
				editer.putString("JianKang", get_jiankang);
				editer.commit();
				
				Intent intent_name = new Intent();
				intent_name.setClass(MyDangAn.this, Mine.class);
				
				intent_name.putExtra("NAME", get_name);
				MyDangAn.this.startActivity(intent_name);
				
			}
		});
		
		init_view_data();
	}

	private void init_view_data() {
		// TODO Auto-generated method stub
		try {
			ET_name.setText(share_pf.getString("NAME", null));
			ET_sex.setText(share_pf.getString("SEX", null));
			ET_high.setText(share_pf.getString("HIGH", null));
			ET_weight.setText(share_pf.getString("WEIGHT", null));			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private void Spinner() {
		// TODO 自动生成的方法存根
		ArrayAdapter<String> adapterDetail;
		String[] spinnerItems = {"健康良好","体质虚弱","先天遗传病","残疾","患过重大疾病","慢性疾病"};
		adapterDetail =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item ,spinnerItems );
		adapterDetail.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		SP.setAdapter(adapterDetail);
	}
	
	OnItemClickListener myListItemClickListener = new OnItemClickListener() {
		
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			// TODO 自动生成的方法存根
			Toast.makeText(MyDangAn.this,
					parent.getItemAtPosition(position).toString() +" 被选中", 
					Toast.LENGTH_SHORT).show();
		}
	};
	
	@Override
	protected void onDestroy() {
		// TODO 自动生成的方法存根
		super.onDestroy();
	}

}