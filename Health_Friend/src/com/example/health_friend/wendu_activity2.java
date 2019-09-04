package com.example.health_friend;

import java.util.ArrayList;
import java.util.Calendar;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.components.Legend.LegendForm;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;



public class wendu_activity2 extends Activity {
	
	private LineChart mLineChart;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wendu2);
		
		mLineChart = (LineChart) findViewById(R.id.spread_line_chart);
		LineData mLineData = getLineData();
		 mLineData.setDrawValues(true);//显示坐标值
       mLineChart.setData(mLineData);
      
       mLineChart.setDescription("温度变化图");
       XAxis xAxis = mLineChart.getXAxis();
       xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
       xAxis.setAxisLineColor(Color.parseColor("#66CDAA"));
       xAxis.setAxisLineWidth(2);
       xAxis.setDrawGridLines(false);
       //设置是否显示x轴
       xAxis.setEnabled(true);

     //设置左边y轴的样式
       YAxis yAxisLeft = mLineChart.getAxisLeft();
       yAxisLeft.setAxisLineColor(Color.parseColor("#66CDAA"));
       yAxisLeft.setAxisLineWidth(2);
       yAxisLeft.setDrawGridLines(false);

       //设置右边y轴的样式
       YAxis yAxisRight = mLineChart.getAxisRight();
       yAxisRight.setEnabled(false);

       mLineChart.animateX(1000);
		
	}
	private LineData getLineData() {
		// TODO 自动生成的方法存根
		Calendar time =Calendar.getInstance();
	    String	mMonth=String.valueOf(time.get(Calendar.MONTH)+1);
	    String mDay =String.valueOf(time.get(Calendar.DAY_OF_MONTH));
		String TM =mMonth+"/" +mDay;
		
		
		Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String strContentString = bundle.getString("fromMain");
        float value =Float.parseFloat(strContentString);
		
         
        
        
		ArrayList<Entry> valsComp1 = new ArrayList<Entry>();     //坐标点的集合
		 
       //坐标点的值，Entry(Y坐标，X在第几个点)；
		
        
        valsComp1.add(new Entry(37f, 1) );
        valsComp1.add(new Entry(39f, 2) );
        valsComp1.add(new Entry(40f, 3) );
        valsComp1.add(new Entry(value, 4) );
        LineDataSet setComp1 = new LineDataSet(valsComp1, "温度");    //坐标线，LineDataSet(坐标点的集合, 线的描述或名称);
        setComp1.setDrawCircles(true);
        setComp1.setDrawCubic(true);//显示曲线
        setComp1.setColor(Color.parseColor("#EE0000"));
        
        ArrayList<LineDataSet> dataSets = new ArrayList<LineDataSet>(); //坐标线的集合。
        dataSets.add(setComp1);
 
        ArrayList<String> x = new ArrayList<String>();      //X坐标轴的值的集合
        
        x.add("11/1");
        x.add("11/4");
        x.add("11/5");
        x.add("11/7");
        x.add(TM);
        
 
        LineData data = new LineData(x, dataSets);  //LineData(X坐标轴的集合, 坐标线的集合);
        mLineChart.setData(data);      //为图表添加 数据
        mLineChart.invalidate();       // 重新更新显示
 
        return data;

	}
	
	


		}
	

	


