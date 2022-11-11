package com.prakharsharma.cravingtime.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prakharsharma.cravingtime.R;
import com.prakharsharma.cravingtime.models.ordermodel;

import java.util.ArrayList;

public class orderadapter extends RecyclerView.Adapter<orderadapter.viewholder>{


    ArrayList<ordermodel> liste;
    Context context;

    public orderadapter(ArrayList<ordermodel> model, Context context) {
        this.liste = model;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.orders_view,parent,false);

        return new viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        final ordermodel ordermodel = liste.get(position);
        holder.orderimage.setImageResource(ordermodel.getOrderimage());
        holder.foodname.setText(ordermodel.getFoodname());
        holder.ordernumber.setText(ordermodel.getOrdernumber());
        holder.foodprice.setText(ordermodel.getFoodprice());
        holder.personname.setText(ordermodel.getPersonname());
        holder.quantityy.setText(ordermodel.getQuantityy());


    }

    @Override
    public int getItemCount() {
        return liste.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{

        ImageView orderimage;
        TextView foodname , ordernumber , foodprice , personname, quantityy;

        public viewholder(@NonNull View itemView) {

            super(itemView);

            orderimage = itemView.findViewById(R.id.orderimage);
            foodname = itemView.findViewById(R.id.foodname);
            ordernumber = itemView.findViewById(R.id.ordernumber);
            foodprice = itemView.findViewById(R.id.foodprice);
            personname = itemView.findViewById(R.id.personname);
            quantityy = itemView.findViewById(R.id.quantityy);
        }
    }
}
