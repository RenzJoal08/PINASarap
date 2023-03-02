package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Karekare_Details extends AppCompatActivity {
    WebView webView;

    ImageView kareback;
    FloatingActionButton karetopback;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karekare_details);
        webView = findViewById(R.id.karekareproce);

        kareback=findViewById(R.id.back_btn);
        karetopback = findViewById(R.id.karetop);
        scrollview = findViewById(R.id.scroll);

        kareback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Main_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/kare-kare_procedures.html");

        karetopback.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            karetopback.show();
        });
    }


}