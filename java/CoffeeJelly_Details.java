package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CoffeeJelly_Details extends AppCompatActivity {
    WebView webView;

    ImageView coffeeback;
    FloatingActionButton coffeetop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_jelly_details);
        webView = findViewById(R.id.coffeeproce);

        scrollview = findViewById(R.id.scroll);
        coffeeback = findViewById(R.id.back_btn);
        coffeetop = findViewById(R.id.coffee_top);

        coffeetop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            coffeetop.show();
        });

        coffeeback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Dessert_Dish.class);
            startActivity(intent);
        });
        webView.loadUrl("file:///android_asset/CoffeeJelly_procedure.html");
    }
}