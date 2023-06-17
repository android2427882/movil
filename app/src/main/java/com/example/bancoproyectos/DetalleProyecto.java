package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleProyecto extends AppCompatActivity {

    TextView tituloTextView;
    TextView detalleTextView;
    TextView estadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_proyecto);

        ListElement element =(ListElement) getIntent().getSerializableExtra("ListElement");
        tituloTextView = findViewById(R.id.tituloTextView);
        detalleTextView = findViewById(R.id.detalleTextView);
        estadoTextView = findViewById(R.id.estadoTextView);


        tituloTextView.setText(element.getName());
        tituloTextView.setTextColor(Color.parseColor(element.getColor()));

        detalleTextView.setText(element.getDescripcion());

        estadoTextView.setText(element.getStatus());
        estadoTextView.setTextColor(Color.GRAY);
    }
}