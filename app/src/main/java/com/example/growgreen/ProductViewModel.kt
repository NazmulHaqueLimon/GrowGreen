package com.example.growgreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap

class ProductViewModel:ViewModel() {

    private val carts = mutableListOf<MyProducts>()

    private val _cartLiveData= MutableLiveData<List<MyProducts>>()
    val cartLiveData :LiveData<List<MyProducts>> =_cartLiveData

    private val _totalPrice =MutableLiveData<Int>()
    val totalPrice:LiveData<Int> =_totalPrice

    fun calculateTotalPrice(){
        var total =0
        cartLiveData.value?.let {
            it.map { myProducts ->
                total += (myProducts.price*myProducts.quantity)
            }
        }
        _totalPrice.value=total
    }

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