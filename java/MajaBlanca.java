package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MajaBlanca extends AppCompatActivity {
    WebView webView;

    ImageView majaback;
    FloatingActionButton majatop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maja_blanca);
        webView = findViewById(R.id.majaproce);

        scrollview = findViewById(R.id.scroll);
        majaback = findViewById(R.id.back_btn);
        majatop = findViewById(R.id.maja_top);

        majatop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            majatop.show();
        });


        majaback.setOnClickListener(view ->{
            Intent intent = new Intent(MajaBlanca.this, Dessert_Dish.class);
            startActivity(intent);
        });
        webView.loadUrl("file:///android_asset/maja_procedure.html");
    }

}