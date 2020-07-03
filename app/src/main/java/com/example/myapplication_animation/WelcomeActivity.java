package com.example.myapplication_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

public class WelcomeActivity extends AppCompatActivity {
    private RelativeLayout rl_welcome_root;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (msg.what==1){
                startActivity(new Intent(WelcomeActivity.this, SetupGuide1Activity.class));
                finish();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        rl_welcome_root = findViewById(R.id.rl_welcome_root);
        showAnimation();
        handler.sendEmptyMessageDelayed(1,3000);
    }

    private void showAnimation() {
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f,Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(2000);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
        alphaAnimation.setDuration(2000);
        ScaleAnimation scaleAnimation=new ScaleAnimation(0,1,0,1,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnimation.setDuration(2000);
        AnimationSet animationSet=new AnimationSet(true);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        rl_welcome_root.startAnimation(animationSet);
    }
}
