package com.example.dashboard.components

import com.example.dashboard.R

sealed class Info(
    val image: Int,
    val name: String,
    val descripcion: String,
) {
    object Info1 : Info(R.drawable.senitas, "Informacion Acerca del Sena","Somos un establecimiento público del orden Nacional y con autonomía administrativa, adscrito al Ministerio del Trabajo.\n" +
            "Ofrecemos formación gratuita a millones de colombianos que se benefician con programas técnicos, tecnológicos y complementarios que enfocados en el desarrollo económico, científico y social del país, entran a fortalecer las actividades productivas de las empresas y de la industria, para obtener mejor competitividad y mayores resultados en los diferentes mercados. ")


}
