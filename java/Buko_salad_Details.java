package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Buko_salad_Details extends AppCompatActivity {
    WebView webView;

    ImageView bukosaladback;
    FloatingActionButton bukosaladtop;
    ScrollView scrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buko_salad_details);
        webView = findViewById(R.id.bukod_Saladproce);

        scrollview = findViewById(R.id.scroll);
        bukosaladback = findViewById(R.id.back_btn);
        bukosaladtop = findViewById(R.id.bukosalad_top);

        bukosaladtop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            bukosaladtop.show();
        });

        bukosaladback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buko_salad_Details.this,Dessert_Dish.class);
                startActivity(intent);
            }
        });


        webView.loadUrl("file:///android_asset/bukosalad_procedure.html");
    }
}