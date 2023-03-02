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

public class Dessert_Dish extends AppCompatActivity {
    Button bukosalad,lecheFlan,coffeejelly,halohalo,mangofloat,majablanca;
    EditText search_bar;
    ImageView backbtn;
    FloatingActionButton dessertstop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_dish);

        search_bar = (EditText) findViewById(R.id.des_search_btn);
        search_bar.setTextColor(ContextCompat.getColor(this, R.color.white));
        search_bar.setHintTextColor(ContextCompat.getColor(this, R.color.white));

        search_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dessert_Dish.this,DessertsSearchRecycle.class);
                startActivity(intent);
            }
        });

        backbtn = (ImageView) findViewById(R.id.back_btn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dessert_Dish.this,MainMenu.class);
                startActivity(intent);
            }
        });

        dessertstop = findViewById(R.id.desserts_top);
        scrollview = findViewById(R.id.scroll);
        dessertstop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            dessertstop.show();
        });

        bukosalad = findViewById(R.id.buko_salad);
        lecheFlan = findViewById(R.id.leche_Flan);
        coffeejelly = findViewById(R.id.coffee_jelly);
        halohalo = findViewById(R.id.halo_halo);
        mangofloat = findViewById(R.id.mango_float);
        majablanca = findViewById(R.id.maja_blanca);


        bukosalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dessert_Dish.this,Buko_salad_Details.class);
                startActivity(intent);
            }
        });

        lecheFlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dessert_Dish.this,LecheFlan_Details.class);
                startActivity(intent);
            }
        });


        coffeejelly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dessert_Dish.this,CoffeeJelly_Details.class);
                startActivity(intent);
            }
        });


        halohalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dessert_Dish.this,Halo_Halo_Details.class);
                startActivity(intent);
            }
        });


        mangofloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dessert_Dish.this,MangoFloat_Details.class);
                startActivity(intent);
            }
        });


        majablanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dessert_Dish.this,MajaBlanca.class);
                startActivity(intent);
            }
        });


    }
}