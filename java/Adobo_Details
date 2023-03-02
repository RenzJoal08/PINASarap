package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ScrollView;
import android.widget.VideoView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Adobo_Details extends AppCompatActivity {
    WebView webView;

    ImageView adoboback;
    FloatingActionButton adobotopback;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adobo_details);
        webView = findViewById(R.id.adoboproce);

        scrollview = findViewById(R.id.scroll);
        adoboback = findViewById(R.id.back_btn);
        adobotopback = findViewById(R.id.buttontop);

        adobotopback.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            adobotopback.show();
        });

        adoboback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Adobo_Details.this,Main_Dish.class);
                startActivity(intent);
            }
        });


        webView.loadUrl("file:///android_asset/adobo_procedure.html");
    }
}
