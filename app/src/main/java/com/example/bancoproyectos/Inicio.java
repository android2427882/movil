package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import com.example.bancoproyectos.regristro;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.database.sqlite.SQLiteDatabase;
public class Inicio extends AppCompatActivity {
    private EditText etu, etc;
    private Button inicio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        etu = (EditText) findViewById(R.id.edtusuario);
        etc = (EditText) findViewById(R.id.edtcontraseña);



    }
    //inicio.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                Intent I = new Intent(Inicio.this, MenuPrincipal.class);
                startActivity(I);


               /* AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion",null,1);
                SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

                //String email = et_email.getText().toString();
                //String contraseña1 = et_contraseña1.getText().toString();
                if (!email.isEmpty()&& !contraseña1.isEmpty()) {
                    Cursor fila = BaseDeDatos.rawQuery("select descripcion,precio from articulos where codigo="+email,null);
                    if(fila.moveToFirst()){
                        Intent intent = new Intent(Inicio.this, MenuPrincipal.class);
                        startActivity(intent);

                    }else{
                        Toast.makeText(this, "no existe el articulo", Toast.LENGTH_SHORT).show();
                        BaseDeDatos.close();
                    }
                        // if ( etu.equals("usuario") && contraseña.equals("contraseña")){

                    }*/

            }
            public void registro(View view) {
             /*   String usuario = etu.getText().toString();
                String contraseña = etc.getText().toString();*/

                 // if ( etu.equals("usuario") && contraseña.equals("contraseña")){
                 Intent I = new Intent(Inicio.this, regristro.class);
                 startActivity(I);



    }

        }

//}









