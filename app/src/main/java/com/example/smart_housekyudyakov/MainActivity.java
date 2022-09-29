package com.example.smart_housekyudyakov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_your_house);
    }

    public void start_new_resident(View v) {
        Intent intent = new Intent(this, new_resident.class);
        startActivity(intent);
    }

}