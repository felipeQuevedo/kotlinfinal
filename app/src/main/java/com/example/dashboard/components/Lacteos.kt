package com.example.dashboard.components

import com.example.dashboard.R

sealed class Lacteos(
    val image: Int,
    val name: String,
    val descripcion: String,
    val precio: String,
) {
    object Lacteo1 : Lacteos(R.drawable.lechita1, "Leche", "leche de toro","18000")
    object Lacteo2 : Lacteos(R.drawable.lechita2, "Leche Deslactosada", "cremosita","250000")
    object Lacteo3 : Lacteos(R.drawable.lechita3, "Leche AAA", "Cremosita","250000")
    object Lacteo4 : Lacteos(R.drawable.lechita4, "Leche BBB", "Cremosita","250000")
}
