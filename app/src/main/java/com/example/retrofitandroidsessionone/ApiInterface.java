package com.example.retrofitandroidsessionone;

import com.example.retrofitandroidsessionone.Model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("group")
    Call<WeatherResponse> getWeatherResponse(@Query("id") String id, @Query("units") String units, @Query("appid") String appid);

}
