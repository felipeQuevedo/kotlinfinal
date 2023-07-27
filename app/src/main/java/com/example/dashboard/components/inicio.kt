package com.example.dashboard.components

import com.example.dashboard.R

sealed class Inicio(
    val image: Int,
    val name: String,
    val descripcion: String,
    val precio: String,
) {
    object Inicio1 : Inicio(R.drawable.huevitos1, "Huevos A","Huevos ricos","180000")
    object Inicio2 : Inicio(R.drawable.floresitas2, "Huevos AA","Huevos el doble de ricos","400000")
    object Inicio3 : Inicio(R.drawable.lechita3, "Huevos AAA","Huevos pero 3 veces mas ricos","500000")
    object Inicio4 : Inicio(R.drawable.huevitos4, "Huevos AAA","Huevos pero 3 veces mas ricos","500000")

}
