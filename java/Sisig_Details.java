package com.group_2_BSIT_3D_NS.pinasarap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Sisig_Details extends AppCompatActivity {
    WebView webView;
    ImageView buttonback;

    FloatingActionButton sisigtop;
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sisig_details);
        webView = findViewById(R.id.sisigproce);
        scrollview = findViewById(R.id.scroll);
        buttonback = findViewById(R.id.back_btn);
        sisigtop = findViewById(R.id.sisig_top);

        sisigtop.setOnClickListener(view ->{
            scrollview.fullScroll(ScrollView.FOCUS_UP);
           sisigtop.show();
        });

        buttonback.setOnClickListener(view ->{
            Intent intent = new Intent(this, Appetizer_Dish.class);
            startActivity(intent);
        });

        webView.loadUrl("file:///android_asset/sisig_procedure.html");
    }
}