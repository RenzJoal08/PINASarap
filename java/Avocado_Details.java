package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Avocado_Details extends AppCompatActivity {
    WebView webView;

    ImageView avocadoback;
    FloatingActionButton avocadotop;
    ScrollView scrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avocado_details);
        webView = findViewById(R.id.avocadoproce);

        scrollview = findViewById(R.id.scroll);
        avocadoback = findViewById(R.id.back_btn);
        avocadotop = findViewById(R.id.avocado_top);

        avocadotop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            avocadotop.show();
        });

        avocadoback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Drinks_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/avocado_procedure.html");
    }
}
