package com.example.recviewmasterandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recView);
        ModelClass[] modelClasses=new ModelClass[]{new ModelClass("The Great Wall Of China","China",R.drawable.chinawall),
                new ModelClass("Petra","Jordan",R.drawable.petra),
                new ModelClass("Christ The Redeemer","Rio De Janerio",R.drawable.christ),
                new ModelClass("Chicken Itza","Mexico",R.drawable.chickenitza),
                new ModelClass("Machu Picchu","Peru",R.drawable.machupichu),
                new ModelClass("The Roman Colosseum","Rome",R.drawable.colosseum),
                new ModelClass("Taj Mahal","India",R.drawable.tajmahal),new ModelClass("The Great Pyramid","Egypt",R.drawable.pyramidegypt),
                new ModelClass("Hanging Gardens","Babylon",R.drawable.gardenbabylon),new ModelClass("Statue Of Zeus","Greece",R.drawable.statusgreece),
                new ModelClass("Temple Of Artemis","Ephesus",R.drawable.templeephesus),
                new ModelClass("The Mausoleum","Halicarnassus",R.drawable.mausoleumhalicarnassus),new ModelClass("The Colossus","Rhodes",R.drawable.colossusrhodes),
                new ModelClass("The Lighthouse","Egypt",R.drawable.lighthouseegypt)};

        RecAdapter recAdapter=new RecAdapter(modelClasses);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(recAdapter);
    }
}