package com.example.hp.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Click On START THE TOUR", Toast.LENGTH_LONG).show();
    }

    public void openTourActivity(View view) {
        Intent i = new Intent(this, TourActivity.class);
        startActivity(i);
    }

}
