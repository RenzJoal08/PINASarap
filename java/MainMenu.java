package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;

public class MainMenu extends AppCompatActivity {

    Button appbtn,maindishbtn,drinksbtn,dessertsbtn;
    EditText search_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        search_bar = (EditText) findViewById(R.id.search);
        search_bar.setTextColor(ContextCompat.getColor(this, R.color.white));
        search_bar.setHintTextColor(ContextCompat.getColor(this,R.color.white));


        appbtn = findViewById(R.id.appetizer_btn);
        maindishbtn = findViewById(R.id.maindish_btn);
        drinksbtn = findViewById(R.id.drinks_btn);
        dessertsbtn = findViewById(R.id.desserts_btn);

        appbtn.setOnClickListener(View -> {

            Intent intent = new Intent(MainMenu.this, Appetizer_Dish.class);
            startActivity(intent);

        });

        maindishbtn.setOnClickListener(View -> {

            Intent intent = new Intent(MainMenu.this, Main_Dish.class);
            startActivity(intent);

        });


        drinksbtn.setOnClickListener(View -> {

            Intent intent = new Intent(MainMenu.this, Drinks_Dish.class);
            startActivity(intent);

        });


        dessertsbtn.setOnClickListener(View -> {

            Intent intent = new Intent(MainMenu.this, Dessert_Dish.class);
            startActivity(intent);

        });



        search_bar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this,MainSearchRecycle.class);
                startActivity(intent);
            }
        });


    }
}

