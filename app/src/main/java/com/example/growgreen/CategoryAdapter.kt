package com.example.growgreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.growgreen.databinding.ItemCategoryBinding


class CategoryAdapter(private val onClick: (Category) -> Unit)  :ListAdapter<Category,RecyclerView.ViewHolder>(CategoryDiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CategoryViewHolder(
            ItemCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false
            ),onClick
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val plant = getItem(position)
        (holder as CategoryViewHolder).bind(plant)
    }



    class CategoryViewHolder(
        private val binding:  ItemCategoryBinding,
        private val onClick: (Category) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        var currentCategory :Category?=null
        init {
            binding.categoryContainer.setOnClickListener {
                currentCategory?.let { it1 -> onClick(it1) }
            }
        }

        fun bind(item: Category) {
            currentCategory =item
            binding.apply {
                category = item
                executePendingBindings()
            }
        }
    }

}
private class CategoryDiffUtilCallback : DiffUtil.ItemCallback<Category>() {

    override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
        return oldItem == newItem
    }
}