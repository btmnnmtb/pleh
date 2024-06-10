package com.example.chernovil;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RView extends RecyclerView.Adapter<RView.MyViewHolder> {
     private final ArrayList<Game> _list;

    public RView(ArrayList<Game> list) {
        this._list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(_list.get(position).getName());
        holder.janr.setText(_list.get(position).getJanr());
        holder.god_izdanie.setText(String.valueOf(_list.get(position).getGod_izdanie()));
        holder.ocenka.setText(String.valueOf(_list.get(position).getOcenka()));
    }

    @Override
    public int getItemCount() {
        return _list.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView janr;
        TextView god_izdanie ;
        TextView ocenka ;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            janr = itemView.findViewById(R.id.janr);
            god_izdanie = itemView.findViewById(R.id.god_izdanie);
            ocenka = itemView.findViewById(R.id.ocenka);
        }
    }
}
