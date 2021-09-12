package com.example.retrofitandroidsessionone.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherResponse {

    @SerializedName("cnt")
    int cnt;

    @SerializedName("list")
    List<WeatherDataModel> listData;


    public int getCnt() {
        return cnt;
    }
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<WeatherDataModel> getListData() {
        return listData;
    }
    public void setListData(List<WeatherDataModel> listData) {
        this.listData = listData;
    }
}
