package com.example.demo.motoetkinlik.view;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.example.demo.motoetkinlik.R;

import java.util.Calendar;

public class LoginActivity extends AppCompatActivity {

    DatePickerDialog datePickerDialog;
    Calendar calendar = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener listener;
    Button onayButton;
    Intent intent;
    LoginActivity loginActivity = this;
    //-----------------------------------------------

    Dialog onayKoduDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
        registerHandlers();
    }

    private void init(){
        onayKoduDialog = new Dialog(this);
        onayKoduDialog.setContentView(R.layout.telefon_kod_layout);
        //bu diyalogun view elemanlarına onayKoduDialog.findViewById() metodu ile ulaşabilirsiniz
        onayButton = (Button) onayKoduDialog.findViewById(R.id.btnOnayla);



        int yil = calendar.get(Calendar.YEAR);
        int gun = calendar.get(Calendar.DAY_OF_MONTH);
        int ay = calendar.get(Calendar.MONTH);
        datePickerDialog = new DatePickerDialog(this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,listener,yil,ay,gun);
        datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


    }


    private void registerHandlers(){
        listener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int yil, int ay, int gun) {
                /*
                *
                *
                * gerekli işlemler
                *
                *
                *
                * */
            }
        };
        onayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent = new Intent(loginActivity,AnaMenuActivity.class);
                loginActivity.startActivity(intent);
            }
        });
    }
    public void dogumTarihButton(View view){

        datePickerDialog.show();

    }

    public void ileriButton(View view){
        onayKoduDialog.show();
    }

}
