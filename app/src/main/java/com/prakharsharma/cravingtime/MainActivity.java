package com.prakharsharma.cravingtime;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import com.prakharsharma.cravingtime.adapters.Mainadapter;
import com.prakharsharma.cravingtime.databinding.ActivityMainBinding;
import com.prakharsharma.cravingtime.models.models;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding;
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<models> list = new ArrayList<>();

        list.add(new models(R.drawable.imagea,"Pancake","3","Best seller"));
        list.add(new models(R.drawable.imageb,"Kathi roll","2","Veg rolls and non veg rolls availabe"));
        list.add(new models(R.drawable.imagec,"Chicken","5","Leg piece speciality"));
        list.add(new models(R.drawable.imaged,"Burger","1","Best bun all over india"));
        list.add(new models(R.drawable.imagee,"Chawmein","3","Fresh vegetables"));
        list.add(new models(R.drawable.imagef,"Sea food","6","Taste the salt of sea"));
        list.add(new models(R.drawable.imageg,"Brownie","4","Best chocolate brownies"));
        list.add(new models(R.drawable.imageh,"Tortilla salad","3","Fresh salad"));
        list.add(new models(R.drawable.imagei,"Sandwich","4","Use fresh bread to make sandwich"));
        list.add(new models(R.drawable.imagej,"Ice cream","1","Best scoups all around the world"));

        Mainadapter mainadapter = new Mainadapter(list,this);
       binding.recyclerview.setAdapter(mainadapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.myorders:
                startActivity(new Intent(MainActivity.this,orderactivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}