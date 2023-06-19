package com.example.agriculture

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.agriculture.databinding.ProductListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ProductRvAdapter(var productList: List<ProductData>):RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding=ProductListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        var currentProduct=productList.get(position)
        var binding=holder.binding
        binding.tvname.text=currentProduct.name
        binding.tvprice.text= currentProduct.price.toString()
        binding.ivavator.imageAlpha


        Picasso
            .get()
            .load(currentProduct.avator)
//            .resize(80,80)
//            .centerCrop()
            .placeholder(R.drawable.mangoe)
            .transform(CropCircleTransformation())
            .error(R.drawable.mangoe)
            .into(binding.ivavator)

    }

}

class ProductViewHolder(val binding: ProductListItemBinding):ViewHolder(binding.root){

}