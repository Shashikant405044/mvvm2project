package com.example.mvvmproject.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.mvvmproject.modeldata.ProductsMainResponse;
import com.example.mvvmproject.R;
import com.example.mvvmproject.adapter.ProductsAdapter;
import com.example.mvvmproject.databinding.ActivityMainBinding;
import com.example.mvvmproject.viewsmodel.ProductViewModel;

public class ProductsActivity extends AppCompatActivity {

    ProductViewModel productModelView;
    ProductsAdapter adapter;


    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        productModelView = new ViewModelProvider(this).get(ProductViewModel.class);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        binding.recyclerView.setLayoutManager(staggeredGridLayoutManager);

        productModelView.getMainResponse().observe(this, new Observer<ProductsMainResponse>() {
            @Override
            public void onChanged(ProductsMainResponse productsMainResponse) {

                ProductsAdapter productsAdapter = new ProductsAdapter(ProductsActivity.this,productsMainResponse);
                binding.recyclerView.setAdapter(productsAdapter);
            }
        });
    }
}