package com.example.asus.newsapp.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ASUS on 11/10/17.
 */

public class RetrofitClient {
    private static Retrofit retrofit=null;
    public static Retrofit getCleint(String baseUrl)
    {
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
