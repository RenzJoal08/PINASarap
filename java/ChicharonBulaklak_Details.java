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

public class ChicharonBulaklak_Details extends AppCompatActivity {
    WebView webView;


    ImageView chichaback;
    FloatingActionButton chichatop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicharon_bulaklak_details);
        webView = findViewById(R.id.chicharonproce);
        scrollview = findViewById(R.id.scroll);
        chichaback = findViewById(R.id.back_btn);
        chichatop = findViewById(R.id.chicha_top);


        chichatop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            chichatop.show();
        });

        chichaback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Appetizer_Dish.class);
            startActivity(intent);
        });


        webView.loadUrl("file:///android_asset/chi_procedure.html");



    }
}