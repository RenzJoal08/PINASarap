package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LecheFlan_Details extends AppCompatActivity {
    WebView webView;

    ImageView lecheback;
    FloatingActionButton lechetop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leche_flan_details);
        webView = findViewById(R.id.lecheFlanproce);

        scrollview = findViewById(R.id.scroll);
        lecheback = findViewById(R.id.back_btn);
        lechetop = findViewById(R.id.leche_top);

        lechetop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            lechetop.show();
        });

        lecheback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Dessert_Dish.class);
            startActivity(intent);
        });
        webView.loadUrl("file:///android_asset/lecheFlan_procedure.html");
    }
}