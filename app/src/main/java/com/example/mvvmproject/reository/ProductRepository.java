package com.example.mvvmproject.reository;

import android.app.Application;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvmproject.interfaec.ApiEnd;
import com.example.mvvmproject.modeldata.ProductsMainResponse;
import com.example.mvvmproject.constants.RetrofitApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductRepository {


    List<ProductsMainResponse> productsResponses = new ArrayList<>();
    private Application application;

    MutableLiveData<ProductsMainResponse> mutableLiveData =new MutableLiveData<ProductsMainResponse>();

    public ProductRepository(Application application) {

        this.application = application;
    }

    public MutableLiveData<ProductsMainResponse> getPostData() {


        ApiEnd apiEnd = RetrofitApi.getInstance(ApiEnd.class);

          Call<ProductsMainResponse> call = apiEnd.getAllMainData();

          call.enqueue(new Callback<ProductsMainResponse>() {
              @Override
              public void onResponse(Call<ProductsMainResponse> call, Response<ProductsMainResponse> response) {



                mutableLiveData.postValue(response.body());


              }

              @Override
              public void onFailure(Call<ProductsMainResponse> call, Throwable t) {
                  Toast.makeText(application.getApplicationContext(), ""+t, Toast.LENGTH_SHORT).show();
              }
          });

          return mutableLiveData;

    }

}
