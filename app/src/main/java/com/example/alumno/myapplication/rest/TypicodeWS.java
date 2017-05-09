package com.example.alumno.myapplication;

import com.example.alumno.myapplication.rest.LoginResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;


public interface TypicodeWS {
    /*
    * GET -> Obtener datos
    * POST -> Enviar datos
    * PUT -> Actualizar datos
    * DELETE -> Eliminar datos
    * PATCH -> Actualizar datos
    */

    @GET("dologin/")
    Call<ArrayList<LoginResponse>> Login();
}
