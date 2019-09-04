package com.example.health_friend;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public class Welcom extends Activity {
	private ImageView welcomeImg = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcom);
		welcomeImg =(ImageView) findViewById(R.id.welcome_img);
		AlphaAnimation anima = new AlphaAnimation(0.3f,5.0f);
		anima.setDuration(4000);// 设置动画显示时间
        welcomeImg.startAnimation(anima);
        anima.setAnimationListener(new AnimationImpl());
		
	}

	private class AnimationImpl implements  AnimationListener {
		 
        @Override
        public void onAnimationStart(Animation animation) {
            welcomeImg.setBackgroundResource(R.drawable.start_app);
        }
 
       
 
    private void skip() {
        startActivity(new Intent(Welcom.this, register_login.class));
        finish();
    }



	@Override
	public void onAnimationEnd(Animation arg0) {
		// TODO 自动生成的方法存根
		skip();
	}



	@Override
	public void onAnimationRepeat(Animation arg0) {
		// TODO 自动生成的方法存根
		
	}
	

	}

	}

