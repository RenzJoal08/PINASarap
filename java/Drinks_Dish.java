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

public class Drinks_Dish extends AppCompatActivity {
    Button avocado,banana,mango,sago,buko,strawberry;
    EditText search_bar;
    ImageView backbtn;
    FloatingActionButton drinkstop;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_dish);

        search_bar = (EditText) findViewById(R.id.drinks_search_btn);
        search_bar.setTextColor(ContextCompat.getColor(this, R.color.white));
        search_bar.setHintTextColor(ContextCompat.getColor(this, R.color.white));

        search_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks_Dish.this,DrinksSearchRecycle.class);
                startActivity(intent);
            }
        });

        backbtn = (ImageView) findViewById(R.id.back_btn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks_Dish.this,MainMenu.class);
                startActivity(intent);
            }
        });


        drinkstop = findViewById(R.id.drinks_top);
        scrollView = findViewById(R.id.scroll);
        drinkstop.setOnClickListener(view ->{
            scrollView.fullScroll(ScrollView.FOCUS_UP);
            drinkstop.show();
        });

        avocado = findViewById(R.id.avocado);
        banana = findViewById(R.id.banana);
        mango = findViewById(R.id.mango);
        sago = findViewById(R.id.sago);
        buko = findViewById(R.id.buko);
        strawberry = findViewById(R.id.strawberry) ;


        avocado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks_Dish.this,Avocado_Details.class);
                startActivity(intent);
            }
        });


        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks_Dish.this,Banana_details.class);
                startActivity(intent);
            }
        });

        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks_Dish.this,Mango_Details.class);
                startActivity(intent);
            }
        });

        buko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks_Dish.this,Buko_Details.class);
                startActivity(intent);
            }
        });

        sago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks_Dish.this,Sago_Gulaman.class);
                startActivity(intent);
            }
        });

        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks_Dish.this,Strawberry_Details.class);
                startActivity(intent);
            }
        });



    }
}