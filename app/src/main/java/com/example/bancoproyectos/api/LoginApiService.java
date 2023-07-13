package com.example.bancoproyectos.api;

import com.example.bancoproyectos.Login;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginApiService {
    @FormUrlEncoded
    @POST("login/")
Call<Login> login (
                @Field("username") String username,
                @Field(("password")) String password
    );
}
