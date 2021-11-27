package com.example.growgreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel:ViewModel() {

    val carts = mutableListOf<MyProducts>()

    val _category =MutableLiveData<String>("A")
    val category :LiveData<String> =_category

    fun setCategory(id :String){
        _category.value =id
    }
    fun addToCart(plant: MyProducts){
        carts.add(plant)
    }
}