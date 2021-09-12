package com.example.retrofitandroidsessionone;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    final static String BASE_URL = "http://api.openweathermap.org/data/2.5/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){

        OkHttpClient client = new OkHttpClient.Builder().build();

        // Retrofit instance
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return retrofit;


    }


}
