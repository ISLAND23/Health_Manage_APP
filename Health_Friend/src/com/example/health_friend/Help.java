package com.example.health_friend;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Help extends Activity{
	ListView helplv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.helplist);
		
		helplv = (ListView) findViewById(R.id.helpLV);
		
		String[] data = {"如何注册账号","如何修改密码","如何找密码","如何问诊","如何联系客服",""};
		ArrayAdapter<String> MyProblem = new ArrayAdapter<String>(Help.this,
				android.R.layout.simple_dropdown_item_1line, data);
		helplv.setAdapter(MyProblem);
		
		OnItemClickListener myItemClickListener = new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO 自动生成的方法存根
				Toast.makeText(Help.this, 
						parent.getItemAtPosition(position).toString() +  " 被选中", 
						Toast.LENGTH_SHORT).show();
			}
		};
		helplv.setOnItemClickListener(myItemClickListener);
		/*
		ArrayList<HashMap<String, Object>> books = new ArrayList<HashMap<String,Object>>();
		for (int i = 0; i < data.length; i++) {
			HashMap<String, Object> book = new HashMap<String, Object>();
			book.put("title", data[i]);
			books.add(book);
		}
		SimpleAdapter listadapter = new SimpleAdapter(this, 
				books, 
				R.layout.helplist, 
				new String[] {"title"}, 
				new int[] {R.id.item_text});
		helplv.setAdapter(listadapter);*/
		
	}

}
