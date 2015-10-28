package com.android.islamimarkazlib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Qadir Hussain on 10/26/2015.
 */
public class SplashScreen extends Activity {

    private static final int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //startActivity(new Intent(SplashScreen. this,MainActivity.class));
                //finish();
            }
        },SPLASH_TIME_OUT);
    }
}
