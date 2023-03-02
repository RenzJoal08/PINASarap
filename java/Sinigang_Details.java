package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Sinigang_Details extends AppCompatActivity {
    WebView webView;

    ImageView sinigangback;
    FloatingActionButton sinigangtop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinigang_details);
        webView = findViewById(R.id.sinigangproce);

        scrollview = findViewById(R.id.scroll);
        sinigangback = findViewById(R.id.sinigang_back);
        sinigangtop = findViewById(R.id.sinigang_top);


        sinigangtop.setOnClickListener(view -> {
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            sinigangtop.show();
        });

        sinigangback.setOnClickListener(view ->{
            Intent intent = new Intent(Sinigang_Details.this, Main_Dish.class);
            startActivity(intent);
        });


        webView.loadUrl("file:///android_asset/sinigang_procedure.html");

    }

}