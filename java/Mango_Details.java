package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Mango_Details extends AppCompatActivity {
    WebView webView;

    ImageView mangoback;
    FloatingActionButton mangotop;
    ScrollView scrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mango_details);
        webView = findViewById(R.id.mangoproce);

        scrollview = findViewById(R.id.scroll);
        mangoback = findViewById(R.id.back_btn);
        mangotop = findViewById(R.id.mango_top);

        mangotop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            mangotop.show();
        });

        mangoback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Drinks_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/mango_procedure.html");
    }
}