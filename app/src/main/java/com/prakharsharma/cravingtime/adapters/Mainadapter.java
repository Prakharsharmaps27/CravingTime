package com.prakharsharma.cravingtime.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prakharsharma.cravingtime.MainActivity;
import com.prakharsharma.cravingtime.R;
import com.prakharsharma.cravingtime.detailactivity;
import com.prakharsharma.cravingtime.models.models;


import java.util.ArrayList;

public class Mainadapter extends  RecyclerView.Adapter<Mainadapter.viewholder> {

    ArrayList<models> list ;
    Context context;

    public Mainadapter(ArrayList<models> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items_view,parent,false);

        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

       final models models = list.get(position);

       holder.foodimage.setImageResource(models.getImage());
       holder.name.setText(models.getName());
       holder.price.setText(models.getPrice());
       holder.about.setText(models.getAbout());

       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(context, detailactivity.class);
               intent.putExtra("photo",models.getImage());
               intent.putExtra("num",models.getName());
               intent.putExtra("price",models.getPrice());
               intent.putExtra("about",models.getAbout());

               context.startActivity(intent);

           }
       });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView foodimage;
        TextView name , price , about;
        public viewholder(@NonNull View itemView) {

            super(itemView);

            foodimage = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            about = itemView.findViewById(R.id.about);


        }




    }
}
