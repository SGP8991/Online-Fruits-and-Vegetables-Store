package com.wolfmaker.fvstore.grocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.wolfmaker.fvstore.R;
import com.wolfmaker.fvstore.myAdapter;
import com.wolfmaker.fvstore.myAdapter1;

public class organicfruitsActivity extends AppCompatActivity {

    RecyclerView rcv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitsorganic);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rcv1=(RecyclerView)findViewById(R.id.rclofview);
        rcv1.setLayoutManager(new LinearLayoutManager(this));
        String arr1[] = {"Apple","BANANA","MANGO","SPINACH","LADY-FINGER","ORANGE","GUAVA","CARROT","ONION","GARLIC"};
        rcv1.setAdapter(new myAdapter1(arr1));
    }



}
