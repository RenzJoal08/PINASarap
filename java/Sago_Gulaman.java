package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Sago_Gulaman extends AppCompatActivity {
    WebView webView;

    ImageView sagoback;
    FloatingActionButton sagotop;
    ScrollView scrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sago_gulaman);
        webView = findViewById(R.id.sago_gulaman_proce);

        scrollview = findViewById(R.id.scroll);
        sagoback = findViewById(R.id.back_btn);
        sagotop = findViewById(R.id.sago_top);

        sagotop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            sagotop.show();
        });

        sagoback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Drinks_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/sago_procedure.html");
    }
}