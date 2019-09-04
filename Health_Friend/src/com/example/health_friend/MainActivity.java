package com.example.health_friend;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent=getIntent();
		TabHost tabHost=this.getTabHost();
		tabHost.getTabWidget().bringToFront();
		LayoutInflater.from(this).inflate(R.layout.main, tabHost.getTabContentView(), true);
		tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("��ѹ",getResources().getDrawable(R.drawable.press_tubiao)).setContent(new Intent(this,PressActiviy.class)));
		tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("����").setContent(new Intent(this,Activity__main.class)));
		tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("��Ѷ").setContent(new Intent(this,Zixun_main.class)));
		tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator("�ҵ�").setContent(new Intent(this,Mine.class)));
		
	}

}
