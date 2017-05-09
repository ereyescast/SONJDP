package com.example.alumno.myapplication;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by Angie on 06/05/2017.
 */

public class HelperWS {
    public static Retrofit obtenerConfiguracion() {
        return new Retrofit.Builder()
                .baseUrl("http://localhost:8081/UserAccount/login/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
