package com.android.islamimarkazlib;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import app.utils.AppFunctions;

/**
 * Created by Qadir Hussain on 10/26/2015.
 */
public class SplashScreen extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 4000;

    private Button btn_go;
    private Resources res;

    private RadioGroup rdoGroupLang;
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        res = getResources();
        rdoGroupLang = (RadioGroup) findViewById(R.id.rdo_group_lang);
        rdoGroupLang.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.radioUrdu:

                        AppFunctions.setLangLocale(activity,AppFunctions.lang_urdu);

                        break;

                    case R.id.radioEnglish:

                        AppFunctions.setLangLocale(activity,AppFunctions.lang_english);

                        break;

                    default:
                        break;
                }

            }
        });


        btn_go = (Button) findViewById(R.id.button);
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                //finish();
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //startActivity(new Intent(SplashScreen. this,MainActivity.class));
                //finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
