package com.example.bancoproyectos.api;

import com.example.bancoproyectos.Listadoproyectos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProyectosApiService {
    @GET("proyecto")
    Call<List<Listadoproyectos>> obtenerListaProyectos();
}
