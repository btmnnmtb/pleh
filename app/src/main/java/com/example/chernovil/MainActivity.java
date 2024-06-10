package com.example.chernovil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
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


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);

                startActivity(intent);
            }
        });



    }


}


