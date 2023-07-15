package com.example.bancoproyectos.api;

import com.example.bancoproyectos.Listadoproyectos;
import com.example.bancoproyectos.perfil.Perfils;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PerfilApiService {
    @GET("/perfil")
    Call<List<Perfils>> obtenerListaPerfil();

}
