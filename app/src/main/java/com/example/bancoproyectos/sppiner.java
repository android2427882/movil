package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class sppiner extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sppiner);
        spinner = (Spinner)findViewById(R.id.spinner);

       String  [] respuestas = {"perfil","mis proyectos","equipo de trabajo"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,respuestas);
        spinner.setAdapter(adapter);

    }
    public void seleccionado (View view){
        String seleccionado = spinner.getSelectedItem().toString();
        if (seleccionado.equals("perfil")){
        /*intent seleccionado = new intent(this,Perfil.class);
        startActivity(seleccionado);]*/


        }
        else if (seleccionado.equals("mis proyectos")){

        } else if (seleccionado.equals("equipo de trabajo")) {

        }
    }
}