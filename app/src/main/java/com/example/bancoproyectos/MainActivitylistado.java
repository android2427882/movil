package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.bancoproyectos.api.ProyectosApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivitylistado extends AppCompatActivity {

    RecyclerView recyclerView;
    ListaListadoProyectosAdapter listaListadoProyectosAdapter;
    Retrofit retrofit;
    ImageView imageView;
    private static final String TAG = "proyecto";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        recyclerView = findViewById(R.id.card_recycler_view);
        listaListadoProyectosAdapter = new ListaListadoProyectosAdapter(this);
        recyclerView.setAdapter(listaListadoProyectosAdapter);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, true);
        recyclerView.setLayoutManager(linearLayoutManager);


        retrofit = new Retrofit.Builder()
                .baseUrl("https://lexa2334.pythonanywhere.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        imageView = findViewById(R.id.imagenGlide);
        setImageView();
        obtenerDatos();











    }


    private void setImageView() {
        String url = "";
        Glide.with(this)
                .load(url)

                .into(imageView);

    }

    private void obtenerDatos() {
        ProyectosApiService service = retrofit.create(com.example.bancoproyectos.api.ProyectosApiService.class);

        Call<List<Listadoproyectos>> productsRespuestaCall = service.obtenerListaProyectos();
        productsRespuestaCall.enqueue(new Callback<List<Listadoproyectos>>() {
            @Override
            public void onResponse(Call<List<Listadoproyectos>> call, Response<List<Listadoproyectos>> response) {
                if (response.isSuccessful()) {
                    List<Listadoproyectos> proyectos = response.body();
                    for (int i = 0; i < proyectos.size(); i++) {
                        Listadoproyectos p= proyectos.get(i);
                        Log.e(TAG, "products: " + p.getNombre_proyecto());
                    }

                    listaListadoProyectosAdapter.add((ArrayList<Listadoproyectos>) proyectos);
                }
            }

            @Override
            public void onFailure(Call<List<Listadoproyectos>> call, Throwable t) {

            }



        });
    }

}