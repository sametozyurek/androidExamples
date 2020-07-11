package com.sametozyurek.timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView cdTimer=findViewById(R.id.time);

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                cdTimer.setText("Kalan süre : "+(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"Zaman doldu.",Toast.LENGTH_LONG).show();
            }
        }.start();
    }
}
