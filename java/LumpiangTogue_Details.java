package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LumpiangTogue_Details extends AppCompatActivity {
    WebView webView;
    ImageView buttonback;

    FloatingActionButton lumpiatogtop;
    ScrollView scrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lumpiang_togue_details);
        webView = findViewById(R.id.togueproce);
        scrollview = findViewById(R.id.scroll);
        buttonback = findViewById(R.id.back_btn);
        lumpiatogtop= findViewById(R.id.lumpiatog_top);

        lumpiatogtop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            lumpiatogtop.show();
        });


        buttonback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Appetizer_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/togue_procedure.html");
    }
}