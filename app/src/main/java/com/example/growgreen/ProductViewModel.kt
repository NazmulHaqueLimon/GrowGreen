package com.example.growgreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel:ViewModel() {

    val _myCarts =MutableLiveData<List<Product>>()
    val myCarts :LiveData<List<Product>> =_myCarts
}