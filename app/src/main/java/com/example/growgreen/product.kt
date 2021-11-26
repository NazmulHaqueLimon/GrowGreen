package com.example.growgreen


data class Product(
    val productName : String,
    val category :Int,
    val img : Int,
    val price :Int,
)
val products = listOf(
    Product("Angel Wings", 2, R.drawable.angel_wings_cactus, 500),
    Product("Barbara Fig", 2, R.drawable.barbary_fig,200),
    Product("Cactacea Succulent", 2, R.drawable.cactaceae_succulent,200),
    Product("Ficus Microcepra", 1, R.drawable.ficus_microcarpa,10000),
    Product("Green Succulent", 1, R.drawable.green_succulent,600),
    Product("Hand Tool", 3, R.drawable.hand_tool,200),
    Product("Juniperus Chinensis", 1, R.drawable.juniperus_chinensis,7000),
    Product("Minimia", 1, R.drawable.minima,300),
    Product("Mostera Deliciosa", 1, R.drawable.monstera_deliciosa,600),
    Product("Ornamental", 1, R.drawable.ornamental,10000),
    Product("Pngwing", 1, R.drawable.pngwing,400),
    Product("Rake", 3, R.drawable.rake,300),
    Product("Red Patal", 1, R.drawable.red_petal_flowers,200),
    Product("Succulent Plant", 2, R.drawable.succulent_plant,600),
    Product("Tool Fiskars", 3, R.drawable.tool_fiskars,400),
    Product("Vase Plant", 2, R.drawable.vase_plant,500),
    Product("Watering Can", 3, R.drawable.watering_can,200),
    Product("Zanjibar Gem", 1, R.drawable.zanzibar_gem,300)

)