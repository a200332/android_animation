package com.example.myapplication_animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SetupGuide3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_guide3);
    }

    public void confirm(View view) {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.anim.bottom_in,R.anim.disappear_out);
    }

    public void prev(View view) {
        finish();
        overridePendingTransition(R.anim.left_in,R.anim.right_out);
    }
}
