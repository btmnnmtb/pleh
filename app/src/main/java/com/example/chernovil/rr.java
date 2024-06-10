package com.example.chernovil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rr extends AppCompatActivity {
    RecyclerView recyclerView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        ArrayList<Game> list = new ArrayList<>();
        list.add(new Game("Game 1 ", "Action ", 2023, 4));
        list.add(new Game("Game 2", "Adventure", 2022, 5));
        list.add(new Game("Game 3", "RPG", 2021, 3));
        list.add(new Game("Game 1 ", "Action ", 2023, 4));
        list.add(new Game("Game 2", "Adventure", 2022, 5));
        list.add(new Game("Game 3", "RPG", 2021, 3));

        list.add(new Game("Game 1 ", "Action ", 2023, 4));
        list.add(new Game("Game 2", "Adventure", 2022, 5));
        list.add(new Game("Game 3", "RPG", 2021, 3));
        list.add(new Game("Game 3", "RPG", 2021, 3));


        RView adapter = new RView(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}