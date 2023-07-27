package com.example.dashboard.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState


import com.example.dashboard.pages.Page_Principal

import com.example.tienda_sena.pages.Page_Contenidos
import com.example.tienda_sena.pages.Page_Flores
import com.example.tienda_sena.pages.Page_Frutas_Verduras
import com.example.tienda_sena.pages.Page_Huevos
import com.example.tienda_sena.pages.Page_Inicio

import com.example.tienda_sena.pages.Page_Lacteos

import com.example.tienda_sena.pages.Page_informacion

// Menú del Drawer
@Composable
fun Navigation_Host(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = MenuItem.Page01.ruta
    ){
        composable(MenuItem.Page01.ruta) {
            Page_Principal()
        }
        composable(MenuItem.Page02.ruta) {
            Page_Flores()
        }
        composable(MenuItem.Page03.ruta) {
            Page_Frutas_Verduras()
        }
        composable(MenuItem.Page04.ruta) {
            Page_Huevos()
        }
        composable(MenuItem.Page05.ruta) {
            Page_Lacteos()
        }
        composable(MenuItem.Page06.ruta) {
            Page_informacion()
        }
        composable(Items_Bar.Boton1.ruta) {
            Page_Inicio()
        }
        composable(Items_Bar.Boton2.ruta) {
            Page_Contenidos()
        }
        composable(Items_Bar.Boton3.ruta) {
            Page_informacion()
        }
    }
}

@Composable
fun Current_Route(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}
