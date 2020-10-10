package com.wolfmaker.fvstore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class myAdapter1 extends RecyclerView.Adapter<myAdapter1.holder1> {
    String data1[];

    public myAdapter1(String[] data1) {
        this.data1 = data1;
    }

    @NonNull
    @Override
    public holder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlerow2, parent, false);
        return new holder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder1 holder, int position) {
        holder.t1.setText(data1[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }


     class holder1 extends RecyclerView.ViewHolder {


         ImageView img;
        TextView t1;

        public holder1(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.ofruits);
            t1 = (TextView) itemView.findViewById(R.id.of1);
        }
    }
}


