package com.example.dashboard.components

import com.example.dashboard.R

sealed class Huevos(
    val image: Int,
    val name: String,
    val descripcion: String,
    val precio: String,
) {
    object Huevo1 : Huevos(R.drawable.huevitos1, "Huevos A","Huevos ricos","180000")
    object Huevo2 : Huevos(R.drawable.huevitos2, "Huevos AA","Huevos el doble de ricos","400000")
    object Huevo3 : Huevos(R.drawable.huevitos3, "Huevos AAA","Huevos pero 3 veces mas ricos","500000")
    object Huevo4 : Huevos(R.drawable.huevitos4, "Huevos AAA","Huevos pero 3 veces mas ricos","500000")

}
