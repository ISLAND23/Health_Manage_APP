package com.example.health_friend;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class register_login extends Activity{
	private EditText name;
    private EditText passwd;
    private Button login;
    private Button register;
    SharedPreferences share_pfs;
    CheckBox rememberpass,autologin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.login);
    	Intent intent=getIntent();
    	Context context=register_login.this;
    	share_pfs=context.getSharedPreferences("user",MODE_APPEND);
    	name = (EditText) findViewById(R.id.name);
        passwd = (EditText) findViewById(R.id.passwd);
        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);
        rememberpass = (CheckBox) findViewById(R.id.rememberpassword);
        register.setOnClickListener(new onclick_register());
        login.setOnClickListener(new onclick_login());
        rememberpass.setOnCheckedChangeListener(new onclick_rememberpass());
    }
    
    class onclick_register implements OnClickListener{

    	@Override
    	public void onClick(View arg0) {
    		// TODO Auto-generated method stub
    		String get_name=name.getText().toString();
    		String get_password=passwd.getText().toString();
    		SharedPreferences.Editor editor=share_pfs.edit();
    		editor.putString("NAME", get_name);
    		editor.putString("PASSWORD", get_password);
    		editor.commit();
    			if(get_name.length()!=0 && get_password.length()!=0){
    		Intent intent=new Intent(register_login.this,MainActivity.class);
    		register_login.this.startActivity(intent);
    		 Toast.makeText(register_login.this, "注册成功！", Toast.LENGTH_SHORT).show();
    			}
    			else{
    				Toast.makeText(register_login.this, "用户名或密码不能空！", Toast.LENGTH_SHORT).show();
    			}
    	
    	
    }
    }
    class onclick_login implements OnClickListener{

    	@Override
    	public void onClick(View arg0) {
    		// TODO Auto-generated method stub
    		String edit_name=name.getText().toString();
    		String edit_password=passwd.getText().toString();
    		String get_read_name=share_pfs.getString("NAME", "not exit");
    		String get_read_password=share_pfs.getString("PASSWORD", "not exit");
    		
    		 if(edit_name.equals(get_read_name) && (edit_password.equals(get_read_password))&& edit_name.length()!=0 && edit_password.length()!=0){
    			Intent intent=new Intent(register_login.this,MainActivity.class);
    			register_login.this.startActivity(intent);
    			Toast.makeText(register_login.this, "登录成功！", Toast.LENGTH_SHORT).show();
    		}
    		else{
    			Toast.makeText(register_login.this, "用户名或密码错误！", Toast.LENGTH_SHORT).show();
    		}
    	}
    }
    
    class onclick_rememberpass implements OnCheckedChangeListener{

    	@Override
    	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    		// TODO Auto-generated method stub
    		 if (rememberpass.isChecked()){
                 System.out.println("记住密码已选中");
                 share_pfs.edit().putBoolean("ischeck",true).commit();
             }else {
                 System.out.println("记住密码没有选中");
                 share_pfs.edit().putBoolean("ischeck",false).commit();
             }
    	}
    	
    }
    }
    
