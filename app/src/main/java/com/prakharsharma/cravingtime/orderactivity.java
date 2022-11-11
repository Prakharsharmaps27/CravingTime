package com.prakharsharma.cravingtime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.prakharsharma.cravingtime.adapters.Mainadapter;
import com.prakharsharma.cravingtime.adapters.orderadapter;
import com.prakharsharma.cravingtime.databinding.ActivityMainBinding;
import com.prakharsharma.cravingtime.databinding.ActivityOrderactivityBinding;
import com.prakharsharma.cravingtime.models.ordermodel;

import java.util.ArrayList;

public class orderactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityOrderactivityBinding binding;
        binding = ActivityOrderactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Sqlite helper = new Sqlite(this);
        ArrayList<ordermodel> liste = helper.liste();




        orderadapter orderadapter = new orderadapter(liste, this);
        binding.recyclerview2.setAdapter(orderadapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.recyclerview2.setLayoutManager(linearLayoutManager);


    }
}