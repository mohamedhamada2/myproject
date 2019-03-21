package com.example.mhamada.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   RecyclerView recyclerView;
   List<Datamodel>datamodels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        datamodels=new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);


        Datamodel datamode12=new Datamodel();
        datamode12.setName("ali");
        datamode12.setImage(R.drawable.placeholde_up);
        datamode12.setViewtype(0);
        Datamodel datamodel=new Datamodel();
        datamodel.setName("mohamed");
        datamodel.setViewtype(1);
        datamodel.setImage(R.drawable.placeholder_down);
        Datamodel datamodel3=new Datamodel();
        datamodel3.setName("mahmoud");
        datamodel3.setImage(R.drawable.placeholder_down);
        datamodel3.setViewtype(3);
        datamodels.add(datamode12);
        datamodels.add(datamodel3);
        datamodels.add(datamodel);
        DataAdapter dataAdapter=new DataAdapter(this,datamodels);
        recyclerView.setAdapter(dataAdapter);
    }
}
