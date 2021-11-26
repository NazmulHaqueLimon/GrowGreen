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
    ): View? {
        binding= FragmentProductsBinding.inflate(inflater,container,false).apply {
            lifecycleOwner =viewLifecycleOwner
        }
        val adapter =ProductAdapter()
        binding.plantList.adapter =adapter


        adapter.submitList(products)

        return binding.root
    }

}