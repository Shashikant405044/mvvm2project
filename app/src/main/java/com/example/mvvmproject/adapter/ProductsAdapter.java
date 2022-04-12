package com.example.mvvmproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmproject.views.ProductsActivity;
import com.example.mvvmproject.modeldata.ProductsMainResponse;
import com.example.mvvmproject.modeldata.ProductsResponse;
import com.example.mvvmproject.R;
import com.example.mvvmproject.databinding.ItemlistBinding;

import java.util.ArrayList;
import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.MyViewHolder> {

    private Context context;
   List<ProductsResponse> productsResponse = new ArrayList<>();

    public ProductsAdapter(Context context, ProductsMainResponse productsResponse) {
        this.context = context;
        this.productsResponse = (List<ProductsResponse>) productsResponse;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemlistBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.itemlist,parent,false);

      return new MyViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.binding.setProductsIds(productsResponse.get(position));

    }

    @Override
    public int getItemCount() {
        return productsResponse.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ItemlistBinding binding;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.binding = binding;
        }
    }
}
