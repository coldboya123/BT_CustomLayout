package com.example.bt_customlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Object> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rcv);
        getData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new Adapter(list));
    }

    private void getData(){
        list = new ArrayList<>();
        list.add(new Object(R.drawable.img1, "Manana Burger", 2, 24.0));
        list.add(new Object(R.drawable.img2, "Burger", 1, 15.0));
        list.add(new Object(R.drawable.img3, "French Fries", 1, 8.0));

    }
}