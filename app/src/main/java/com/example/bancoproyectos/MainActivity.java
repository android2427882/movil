package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private boolean condicionCumplida = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    boolean condicionCumplida = true;

    if (condicionCumplida) {
        Intent intent = new Intent(this,Inicio.class);
        startActivity(intent);

    }
}
}