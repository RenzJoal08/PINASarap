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

public class Kaldereta_Details extends AppCompatActivity {
    WebView webView;

    ImageView kaldeback;
    FloatingActionButton kaldetop;
    ScrollView scrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaldereta_details);
        webView = findViewById(R.id.kalderetaproce);


        scrollview = findViewById(R.id.scroll);
        kaldeback = findViewById(R.id.kare_back);
        kaldetop = findViewById(R.id.kare_top);

        kaldetop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
            kaldetop.show();
        });

        kaldeback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kaldereta_Details.this,Main_Dish.class);
                startActivity(intent);
            }
        });

        webView.loadUrl("file:///android_asset/kaldereta_procedure.html");
    }

}
