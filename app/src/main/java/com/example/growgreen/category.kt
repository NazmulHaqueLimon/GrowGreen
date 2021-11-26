package com.example.growgreen

data class Category(
    val name :String,
    val imgId :Int
)
val categories = listOf(
    Category("Indoor",  R.drawable.snake_plant ),
    Category("Cactus",  R.drawable.cactus),
    Category("Tools",  R.drawable.gardening),

)
