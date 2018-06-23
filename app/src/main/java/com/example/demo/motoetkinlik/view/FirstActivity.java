package com.example.demo.motoetkinlik.view;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.demo.motoetkinlik.R;

public class FirstActivity extends AppCompatActivity {

    CountDownTimer countDownTimer;
    Intent intent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        init();
    }




    private void init(){

        intent = new Intent(this,LoginActivity.class);


        countDownTimer = new CountDownTimer(4000,1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
               startActivity(intent);
            }
        }.start();

    }




}
