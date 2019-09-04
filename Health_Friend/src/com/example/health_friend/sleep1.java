package com.example.health_friend;


import java.util.Calendar;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class sleep1 extends Activity {
	Button Btn;
	AlarmManager alarmManager;
	Calendar cal = Calendar.getInstance();
	final int DIALOG_TIME = 0;  //�Ի���Id

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.plan_sleep);
		Btn = (Button) findViewById(R.id.Btn);
		alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
		
		Btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				showDialog(DIALOG_TIME);  //��ʾʱ��Ի���
			}
		});
	}
	
	@Override
	protected Dialog onCreateDialog(int id) {
		// TODO �Զ����ɵķ������
		Dialog dialog = null;
		switch (id) {
		case DIALOG_TIME:
			dialog = new TimePickerDialog(this,
					new TimePickerDialog.OnTimeSetListener() {
						
						@Override
						public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
							// TODO �Զ����ɵķ������
							Calendar c = Calendar.getInstance();     //��ȡ���ڶ���
							c.setTimeInMillis(System.currentTimeMillis());
							c.set(Calendar.HOUR, hourOfDay);   //����Сʱ
							c.set(Calendar.MINUTE, minute);    //���ӷ���
							c.set(Calendar.SECOND, 0);         //��������
							c.set(Calendar.MILLISECOND, 0);    //���Ӻ�����
							Intent intent = new Intent(sleep1.this, AlarmReceiver.class);
							PendingIntent pi = PendingIntent.getBroadcast(sleep1.this, 0, intent, 0);
							//��������
							alarmManager.set(AlarmManager.RTC_WAKEUP,
									System.currentTimeMillis(), pi);
							Toast.makeText(sleep1.this, "�������ӳɹ�", Toast.LENGTH_LONG).show();
						}
					}, 
					cal.get(Calendar.HOUR_OF_DAY), 
					cal.get(Calendar.MINUTE), true);
			
			break;
			
		}
		
		return dialog;
	}

	
}


	


