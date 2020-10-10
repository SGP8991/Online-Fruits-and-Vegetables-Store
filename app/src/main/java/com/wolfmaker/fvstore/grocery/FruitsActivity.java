package com.wolfmaker.fvstore.grocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.wolfmaker.fvstore.R;
import com.wolfmaker.fvstore.myAdapter;

public class FruitsActivity extends AppCompatActivity {
    RecyclerView rcv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rcv=(RecyclerView)findViewById(R.id.rclfview);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        String arr[] = {"Apple","BANANA","MANGO","SPINACH","LADY-FINGER","ORANGE","GUAVA","CARROT","ONION","GARLIC"};
        rcv.setAdapter(new myAdapter(arr));
    }



}