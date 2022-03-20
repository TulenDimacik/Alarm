package com.example.recy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model> movies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = findViewById(R.id.recycleView);

        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,movies);
        recyclerView.setAdapter(adapter);
    }
    private void setData()
    {
        movies.add(new Model(R.drawable.gg,"Главный герой"));
        movies.add(new Model(R.drawable.tss2,"Отряд самоубийц 2"));
        movies.add(new Model(R.drawable.cherry,"По наклонной"));
        movies.add(new Model(R.drawable.ven,"Веном 2"));

    }
}