package com.example.mvvmproject.modeldata;

import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductsResponse  extends BaseObservable {

    @SerializedName("id")
    public int id;

    @SerializedName("title")
    public String title;

    @SerializedName("description")
    public String description;

    @SerializedName("price")
    public int price;

    @SerializedName("discountPercentage")
    public double discountPercentage;

    @SerializedName("rating")
    public String rating;

    @SerializedName("stock")
    public  int stock;

    @SerializedName("brand")
    public  String brand;

    @SerializedName("category")
    public  String category;

    @SerializedName("thumbnail")
    public String thumbnail;

    @SerializedName("images")
    public List<String> images;


    public void setId(int id) {
        this.id = id;

    }

    public void setTitle(String title) {
        this.title = title;

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    // Getter start Here ............................

    @Bindable
    public int getId() {
        return id;
    }
    @Bindable
    public String getTitle() {
        return title;
    }
    @Bindable
    public String getDescription() {
        return description;
    }

    @Bindable
    public int getPrice() {
        return price;
    }

    @Bindable
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    @Bindable
    public String getRating() {
        return rating;
    }

    @Bindable
    public int getStock() {
        return stock;
    }

    @Bindable
    public String getBrand() {
        return brand;
    }

    @Bindable
    public String getCategory() {
        return category;
    }

    @Bindable
    public String getThumbnail() {
        return thumbnail;
    }

    @Bindable
    public List<String> getImages() {
        return images;
    }

    @BindingAdapter("android:src")
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext()).load(imageUrl).apply(new RequestOptions()).into(view);
    }
}
