package com.example.growgreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.growgreen.databinding.ListItemCartsBinding

class CartsAdapter(private val onClick: (MyProducts) -> Unit) :
    ListAdapter<MyProducts, RecyclerView.ViewHolder>(CartDiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CartViewHolder(
            ListItemCartsBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            ), onClick
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        (holder as CartViewHolder).bind(item)
    }



    class CartViewHolder(
        private val binding: ListItemCartsBinding,
        val onClick: (MyProducts) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        var currentProduct :MyProducts?=null
        init {
            binding.deleteItem.setOnClickListener {
                currentProduct?.let { it1 -> onClick(it1) }
            }
            binding.addButton.setOnClickListener {  }
            binding.substractButton.setOnClickListener {  }

        }

        fun bind(item: MyProducts) {
            currentProduct =item

            binding.apply {
                 myProduct= item
                executePendingBindings()
            }
        }
    }

}
private class CartDiffUtilCallback : DiffUtil.ItemCallback<MyProducts>() {

    override fun areItemsTheSame(oldItem: MyProducts, newItem: MyProducts): Boolean {
        return oldItem.productName == newItem.productName
    }

    override fun areContentsTheSame(oldItem: MyProducts, newItem: MyProducts): Boolean {
        return oldItem == newItem
    }
}