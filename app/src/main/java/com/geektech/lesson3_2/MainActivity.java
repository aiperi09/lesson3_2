package com.geektech.lesson3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private AdapterPerson adapter;
private ArrayList<Model> names = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        adapter = new AdapterPerson(names);
        recyclerView.setAdapter(adapter);
        LoadDate();

    }

    private void LoadDate() {

        names.add(new Model(R.drawable.kartinka,"Bermet\nAshyralieva"));
        names.add(new Model(R.drawable.kartinka,"Aijan\nKochkorbekova"));
        names.add(new Model(R.drawable.kartinka,"Mira\nAmirova"));
        names.add(new Model(R.drawable.kartinka,"Klara\nJenishbekova"));
        names.add(new Model(R.drawable.kartinka,"Nuri\nJenishbekova"));
        names.add(new Model(R.drawable.kartinka,"Miira\nJenishbekova"));
        names.add(new Model(R.drawable.kartinka,"Jannat\nJenishbekova"));
        names.add(new Model(R.drawable.kartinka,"Jannat\nJenishbekova"));
        names.add(new Model(R.drawable.kartinka,"Jannat\nJenishbekova"));
        names.add(new Model(R.drawable.kartinka,"Jannat\nJenishbekova"));
        names.add(new Model(R.drawable.kartinka,"Jannat\nJenishbekova"));
        names.add(new Model(R.drawable.kartinka,"Jannat\nJenishbekova"));

    }




    }
