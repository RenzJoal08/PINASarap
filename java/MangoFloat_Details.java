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

public class MangoFloat_Details extends AppCompatActivity {
    WebView webView;

    ImageView mangofloatback;
    FloatingActionButton mangofloattop;
    ScrollView scrollview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mango_float_details);
        webView = findViewById(R.id.mango_floatproce);

        scrollview = findViewById(R.id.scroll);
        mangofloatback = findViewById(R.id.back_btn);
        mangofloattop = findViewById(R.id.mangofloat_top);

        mangofloattop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            mangofloattop.show();
        });

        mangofloatback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MangoFloat_Details.this,Dessert_Dish.class);
                startActivity(intent);
            }
        });

        webView.loadUrl("file:///android_asset/mangoFLoat_procedure.html");
    }

}