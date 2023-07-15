package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class crearProyecto extends AppCompatActivity {

    EditText et_nombre,et_descripcion,et_estado;


   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_proyecto);
        et_nombre= (EditText)findViewById(R.id.edit1);
        et_descripcion= (EditText)findViewById(R.id.edit2);
        et_estado = (EditText)findViewById(R.id.edit3);
    }*/
    public void Registrar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion1",null,1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String nombre = et_nombre.getText().toString();
        String descripcion = et_descripcion.getText().toString();
        String estado = et_estado.getText().toString();

        if(!nombre.isEmpty() && !descripcion.isEmpty() && !estado.isEmpty()){
            ContentValues registro = new ContentValues();

            registro.put("nombre",nombre);
            registro.put("descripcion",descripcion);
            registro.put("estado",estado);

            BaseDeDatos.insert("banco_proyectos",null,registro);//se hace la insercion
            BaseDeDatos.close();
            et_nombre.setText("");
            et_descripcion.setText("");
            et_estado.setText("");
            Toast.makeText(this, "Registro Exitoso:", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Debes ingresar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }
    public void Buscar(View view){

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion1",null,1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String nombre = et_nombre.getText().toString();

        if (!nombre.isEmpty()) {
            Cursor fila = BaseDeDatos.rawQuery("select descripcion,estado from banco_proyecto where nombre="+nombre,null);
            if(fila.moveToFirst()){
                et_descripcion.setText(fila.getString(0));
                et_estado.setText(fila.getString(1));
                BaseDeDatos.close();
            }else{
                Toast.makeText(this, "no existe los datos " +this.et_nombre, Toast.LENGTH_SHORT).show();
                BaseDeDatos.close();
            }


        }else{
            Toast.makeText(this, "debe ingresar datos", Toast.LENGTH_SHORT).show();
        }
    }
}