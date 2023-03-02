package com.group_2_BSIT_3D_NS.pinasarap;


import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Pata_Details extends AppCompatActivity {

    WebView webView;

    ImageView pataback;
    FloatingActionButton patatop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pata_details);
        webView = findViewById(R.id.pataproce);

        scrollview = findViewById(R.id.scroll);
        pataback = findViewById(R.id.pata_back);
        patatop = findViewById(R.id.pata_top);


        patatop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            patatop.show();
        });


        pataback.setOnClickListener(view ->{
            Intent intent = new Intent(Pata_Details.this, Main_Dish.class);
            startActivity(intent);
        });


        webView.loadUrl("file:///android_asset/pata_procedures.html");

    }
}