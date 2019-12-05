package com.nasution.cardiacare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Historyfragment extends Fragment {


    View view;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    public Historyfragment() {




    }




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.historyfragment,container,false);


        ArrayList<HistoryItem> exampleList = new ArrayList<>();
        exampleList.add(new HistoryItem("tanggal", "12/12/12", "resiko"));
        exampleList.add(new HistoryItem("tanggal", "12/12/12", "resiko"));
        exampleList.add(new HistoryItem("tanggal", "12/12/12", "resiko"));

//        //mRecyclerView = findViewById(R.id.recyclerview);
//        mRecyclerView.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(this);
//        mAdapter = new HistoryAdapter(exampleList);
//
//        mRecyclerView.setLayoutManager(mLayoutManager);
//        mRecyclerView.setAdapter(mAdapter);


        return view;
    }


    public class History extends AppCompatActivity {
        private RecyclerView mRecyclerView;
        private RecyclerView.Adapter mAdapter;
        private RecyclerView.LayoutManager mLayoutManager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.historyfragment);

            ArrayList<HistoryItem> exampleList = new ArrayList<>();
            exampleList.add(new HistoryItem("tanggal", "12/12/12", "resiko"));
            exampleList.add(new HistoryItem("tanggal", "12/12/12", "resiko"));
            exampleList.add(new HistoryItem("tanggal", "12/12/12", "resiko"));

            mRecyclerView = findViewById(R.id.recyclerview);
            mRecyclerView.setHasFixedSize(true);
            mLayoutManager = new LinearLayoutManager(this);
            mAdapter = new HistoryAdapter(exampleList);

            mRecyclerView.setLayoutManager(mLayoutManager);
            mRecyclerView.setAdapter(mAdapter);
        }
    }

}
