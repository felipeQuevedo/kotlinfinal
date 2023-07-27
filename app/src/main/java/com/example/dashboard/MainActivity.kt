package com.example.dashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.dashboard.ui.theme.DashboardTheme
import com.example.login_cba.components.TiendaApp


class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            DashboardTheme {
                TiendaApp()
            }
        }
    }
}