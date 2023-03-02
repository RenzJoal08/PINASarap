package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Halo_Halo_Details extends AppCompatActivity {
    WebView webView;

    ImageView haloback;
    FloatingActionButton halotop;
    ScrollView scrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halo_halo_details);
        webView = findViewById(R.id.haloproce);

        scrollview = findViewById(R.id.scroll);
        haloback = findViewById(R.id.back_btn);
        halotop = findViewById(R.id.halo_top);

        halotop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            halotop.show();
        });

        haloback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Dessert_Dish.class);
            startActivity(intent);
        });
        webView.loadUrl("file:///android_asset/halo_procedure.html");
    }
}