package com.example.teaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import adapter.AdapterTea;
import model.Tea;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //LLAMAR A LA BASE DE DATOS LOCAL
        //Tea.teaList();
        recyclerView = findViewById(R.id.recycler_tea);
        //RECIBE la activity, La lista de te, y la interfaz
        AdapterTea adapterTea = new AdapterTea(this,Tea.teaList(),R.layout.item_tea);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapterTea);
    }
}