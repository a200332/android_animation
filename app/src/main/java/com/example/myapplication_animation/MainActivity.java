package com.example.myapplication_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_main_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_main_name = findViewById(R.id.et_main_name);
    }

    public void login(View view) {
        String name = et_main_name.getText().toString();
        if ("".equals(name.trim())){
            Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.shake);
            et_main_name.startAnimation(animation);
        }else{
            Toast.makeText(MainActivity.this,"去登录",Toast.LENGTH_SHORT).show();
        }
    }
}
