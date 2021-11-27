package com.example.growgreen

data class Category(
    val name :String,
    val imgId :Int,
    val id :String
)
val categories = listOf(
    Category("Indoor",  R.drawable.snake_plant,"A" ),
    Category("Cactus",  R.drawable.cactus,"B"),
    Category("Tools", R.drawable.gardening,"C"),

)
