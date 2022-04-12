package com.example.mvvmproject.viewsmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvmproject.modeldata.ProductsMainResponse;
import com.example.mvvmproject.reository.ProductRepository;

public class ProductViewModel extends AndroidViewModel {

 ProductRepository productRepository;

    public ProductViewModel(@NonNull Application application) {
        super(application);
        productRepository = new ProductRepository(application);
    }

  public MutableLiveData<ProductsMainResponse> getMainResponse()
  {
      return productRepository.getPostData();
  }

}
