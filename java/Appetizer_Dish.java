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

public class Appetizer_Dish extends AppCompatActivity {
    Button calamares, chicharon, lumpia, togue, sisig, tokwa;
    EditText search_barapp;
    ImageView backbtn;
    FloatingActionButton appetop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizer_dish);

        search_barapp = (EditText) findViewById(R.id.app_search_btn);
        search_barapp.setTextColor(ContextCompat.getColor(this, R.color.white));
        search_barapp.setHintTextColor(ContextCompat.getColor(this, R.color.white));

        search_barapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Appetizer_Dish.this,AppeSearchRecycle.class);
                startActivity(intent);
            }
        });


        backbtn = (ImageView) findViewById(R.id.back_btn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Appetizer_Dish.this,MainMenu.class);
                startActivity(intent);
            }
        });

        appetop = findViewById(R.id.appe_top);
        scrollview = findViewById(R.id.scroll);
        appetop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            appetop.show();
        });



        calamares = findViewById(R.id.calamares);
        chicharon = findViewById(R.id.chicharon);
        lumpia = findViewById(R.id.lumpia);
        togue = findViewById(R.id.togue);
        sisig = findViewById(R.id.sisig);
        tokwa = findViewById(R.id.tokwa);

        chicharon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Appetizer_Dish.this,ChicharonBulaklak_Details.class);
                startActivity(intent);
            }
        });

        lumpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Appetizer_Dish.this,Lumpia_Details.class);
                startActivity(intent);
            }
        });


        togue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Appetizer_Dish.this,LumpiangTogue_Details.class);
                startActivity(intent);
            }
        });


        sisig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Appetizer_Dish.this,Sisig_Details.class);
                startActivity(intent);
            }
        });


        tokwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Appetizer_Dish.this,TokwatBaboy_Details.class);
                startActivity(intent);
            }
        });

        calamares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Appetizer_Dish.this,Calamares_Details.class);
                startActivity(intent);
            }
        });


    }

}