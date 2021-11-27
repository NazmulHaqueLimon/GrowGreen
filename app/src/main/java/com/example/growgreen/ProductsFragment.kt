package com.example.growgreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.growgreen.databinding.FragmentProductsBinding


class ProductsFragment : Fragment() {

    private lateinit var binding: FragmentProductsBinding
    private val viewModel : ProductViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentProductsBinding.inflate(inflater,container,false).apply {
            lifecycleOwner =viewLifecycleOwner
        }

        //setup the categories
        val categoryAdapter =CategoryAdapter{
            onCategoryItemClick(it)
        }
        binding.categoryList.adapter = categoryAdapter
        categoryAdapter.submitList(categories)


        //display the products
        val adapter =ProductAdapter{
            productCartOnClick(it)
        }
        binding.plantList.adapter =adapter

       // val filteredList = mutableListOf<Product>()
        viewModel.category.observe(viewLifecycleOwner,{
            val filteredList = mutableListOf<Product>()
            products.map {product->
                if(product.category == it){
                    filteredList.add(product)
                }
            }
            adapter.submitList(filteredList)
        })




        return binding.root
    }

    private fun onCategoryItemClick(it: Category) {
        viewModel.setCategory(it.id)
    }

    private fun productCartOnClick(it: Product) {
        val myProduct =MyProducts(
            productName =it.productName,
            category =it.category,
            img =it.img,
            price =it.price,
            quantity =1
        )
        viewModel.addToCart(myProduct)
    }

}