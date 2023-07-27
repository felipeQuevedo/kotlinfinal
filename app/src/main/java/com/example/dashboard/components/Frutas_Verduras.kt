package com.example.dashboard.components

import com.example.dashboard.R

sealed class Frutas_Verduras(
    val image: Int,
    val name: String,
    val descripcion: String,
    val precio: String,
) {
    object Fruta_V1 : Frutas_Verduras(R.drawable.verduritas1, "Leche", "boton1","18000")
    object Fruta_V2 : Frutas_Verduras(R.drawable.verduritas2, "Leche Deslactosada", "boton2","250000")
    object Fruta_V3 : Frutas_Verduras(R.drawable.verduritas3, "Leche AAA", "boton3","250000")
    object Fruta_V4 : Frutas_Verduras(R.drawable.verduritas4, "Leche AAA", "boton3","250000")

}
