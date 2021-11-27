package com.example.growgreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel:ViewModel() {

    private val carts = mutableListOf<MyProducts>()

    private val _cartLiveData= MutableLiveData<List<MyProducts>>()
    val cartLiveData :LiveData<List<MyProducts>> =_cartLiveData


    val _category =MutableLiveData<String>("A")
    val category :LiveData<String> =_category

    fun setCategory(id :String){
        _category.value =id
    }
    fun addToCart(plant: MyProducts){
        carts.add(plant)
        _cartLiveData.value =carts
    }

    fun removeCart(it: MyProducts) {
        carts.remove(it)
        _cartLiveData.value =carts
    }
    fun updateCartItem(item :MyProducts){
       // val newCarts =carts.
    }
}