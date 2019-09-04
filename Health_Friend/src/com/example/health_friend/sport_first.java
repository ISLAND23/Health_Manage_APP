package com.example.health_friend;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class sport_first extends Activity implements SensorEventListener{

	
	private TextView tv_step;
    private SensorManager mSensroMgr;
    private int mStepDetector = 0;
    private int mStepCounter = 0;	
    
    private TextView textview;
	
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.sport1);
	TextView textview1=(TextView) findViewById(R.id.tv_step);
	textview=(TextView) findViewById(R.id.sport_get_date);
	
	 SimpleDateFormat sdf=new SimpleDateFormat("MM��dd��");
     String str=sdf.format(new Date());
     textview.setText(str);
     
	 mSensroMgr = (SensorManager) getSystemService(Context.SENSOR_SERVICE);	
}

@Override
protected void onPause() {
	// TODO �Զ����ɵķ������
	super.onPause();
	mSensroMgr.unregisterListener(this);
}
@Override
protected void onResume() {
	// TODO �Զ����ɵķ������
	super.onResume();
	int suitable = 0;
    List<Sensor> sensorList = mSensroMgr.getSensorList(Sensor.TYPE_ALL);
    for (Sensor sensor : sensorList) {
        if (sensor.getType() == Sensor.TYPE_STEP_DETECTOR) {
            suitable += 1;
        } else if (sensor.getType() == Sensor.TYPE_STEP_COUNTER) {
            suitable += 10;
        }
    }
    
    if (suitable/10>0 && suitable%10>0) {
        mSensroMgr.registerListener(this,
                mSensroMgr.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR),
                SensorManager.SENSOR_DELAY_NORMAL);
        mSensroMgr.registerListener(this,
                mSensroMgr.getDefaultSensor(Sensor.TYPE_STEP_COUNTER),
                SensorManager.SENSOR_DELAY_NORMAL);
    } else {
      System.out.println("disable");  //tv_step.setText("��ǰ�豸��֧�ּƲ����������Ƿ���ڲ��м�⴫�����ͼƲ���������");
    }

}



@Override
public void onAccuracyChanged(Sensor sensor, int accuracy) {
	// TODO �Զ����ɵķ������
	
}

@Override
public void onSensorChanged(SensorEvent event) {
	// TODO �Զ����ɵķ������
	if (event.sensor.getType() == Sensor.TYPE_STEP_DETECTOR) {
        if (event.values[0] == 1.0f) {
            mStepDetector++;
        }
    } else if (event.sensor.getType() == Sensor.TYPE_STEP_COUNTER) {
        mStepCounter = (int) event.values[0];
    }
    String desc = String.format("�豸��⵽����ǰ����%d�����ܼ���Ϊ%d��",
            mStepDetector, mStepCounter);
    tv_step.setText(desc);

}
}
