package com.example.bancoproyectos;

import android.os.CountDownTimer;

public class Temporizador {

    private CountDownTimer countDownTimer;
    private OnTimerListener timerListener;

    public Temporizador(long tiempoInicial, long intervalo) {
        countDownTimer = new CountDownTimer(tiempoInicial, intervalo) {
            @Override
            public void onTick(long millisUntilFinished) {
                // Código a ejecutar en cada tick (intervalo)
            }

            @Override
            public void onFinish() {
                // Código a ejecutar cuando el temporizador se completa
                if (timerListener != null) {
                    timerListener.onTimerFinished();
                }
            }
        };
    }

    public void start() {
        countDownTimer.start();
    }

    public void cancel() {
        countDownTimer.cancel();
    }

    public void setOnTimerListener(OnTimerListener listener) {
        timerListener = listener;
    }

    public interface OnTimerListener {
        void onTimerFinished();
    }
}

