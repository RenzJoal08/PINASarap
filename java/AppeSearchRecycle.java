package com.group_2_BSIT_3D_NS.pinasarap;


import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AppeSearchRecycle extends AppCompatActivity {
    private ArrayList<ExampleItem> exampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    EditText search_bar;
    ImageView backbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_recycle);
        search_bar = (EditText) findViewById(R.id.mainsearch);
        search_bar.setTextColor(ContextCompat.getColor(this, R.color.white));
        search_bar.setHintTextColor(ContextCompat.getColor(this,R.color.white));

        backbtn = (ImageView) findViewById(R.id.back_btn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppeSearchRecycle.this, Appetizer_Dish.class);
                startActivity(intent);
            }
        });


        createExampleList();
        buildRecyclerView();

        EditText editText = findViewById(R.id.mainsearch);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

    }

    private void filter(String text) {
        ArrayList<ExampleItem> filteredList = new ArrayList<>();

        for (ExampleItem item : exampleList) {
            if (item.getText().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        mAdapter.filterList(filteredList);
    }



    private void createExampleList() {
        exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.chicharonbulaklak, "Chicharon Bulaklak"));
        exampleList.add(new  ExampleItem(R.drawable.lumpia_1, "Fresh Lumpia"));
        exampleList.add(new  ExampleItem(R.drawable.lumpiang_togue, "Lumpiang Togue"));
        exampleList.add(new  ExampleItem(R.drawable.sisig, "Sizzling Pork Sisig"));
        exampleList.add(new  ExampleItem(R.drawable.tokwat_baboy, "Tokwa't Baboy"));
        exampleList.add(new  ExampleItem(R.drawable.calamares_1, "Calamares"));
    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {

            public void onItemClick(int position) {
                if (position==0) {

                    Intent intent = new Intent(AppeSearchRecycle.this, ChicharonBulaklak_Details.class);
                    startActivity(intent);
                }


                if (position==1) {

                    Intent intent = new Intent(AppeSearchRecycle.this, Lumpia_Details.class);
                    startActivity(intent);

                }

                if (position==2) {

                    Intent intent = new Intent(AppeSearchRecycle.this, LumpiangTogue_Details.class);
                    startActivity(intent);

                }

                if (position== 3) {

                    Intent intent = new Intent(AppeSearchRecycle.this, Sisig_Details.class);
                    startActivity(intent);

                }

                if (position == 4 ) {

                    Intent intent = new Intent(AppeSearchRecycle.this, TokwatBaboy_Details.class);
                    startActivity(intent);

                }


                if (position == 5 ) {

                    Intent intent = new Intent(AppeSearchRecycle.this, Calamares_Details.class);
                    startActivity(intent);

                }
            }
        });

    }

}

