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

public class Lumpia_Details extends AppCompatActivity {
    WebView webView;
    ImageView buttonback;
    FloatingActionButton lumpiatop;
    ScrollView scrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lumpia_details);
        webView = findViewById(R.id.lumpiaproce);
        scrollview = findViewById(R.id.scroll);
        buttonback = findViewById(R.id.back_btn);
        lumpiatop = findViewById(R.id.lumpia_top);


        lumpiatop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            lumpiatop.show();
        });

        buttonback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Appetizer_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/lumpia_procedure.html");


    }
}