package com.example.demo.motoetkinlik.view;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.TextView;

import com.example.demo.motoetkinlik.R;

public class AnaMenuActivity extends AppCompatActivity {

    TextView txtBaglantiDurumu;
    ObjectAnimator objectAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_menu);
        init();
        txtAnimasyonu();
    }


    private void txtAnimasyonu(){



    }

    private void init(){
        txtBaglantiDurumu = (TextView) findViewById(R.id.txtBaglanti);
        objectAnimator = ObjectAnimator.ofInt(txtBaglantiDurumu,"backgroundColor", Color.WHITE,Color.RED,Color.WHITE);
        objectAnimator.setDuration(1200);
        objectAnimator.setEvaluator(new ArgbEvaluator());
        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        objectAnimator.start();

        /*
        *
        * Üstteki kısım bağlanmadığı durum
        *
        *
        * Alltaki ise bağlandıktan sonraki durum sadece textviewların değşimlerini koymadım koda
        *
        *
        *
        * */



       objectAnimator.setIntValues(Color.WHITE,Color.BLUE,Color.WHITE);
        objectAnimator.setDuration(1200);
        objectAnimator.setEvaluator(new ArgbEvaluator());
        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);

    }



}
