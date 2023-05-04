package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);


    }

    public void click(View view) {
        Intent click = new Intent(this, sppiner.class);
        startActivity(click);
    }
}