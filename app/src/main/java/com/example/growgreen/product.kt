package com.example.growgreen


data class Product(
    val productName : String,
    val category :String,
    val img : Int,
    val price :Int
)
val products = listOf(
    Product("Angel Wings", "B", R.drawable.angel_wings_cactus, 500),
    Product("Barbara Fig", "B", R.drawable.barbary_fig,200),
    Product("Cactacea Succulent", "B", R.drawable.cactaceae_succulent,200),
    Product("Ficus Microcepra", "A", R.drawable.ficus_microcarpa,10000),
    Product("Green Succulent", "A", R.drawable.green_succulent,600),
    Product("Hand Tool", "C", R.drawable.hand_tool,200),
    Product("Juniperus Chinensis", "A", R.drawable.juniperus_chinensis,7000),
    Product("Minimia", "A", R.drawable.minima,300),
    Product("Mostera Deliciosa", "A", R.drawable.monstera_deliciosa,600),
    Product("Ornamental", "A", R.drawable.ornamental,10000),
    Product("Pngwing", "A", R.drawable.pngwing,400),
    Product("Rake", "C", R.drawable.rake,300),
    Product("Red Patal", "A", R.drawable.red_petal_flowers,200),
    Product("Succulent Plant", "B", R.drawable.succulent_plant,600),
    Product("Tool Fiskars", "C", R.drawable.tool_fiskars,400),
    Product("Vase Plant", "B", R.drawable.vase_plant,500),
    Product("Watering Can", "C", R.drawable.watering_can,200),
    Product("Zanjibar Gem", "A", R.drawable.zanzibar_gem,300)

)