package com.example.retrofitandroidsessionone.Model;

import com.google.gson.annotations.SerializedName;

public class WeatherDataModel {

    @SerializedName("dt")
    long dt;

    @SerializedName("id")
    long id;

    @SerializedName("name")
    String name;


    @SerializedName("coord")
    Coords coord;

    //


    @Override
    public String toString() {
//        return "WeatherDataModel{" +
//                "dt=" + dt +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", coord=" + coord +
//                '}';

        return "("+id + "," + name + "," + dt + "," + coord + ")";
    }


    //
    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //
    public Coords getCoord() {
        return coord;
    }
    public void setCoord(Coords coord) {
        this.coord = coord;
    }
}
