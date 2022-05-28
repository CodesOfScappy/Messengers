package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.window.SplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    private ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setBackgroundColor(Color.BLACK);

        new Handler().postDelayed(new Runnable() {

// Using handler with postDelayed called runnable run method

            @Override

            public void run() {

                Intent i = new Intent(SplashScreenActivity.this, WelcomeScreenActivity.class);

                startActivity(i);

                // close this activity

                finish();

            }

        }, 5 * 1000); // wait for 5 seconds

    }


}