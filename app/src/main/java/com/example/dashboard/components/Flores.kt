package com.example.dashboard.components

import com.example.dashboard.R

sealed class Flores(
    val image: Int,
    val name: String,
    val descripcion: String,
    val precio: String,
) {
    object Flores1 : Flores(R.drawable.floresitas2, "Leche", "boton1","18000")
    object Flores2 : Flores(R.drawable.floresitas3, "Leche Deslactosada", "boton2","250000")
    object Flores3 : Flores(R.drawable.floresitas4, "Leche AAA", "boton3","250000")
}
