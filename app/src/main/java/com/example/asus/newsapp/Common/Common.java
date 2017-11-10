package com.example.asus.newsapp.Common;

import com.example.asus.newsapp.Interface.IconBetterIdeaService;
import com.example.asus.newsapp.Interface.NewsService;
import com.example.asus.newsapp.Model.IconBetterIdea;
import com.example.asus.newsapp.Remote.IconBetterIdeaClient;
import com.example.asus.newsapp.Remote.RetrofitClient;

/**
 * Created by ASUS on 11/10/17.
 */

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public static final String API_KEY="6454184c0ae0407fb2c242cfd842f6f1";

    public static NewsService getNewsService(){
        return RetrofitClient.getCleint(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService(){
        return IconBetterIdeaClient.getCleint().create(IconBetterIdeaService.class);
    }
}
