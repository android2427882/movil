package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {


    private TextView T1, T2, T3;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        T2=findViewById(R.id.text2);
        Intent intent=getIntent();
        String accessT=intent.getStringExtra("token");
        T2.setText(accessT);


        T1 = (TextView) findViewById(R.id.text1);
        T2 = (TextView) findViewById(R.id.text2);
        T3 = (TextView) findViewById(R.id.text3);


    }

    public void onClick(View view) {


            Intent intent = new Intent(Perfil.this, MenuPrincipal.class);
            startActivity(intent);
        }
    }
