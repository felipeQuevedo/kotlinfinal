package com.example.dashboard.components

import com.example.dashboard.R

sealed class Contenido(
    val image: Int,
    val name: String,
    val descripcion: String,

) {
    object Contenido1 : Contenido(R.drawable.noticia1, "Fortaleciendo vínculos: el SENA consolida su presencia en el oriente caucano", "eron certificación del SENA\n" +
            "\n")
    object Contenido2 : Contenido(R.drawable.noticias2, "Con familias que inspiran, expertos en productividad rural y felicidad, se realizó el Encuentro Nacional ‘Cultivando la Economía Campesina’", "El evento contó con la participación de ‘Nubia e Hijos’, familia campesina que conquistó las redes sociales al visibilizar la cotidianidad del campo. Se realizaron tres conferencias y los asistentes recibieron certificación del SENA")
    object Contenido3 : Contenido(R.drawable.noticias3, "Descubre el fascinante mundo del modelado 3D y el arte del papercraft", "El primero ha revolucionado numerosos ámbitos creativos, desde la industria hasta el diseño, el arte, la medicina y la cultura en general. Gracias a la evolución tecnológica, ahora es posible plasmar distintas ideas en el mundo digital.")
    object Contenido4 : Contenido(R.drawable.noticias4, "OIT y SENA se unen para generar progreso en el Magdalena Medio", "Representantes de la organización se trasladaron hasta Barrancabermeja (Santander) para conocer los retos laborales que tienen los municipios con influencia petrolera.")
}
