package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TokwatBaboy_Details extends AppCompatActivity {
    WebView webView;
    ImageView buttonback;

    FloatingActionButton tokwatop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokwat_baboy_details);
        webView = findViewById(R.id.tokwaproce);
        scrollview = findViewById(R.id.scroll);
        buttonback = findViewById(R.id.back_btn);
        tokwatop = findViewById(R.id.tokwa_top);

        tokwatop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            tokwatop.show();
        });

        buttonback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Appetizer_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/tokwa_procedure.html");
    }
}