package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.bancoproyectos.api.LoginApiService;

import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Inicio extends AppCompatActivity {
    private EditText etu, etc;
    private Button inicio;
    LoginApiService loginApiService;
    Retrofit retrofit;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        etu = (EditText) findViewById(R.id.edtusuario);
        etc = (EditText) findViewById(R.id.edtcontraseña);
        boton= findViewById(R.id.buttoniniciar);
        EditText passwordEditText = findViewById(R.id.edtcontraseña);
        CheckBox showPasswordCheckbox = findViewById(R.id.checkBox);

        showPasswordCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Cambiar el tipo de entrada a "texto normal" para mostrar la contraseña
                    passwordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    // Cambiar el tipo de entrada a "contraseña" para ocultar la contraseña
                    passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }

                // Mover el cursor al final del texto
                passwordEditText.setSelection(passwordEditText.getText().length());
            }
        });


        retrofit = new Retrofit.Builder()
                .baseUrl("https://lexa2334.pythonanywhere.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        loginApiService=retrofit.create(LoginApiService.class);
         boton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String usern =etu.getText().toString();
                 String pass = etc.getText().toString();
                 Call<Login> call = loginApiService.login(usern, pass );
                 call.enqueue(new Callback<Login>() {
                     @Override
                     public void onResponse(Call<Login> call, Response<Login> response) {
                         if(response.isSuccessful()) {
                             Login login = response.body();
                             String token=login.getAccess_token();
                             /* Toast.makeText(Inicio.this,token,Toast.LENGTH_LONG).show();*/
                             Intent I = new Intent(Inicio.this, MainActivitylistado.class);
                             I.putExtra("token",token);
                             startActivity(I);


                         }

                     }

                     @Override
                     public void onFailure(Call<Login> call, Throwable t) {


                     }
                 });

             }
         });
    }
   /* public  void incio(View v){
        loginApiService=retrofit.create(LoginApiService.class);
        String usern =etu.getText().toString();
        String pass = etc.getText().toString();
        Call<Login> call = loginApiService.login(usern, pass );
        call.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                if(response.isSuccessful()) {
                    Login login = response.body();
                    String token=login.getAccess_token();
                    Toast.makeText(Inicio.this,token,Toast.LENGTH_LONG).show();


                }

            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {


            }
        });


    }*/


           /*  public void onClick(View view) {
                loginApiService=retrofit.create(LoginApiService.class);

                Intent I = new Intent(Inicio.this, MenuPrincipal.class);
                startActivity(I);







}*/
}

//}









