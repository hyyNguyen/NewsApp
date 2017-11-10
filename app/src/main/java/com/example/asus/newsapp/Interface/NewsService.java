package com.example.asus.newsapp.Interface;

import com.example.asus.newsapp.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ASUS on 11/10/17.
 */

public interface NewsService {
    @GET("v1/sources?language=vn")
    Call<WebSite> getSources();
}
