package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ChickenInasal_Details extends AppCompatActivity {
    WebView webView;

    ImageView inasalback;
    FloatingActionButton inasaltop;
    ScrollView scrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_inasal_details);
        webView = findViewById(R.id.inasalproce);

        scrollview = findViewById(R.id.scroll);
        inasalback = findViewById(R.id.inasal_back);
        inasaltop = findViewById(R.id.inasal_top);


        inasaltop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            inasaltop.show();
        });


        inasalback.setOnClickListener(view ->{
            Intent intent = new Intent(ChickenInasal_Details.this, Main_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/inasal_procedures.html");
    }
}