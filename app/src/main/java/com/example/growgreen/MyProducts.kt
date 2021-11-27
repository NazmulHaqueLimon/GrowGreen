package com.example.growgreen

data class MyProducts(
    val productName : String,
    val category :String,
    val img : Int,
    val price :Int,
    val quantity :Int
){
    @JvmName("getPrice1")
    fun getPrice():Int{
        return price*quantity
    }
}
