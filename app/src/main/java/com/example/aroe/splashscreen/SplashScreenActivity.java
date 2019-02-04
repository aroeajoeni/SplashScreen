package com.example.aroe.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    Handler ladygaga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ladygaga = new Handler();
        ladygaga.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent daddy = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(daddy);
                finish();

                //https://abhiandroid.com/programming/splashscreen




            }
        }, 5*1000);


    }
}
