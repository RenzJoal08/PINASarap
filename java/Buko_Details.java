package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Buko_Details extends AppCompatActivity {
    WebView webView;

    ImageView bukoback;
    FloatingActionButton bukotop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buko_details);
        webView = findViewById(R.id.bukoproce);

        scrollview = findViewById(R.id.scroll);
        bukoback = findViewById(R.id.back_btn);
        bukotop = findViewById(R.id.buko_top);

        bukotop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            bukotop.show();
        });

        bukoback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Drinks_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/buko_procedure.html");
    }
}