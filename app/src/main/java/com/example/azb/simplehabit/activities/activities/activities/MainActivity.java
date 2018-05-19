package com.example.azb.simplehabit.activities.activities.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.azb.simplehabit.R;
import com.example.azb.simplehabit.activities.activities.adapters.AllTopicAdapter;
import com.example.azb.simplehabit.activities.activities.adapters.SimpleHabitAdapter;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Snackbar.make(findViewById(android.R.id.content), "Welcome To Meditate", Snackbar.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_dashboard:
                    Snackbar.make(findViewById(android.R.id.content), "Welcome To Meditate", Snackbar.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_notifications:
                    Snackbar.make(findViewById(android.R.id.content), "Welcome To Meditate", Snackbar.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        RecyclerView recyclerView = findViewById(R.id.all_topic_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        AllTopicAdapter allTopicAdapter = new AllTopicAdapter(getApplicationContext());
        recyclerView.setAdapter(allTopicAdapter);


        RecyclerView recyclerViewSH = findViewById(R.id.simple_habit_recycler);
        recyclerViewSH.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        SimpleHabitAdapter simpleHabitAdapter= new SimpleHabitAdapter(getApplicationContext());
        recyclerViewSH.setAdapter(simpleHabitAdapter);
    }

}
