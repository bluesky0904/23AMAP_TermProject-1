package com.example.termproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    private static final long SPLASH_DELAY = 1500; // 1.5초 (수정하고 싶으면 수정해도 됨.)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        }, SPLASH_DELAY);
    }
}


