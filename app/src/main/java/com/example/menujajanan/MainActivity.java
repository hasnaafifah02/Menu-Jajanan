package com.example.menujajanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rjajanan;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Jajanan> listJajanan;

    void dataDummy(){
        listJajanan = new ArrayList<>();
        listJajanan.add(new Jajanan("Cilok", "enakk sekali", 35000,R.drawable.cilok));
        listJajanan.add(new Jajanan("Bolu", "enak bangett", 43000,R.drawable.bolu));
        listJajanan.add(new Jajanan("Sempol", "enak sedap sekali", 43000,R.drawable.sempol));
        listJajanan.add(new Jajanan("Cireng", "enak sedap", 20000,R.drawable.cireng));
        listJajanan.add(new Jajanan("Takoyaki", "enak buangeett", 20000,R.drawable.takoyaki));
    }
    void data(){
        rjajanan = findViewById(R.id.rMenu);
        adapter = new Adapter(this, this.listJajanan);
        layoutManager = new LinearLayoutManager(this);
        rjajanan.setLayoutManager(layoutManager);
        rjajanan.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataDummy();data();
    }
}