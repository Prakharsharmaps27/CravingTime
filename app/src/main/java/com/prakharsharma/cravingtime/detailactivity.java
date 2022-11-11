package com.prakharsharma.cravingtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.prakharsharma.cravingtime.databinding.ActivityDetailactivityBinding;

import java.util.zip.Inflater;

public class detailactivity extends AppCompatActivity {

    ActivityDetailactivityBinding detailactivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        detailactivityBinding = ActivityDetailactivityBinding.inflate(getLayoutInflater());
        setContentView(detailactivityBinding.getRoot());


        int image = getIntent().getIntExtra("photo",0);
        int price = Integer.parseInt(getIntent().getStringExtra("price"));
        String about = getIntent().getStringExtra("about");
        String name = getIntent().getStringExtra("num");

        detailactivityBinding.detailimage.setImageResource(image);
        detailactivityBinding.detailname.setText(name);
        detailactivityBinding.detaildescription.setText(about);
        detailactivityBinding.detailprice.setText(String.format("%d",price));

        detailactivityBinding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Sqlite helper = new Sqlite(this);

        detailactivityBinding.ordernow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               boolean isinserted =  helper.insertorder(detailactivityBinding.PersonName.getText().toString(),detailactivityBinding
                        .PersonNumber.getText().toString()
                        ,price
                        ,about
                        ,name
                        ,image
                        ,Integer.parseInt(detailactivityBinding.quantity.getText().toString())
                        );
            }
        });


    }
}