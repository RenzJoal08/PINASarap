package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Banana_details extends AppCompatActivity {
    WebView webView;

    ImageView bananaback;
    FloatingActionButton bananatop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana_details);
        webView = findViewById(R.id.bananaproce);

        scrollview = findViewById(R.id.scroll);
        bananaback = findViewById(R.id.back_btn);
        bananatop = findViewById(R.id.banana_top);

        bananatop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            bananatop.show();
        });

        bananaback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Drinks_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/banana_procedure.html");
    }
}