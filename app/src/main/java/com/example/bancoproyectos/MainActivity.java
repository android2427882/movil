package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Temporizador temporizador;
    private ImageView ivImage;
    private TextView tvTimer;
    private boolean condicionCumplida = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivImage = findViewById(R.id.imageView3);

        ImageView timerImageView = findViewById(R.id.imageView3);
        int totalTime = 5; // Duración total del temporizador en segundos
        int interval = 1; // Intervalo de actualización del temporizador en segundos

        new CountDownTimer(totalTime * 1000, interval * 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                // No se realiza ninguna acción en cada intervalo
            }


            @Override
            public void onFinish() {
                // Acciones cuando el temporizador finaliza
                timerImageView.setImageResource(R.drawable.fondo2);
                Intent intent = new Intent(MainActivity.this,Inicio.class);
                startActivity(intent);
            }
        }.start();

    }
}