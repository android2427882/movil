package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    private EditText etu, etc;
    private Button inicio;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        etu = (EditText) findViewById(R.id.edtusuario);
        etc = (EditText) findViewById(R.id.edtcontraseña);
        inicio = (Button) findViewById(R.id.iniciose);


    }
    //inicio.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
             /*   String usuario = etu.getText().toString();
                String contraseña = etc.getText().toString();*/

               // if ( etu.equals("usuario") && contraseña.equals("contraseña")){
                    Intent intent = new Intent(Inicio.this, MenuPrincipal.class);
                    startActivity(intent);



            }

        }

//}









