package com.example.smart_housekyudyakov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class add_room extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window W = getWindow();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION //Скрываем нижнюю панель навигации
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY); //Появляется поверх приложения и исчезает
        setContentView(R.layout.activity_add_room);
    }

    public void BackToActivityHomepage(View v) {
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);

    }
}