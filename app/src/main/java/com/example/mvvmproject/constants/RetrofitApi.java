package com.example.mvvmproject.constants;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {
    public static final String BaseUrl = "https://dummyjson.com";

    public static <S> S getInstance( Class<S> serviceClass ){
        Retrofit retrofit =new Retrofit.Builder()
                            .baseUrl(BaseUrl)
                            .addConverterFactory(GsonConverterFactory.create(new Gson()))
                           .build();

        return retrofit.create(serviceClass);

    }
}
