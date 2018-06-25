package com.example.demo.motoetkinlik.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demo.motoetkinlik.R;

public class SlideAdaptoru extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    ImageView imgView;
    Button izinVer,bilgiIzin;
    int izinTuru;
    TextView txtView;

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        txtView.setVisibility(View.INVISIBLE);
      container.removeView((ConstraintLayout) object);
    }

    private int [] imageList = {

            R.drawable.konumizni,
            R.drawable.rehberizni,
            R.drawable.smsizni,
            R.drawable.bildirimizni

};


    public SlideAdaptoru(Context context){
            this.context = context;

    }





    @Override
    public int getCount() {
        return imageList.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (ConstraintLayout) object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide,container,false);
        imgView = (ImageView) view.findViewById(R.id.imgViewIzin);
        imgView.setImageResource(imageList[position]);
        izinVer = (Button) view.findViewById(R.id.btnIzinVer);
        bilgiIzin = (Button) view.findViewById(R.id.btnIzinInfo);
        txtView = (TextView) view.findViewById(R.id.txtSolaKaydir);

        registerHandlers(imageList[position]);
        container.addView(view);
        return view;
    }


    private void registerHandlers(int pos){

        izinTuru = pos;


        izinVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*

                İZİN VERME INTENT i BURDA ÇALIŞACAK context referansı üzerinden görüntülenebilir.
                 */
                //Sola Kaydırma Yazısı
                txtView.setVisibility(View.VISIBLE);
            }
        });



        bilgiIzin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (izinTuru){

                    case R.drawable.konumizni:
                        /*
                        Gerekli popupmenu gösterimi

                         */

                        break;
                    case R.drawable.rehberizni:
                         /*
                        Gerekli popupmenu gösterimi

                         */

                        break;
                    case R.drawable.smsizni:
                         /*
                        Gerekli popupmenu gösterimi

                         */

                        break;
                    case R.drawable.bildirimizni:
                         /*
                        Gerekli popupmenu gösterimi

                         */

                        break;



                }


            }
        });



    }




}
