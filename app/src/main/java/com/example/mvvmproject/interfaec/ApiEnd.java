package com.example.mvvmproject.interfaec;

import com.example.mvvmproject.modeldata.ProductsMainResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEnd
{
    @GET("/products")
    Call<ProductsMainResponse> getAllMainData();
}
