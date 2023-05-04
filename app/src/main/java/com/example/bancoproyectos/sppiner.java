package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class sppiner extends AppCompatActivity {

    Spinner spinner;
    private boolean isFirstSelection = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sppiner);
        spinner = (Spinner) findViewById(R.id.spinner);

        String[] respuestas = {"perfil", "mis proyectos", "equipo de trabajo",};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, respuestas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        /**spinner.setSelection(adapter.getPosition(""));*/
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (isFirstSelection) {
                    enviarAccion(position);
                } else {
                    isFirstSelection = true;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        }
    public void enviarAccion(int position) {
        boolean spinnerEnabled = false;
        String selectedItem = spinner.getItemAtPosition(position).toString();

        if (selectedItem.equals("perfil")) {
            Intent mostrar = new Intent(this, Perfil.class);
            startActivity(mostrar);
        } else if (selectedItem.equals("mis proyectos")) {
            Intent mostrar = new Intent(this, MisProyectos.class);
            startActivity(mostrar);
        } else if (selectedItem.equals("equipo de trabajo")) {
            Intent mostrar = new Intent(this, EquipoTrabajo.class);
            startActivity(mostrar);
        }
    }

}


