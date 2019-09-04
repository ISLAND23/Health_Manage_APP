package com.example.health_friend;





import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class save extends Activity{
	EditText editText_call;
	Button btn_save;
	Button btn_call;
	 SharedPreferences share_call;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.save_activity);
	Intent intent=getIntent();
	Intent intent0=getIntent();
	int c=0;
	int b=intent0.getIntExtra("a", c);
	Context context=save.this;
	share_call=context.getSharedPreferences("call_num",MODE_APPEND);
	editText_call=(EditText) findViewById(R.id.edittext_save);
	btn_save=(Button) findViewById(R.id.button_save);
	btn_call=(Button) findViewById(R.id.button_call);
	btn_save.setOnClickListener(new on_save_listener());
	btn_call.setOnClickListener(new on_call_listener());
	if(b==1){
		String get_read_call=share_call.getString("call", "not exit");
		// 1. 到了拨号界面，但是实际的拨号是由用户点击实现的。
		//Intent intent = new Intent(Intent.ACTION_DIAL);
		// 2. 对用户没有提示，直接拨打电话
		 Intent intent2 = new Intent(Intent.ACTION_CALL);
		Uri data = Uri.parse("tel:" + get_read_call);
		intent2.setData(data);
		startActivity(intent2);
	}
}

class on_save_listener implements OnClickListener{

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String get_num=editText_call.getText().toString();
		SharedPreferences.Editor editor_call=share_call.edit();
		editor_call.putString("call", get_num);
		editor_call.commit();
		Toast.makeText(save.this, "保存成功！", Toast.LENGTH_SHORT).show();
		
		
		/*Intent intent=new Intent();
		intent.putExtra("send_call", get_num);
		intent.setClass(save.this, xinlv_activity1.class);
		save.this.startActivity(intent);*/
	
	}
	
}

class on_call_listener implements OnClickListener{

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//String get_read_call=share_call.getString("call", "not exit");
		callPhone();
	}
	
		
	private void callPhone() {
		String get_read_call=share_call.getString("call", "not exit");
		// 1. 到了拨号界面，但是实际的拨号是由用户点击实现的。
		//Intent intent = new Intent(Intent.ACTION_DIAL);
		// 2. 对用户没有提示，直接拨打电话
		 Intent intent = new Intent(Intent.ACTION_CALL);
		Uri data = Uri.parse("tel:" + get_read_call);
		intent.setData(data);
		startActivity(intent);


	
}
}
}
