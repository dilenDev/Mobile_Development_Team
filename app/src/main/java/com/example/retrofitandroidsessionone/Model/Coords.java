package com.example.retrofitandroidsessionone.Model;

import com.google.gson.annotations.SerializedName;

public class Coords {

    @SerializedName("lon")
    double lon;

    @SerializedName("lat")
    double lat;

    @Override
    public String toString() {
//        return "Coords{" +
//                "lon=" + lon +
//                ", lat=" + lat +
//                '}';
        return "("+lon + "," + lat +  ")";
    }
}
