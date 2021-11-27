package com.example.growgreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.growgreen.databinding.ListItemPlantBinding

class ProductAdapter(private val onClick: (Product) -> Unit) :ListAdapter<Product,RecyclerView.ViewHolder>(ProductDiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PlantViewHolder(
            ListItemPlantBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            ), onClick
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val plant = getItem(position)
        (holder as PlantViewHolder).bind(plant)
    }



    class PlantViewHolder(
        private val binding: ListItemPlantBinding,
        val onClick: (Product) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {
        var currentProduct :Product?=null
        init {
            binding.cart.setOnClickListener {
                currentProduct?.let { it1 -> onClick(it1) }
            }
        }

        fun bind(item: Product) {
            currentProduct =item

            binding.apply {
                product = item
                executePendingBindings()
            }
        }
    }

}
private class ProductDiffUtilCallback : DiffUtil.ItemCallback<Product>() {

    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.productName == newItem.productName
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }
}