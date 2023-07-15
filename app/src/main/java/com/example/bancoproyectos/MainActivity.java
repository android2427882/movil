package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {



    private ImageView ivImage;

    private boolean condicionCumplida = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivImage = findViewById(R.id.logoImageView);

        /*temporizador = new Temporizador(3000000, 100000); // Temporizador de 30 segundos (30000 ms) con intervalo de 1 segundo (1000 ms)
        temporizador.setOnTimerListener(new Temporizador.OnTimerListener() {

            public void onTimerFinished() {
                Toast.makeText(MainActivity.this, "Temporizador completado", Toast.LENGTH_SHORT).show();
            }
        });

        temporizador.start();

        boolean condicionCumplida = false;

        if (condicionCumplida) {
            Intent intent = new Intent(this, Inicio.class);
            startActivity(intent);

        }
    }
    public void onDestroy() {
        super.onDestroy();
        temporizador.cancel(); //
    }
    private void updateTimer(long milliseconds) {
        int seconds = (int) (milliseconds / 1000);
        int minutes = seconds / 60;
        seconds = seconds % 60;

        String timeLeft = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

    }
    private void updateImage() {

        ivImage.setImageResource(R.drawable.iconomovilmain);
    }*/
    }
}