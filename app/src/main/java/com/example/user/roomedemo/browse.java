package com.example.user.roomedemo;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class browse extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LinearLayoutManager linearmanager;
    public ArrayList<String> names;

    private FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        setTitle("Browse");

        fab = (FloatingActionButton)findViewById(R.id.FAB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoUpload = new Intent(getApplicationContext(),Upload.class);
                startActivity(gotoUpload);
            }
        });

        recyclerView = (RecyclerView)findViewById(R.id.Recyclerview);

        linearmanager = new LinearLayoutManager(this);

        names = new ArrayList<String>();
        names.add("Bradley");
        names.add("Andre");
        names.add("Sos");
        names.add("Kean");
        names.add("Chris");


        recyclerView.setLayoutManager(linearmanager);
        recyclerView.setHasFixedSize(true);
        MyAdapter adapter  = new MyAdapter(names);

        recyclerView.setAdapter(adapter);


    }
}