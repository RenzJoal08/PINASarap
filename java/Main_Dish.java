package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main_Dish extends AppCompatActivity {
    Button adobo,karekare,inasal, pata, kaldereta,sinigang;
    EditText maindishsearch;
    ImageView backbtn;
    FloatingActionButton maindishtop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dish);

        maindishsearch = (EditText) findViewById(R.id.maindish_search);
        maindishsearch.setTextColor(ContextCompat.getColor(this, R.color.white));
        maindishsearch.setHintTextColor(ContextCompat.getColor(this, R.color.white));


        backbtn = (ImageView) findViewById(R.id.back_btn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Dish.this,MainMenu.class);
                startActivity(intent);
            }
        });


        maindishsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Dish.this,MainDishSearchRecycle.class);
                startActivity(intent);
            }
        });

        maindishtop = findViewById(R.id.maindish_top);
        scrollview = findViewById(R.id.scroll);
        maindishtop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            maindishtop.show();
        });


        adobo = findViewById(R.id.chic_adobo);
        karekare = findViewById(R.id.karekare_btn);
        inasal = findViewById(R.id.inasal_btn);
        pata = findViewById(R.id.pata_btn);
        kaldereta = findViewById(R.id.kaldereta_btn);
        sinigang = findViewById(R.id.sinigang_btn);

        adobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Dish.this,Adobo_Details.class);
                startActivity(intent);
            }
        });

        karekare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Dish.this,Karekare_Details.class);
                startActivity(intent);
            }
        });

        inasal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Dish.this,ChickenInasal_Details.class);
                startActivity(intent);
            }
        });


        pata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Dish.this,Pata_Details.class);
                startActivity(intent);
            }
        });

        kaldereta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Dish.this,Kaldereta_Details.class);
                startActivity(intent);
            }
        });


        sinigang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Dish.this,Sinigang_Details.class);
                startActivity(intent);
            }
        });

    }
}