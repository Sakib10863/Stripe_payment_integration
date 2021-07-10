package com.example.stripe_payment_integration.fragments.cartfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stripe_payment_integration.databinding.CartItemLayoutBinding
import com.example.stripe_payment_integration.model.CartItem

class CartItemAdapter : RecyclerView.Adapter<CartItemAdapter.MyViewHolder>() {

    private var data: List<CartItem> = emptyList()
    class MyViewHolder(private val binding: CartItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(cartItem: CartItem) {
            binding.itemTitle.text = cartItem.productName
            binding.itemCount.text = "${cartItem.productCount} X Pcs"
            binding.itemPrice.text = "$${cartItem.productBasePrice * cartItem.productCount}"
            binding.itemImage.setImageBitmap(cartItem.productCover)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            CartItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setData(data : List<CartItem>){
        this.data = data
    }
}