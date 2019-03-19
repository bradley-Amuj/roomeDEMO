package com.example.user.roomedemo;

/**
 * Created by user on 8/21/17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 8/21/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public ArrayList<String> NAMES;

    public MyAdapter(ArrayList<String> names) {
        this.NAMES = names;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.browse_row,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.name.setText(NAMES.get(position));
    }

    @Override
    public int getItemCount() {
        return NAMES.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.nametxt);

        }
    }
}

