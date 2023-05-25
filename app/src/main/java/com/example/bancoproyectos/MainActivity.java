package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static final int MAX_ATTEMPTS = 3; // Número máximo de intentos
    private int currentAttempt = 0; // Contador de intentos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Llama a la función después de 2 segundos
        llamarOtraClaseDespuesDeDosSegundos();
    }
    private void llamarOtraClaseDespuesDeDosSegundos() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (currentAttempt < MAX_ATTEMPTS) {
                    // Código para llamar a la otra clase aquí
                    Intent intent = new Intent(MainActivity.this, Inicio.class);
                    startActivity(intent);
                    currentAttempt++;
                } else {
                    // Código para manejar el límite de intentos alcanzado
                    // ...
                }
            }
        }, 2000); // 2000 milisegundos = 2 segundos
    }


}