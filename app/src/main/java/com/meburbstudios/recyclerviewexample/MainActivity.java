package com.meburbstudios.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Declarations of Items.
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    private  ArrayList<String>flagNameList = new ArrayList<>();
    private  ArrayList<String>flagDescList = new ArrayList<>();
    private  ArrayList<Integer>imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        //Fill up the flagNameList
        flagNameList.add("Pride");
        flagNameList.add("Enby");
        flagNameList.add("Poly");

        //fill up the flagDescList
        flagDescList.add("This is the Inclusive Pride flag");
        flagDescList.add("This is the NonBinary Pride flag");
        flagDescList.add("This is the Poly Pride flag");

        //fill up the imageList
        imageList.add(R.drawable.pride);
        imageList.add(R.drawable.enby);
        imageList.add(R.drawable.poly);

        //fill up the adapter
        adapter = new RecyclerAdapter(flagNameList, flagDescList, imageList, MainActivity.this);

        //the information from the adapter is now set in the recycler.
        recyclerView.setAdapter(adapter);
    }
}