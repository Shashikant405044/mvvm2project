package com.example.mvvmproject.modeldata;

import androidx.databinding.BaseObservable;

import com.example.mvvmproject.modeldata.ProductsResponse;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductsMainResponse  extends BaseObservable {

    @SerializedName("products")
    private List<ProductsResponse> products;
    @SerializedName("total")
    private String total;

    @SerializedName("skip")
    private String skip;

    @SerializedName("limit")
    private  String limit;

    public List<ProductsResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsResponse> products) {
        this.products = products;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getSkip() {
        return skip;
    }

    public void setSkip(String skip) {
        this.skip = skip;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }
}
