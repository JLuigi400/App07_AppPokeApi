package uacj.mx.app07_apppokeapi.ui.pantallas

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uacj.mx.app07_apppokeapi.modelo.Location

@Composable
fun PantallaUbicacion(modificador: Modifier = Modifier, ubicacion: Location){
    Text("Ubicación: ${ubicacion.name}")
}