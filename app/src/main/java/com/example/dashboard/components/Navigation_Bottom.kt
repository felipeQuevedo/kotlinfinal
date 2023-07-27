package com.example.dashboard.components
import com.example.dashboard.components.notificacionProgramada
import android.content.Context
import android.graphics.BitmapFactory
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.material.SnackbarDuration
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.dashboard.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch






@Composable
fun BottomMenu(
    navController: NavHostController,
    menu_items_bar: List<Items_Bar>
){
    BottomAppBar(
        cutoutShape = MaterialTheme.shapes.small.copy(CornerSize(percent = 50))
    ) {
        BottomNavigation(
            modifier = Modifier.padding(
                0.dp,
                0.dp,
                60.dp,
                0.dp
            )
        ) {
            val idNotification = 0
            val context: Context = LocalContext.current
            val idChannel: String = stringResource(R.string.CanalTienda)
            val name: String = stringResource(R.string.CanalTienda)
            val descripcionTExt: String = stringResource(R.string.CanalTienda)

            val textShort = "ejemplo de notificacion sencilla con prioridad con omision (default) "
            val textLong: String =
                "Saludos, esta es un aprueba de notificacion. Debe Aparecer " + "un icono a la derecha y el texto puede tener un alongitud de 200 caracteres " + "el tamano de la notificacion puede colapsar y/o expandirse " + "Gracias y hasta pronto "
            val iconBig = BitmapFactory.decodeResource(
                context.resources, R.drawable.senita
            )
            var showDialog by remember { mutableStateOf(false) }
            val currentRouteBar = Current_Route(navController = navController)
            menu_items_bar.forEach{item ->
                BottomNavigationItem(
                    selected = currentRouteBar == item.ruta,
                    onClick = {navController.navigate(item.ruta)},
                    icon = {
                        Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title
                        )
                    },
                    label = {Text(item.title)}
                )
            }
        }
    }
}

@Composable
fun Fab(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState
){
    FloatingActionButton(

        onClick = {

            scope.launch { scaffoldState.snackbarHostState
                .showSnackbar(
                    "Proximamanete disponible",
                    actionLabel = "Aceptar,",
                    duration = SnackbarDuration.Indefinite
                )
            }
        },
        backgroundColor = Color.Green
    ) {
        Icon(
            imageVector = Icons.Filled.List,
            contentDescription = "Recompensas")
    }
}


