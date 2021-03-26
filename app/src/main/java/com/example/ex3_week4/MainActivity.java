package com.example.ex3_week4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ex3_week4.model.CartAdapter;
import com.example.ex3_week4.model.Cat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CartAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rev);
        adapter = new CartAdapter(this);
        adapter.setData(getAll());
        GridLayoutManager manager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
    private List<Cat> getAll(){
        List<Cat> list = new ArrayList<>();
        list.add(new Cat(R.drawable.img1, "Cat 1") );
        list.add(new Cat(R.drawable.img2, "Cat 2") );
        list.add(new Cat(R.drawable.img3, "Cat 3"));
        list.add(new Cat(R.drawable.img4, "Cat 4"));
        list.add(new Cat(R.drawable.img5, "Cat 5"));
        return list;
    }
}