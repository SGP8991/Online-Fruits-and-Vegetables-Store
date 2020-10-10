package com.wolfmaker.fvstore.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.wolfmaker.fvstore.R;
import com.wolfmaker.fvstore.grocery.organicfruitsActivity;
import com.wolfmaker.fvstore.grocery.FruitsActivity;

public class HomeFragment extends Fragment {

    private ImageView fruits,organicfruits;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        fruits=root.findViewById(R.id.fruits_vegetables);
        organicfruits=root.findViewById(R.id.organicfruits);


        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), FruitsActivity.class);
                startActivity(intent);
            }
        });

        organicfruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), organicfruitsActivity.class);
                startActivity(intent);
            }
        });







        return root;
    }
}