package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ScrollView;
import android.widget.VideoView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Calamares_Details extends AppCompatActivity {
    WebView webView;

    ImageView buttonback;
    FloatingActionButton calamarestop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calamares_details);
        webView = findViewById(R.id.calamaresproce);
        scrollview = findViewById(R.id.scroll);
        buttonback = findViewById(R.id.back_btn);
        calamarestop = findViewById(R.id.calamares_top);

       calamarestop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            calamarestop.show();
        });

        buttonback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Appetizer_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/calamares_procedure.html");



    }
}