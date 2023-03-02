package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Strawberry_Details extends AppCompatActivity {
    WebView webView;

    ImageView strawback;
    FloatingActionButton strawtop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strawberry_details);
        webView = findViewById(R.id.strawberryproce);

        scrollview = findViewById(R.id.scroll);
        strawback = findViewById(R.id.back_btn);
        strawtop = findViewById(R.id.straw_top);

        strawtop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            strawtop.show();
        });

        strawback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Drinks_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/strawberry_procedure.html");
    }

}