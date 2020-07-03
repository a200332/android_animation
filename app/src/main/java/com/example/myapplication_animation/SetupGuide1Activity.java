package com.example.myapplication_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SetupGuide1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_guide1);
    }

    public void next(View view) {
        startActivity(new Intent(this, SetupGuide2Activity.class));
        overridePendingTransition(R.anim.right_in,R.anim.left_out);
    }
}
