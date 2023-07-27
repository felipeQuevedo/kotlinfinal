package com.example.login_cba.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dashboard.R
import com.example.dashboard.components.MainPage
import com.example.dashboard.login.LoginScreen
import com.example.dashboard.ui.theme.green

enum class PageScreen(){
    Start,
    Dashboard
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun TiendaAppBar(
    canNavigationBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TiendaApp() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.background(color = Color.Green),
        topBar = {
            TiendaAppBar(
                canNavigationBack = false,
                navigateUp = { /*TODO*/ }
            )
        }
    ) { padding -> ScaffoldContent(
            padding = padding
        )
        NavHost(
            navController = navController,
            startDestination = PageScreen.Start.name
        ){
            composable(route = PageScreen.Start.name){
                LoginScreen(navController)
            }
            composable(route = PageScreen.Dashboard.name){
                MainPage()
            }

        }
    }
}

@Composable
fun ScaffoldContent(
    padding: PaddingValues,
) {
    Column(
        modifier = Modifier
            .padding
                (top = 16.dp,
                bottom = padding.calculateBottomPadding()
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
        }
    }
}
