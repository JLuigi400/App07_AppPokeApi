package uacj.mx.app07_apppokeapi.ui.pantallas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import uacj.mx.app07_apppokeapi.modelo.Pokemon

@Composable
fun PantallaPokemon(modificador: Modifier = Modifier, pokemon: Pokemon){
    Text("Nombre: ${pokemon.name}")
    for (tipos in pokemon.types){
        Text("Tipo: ${tipos.types.name}")
    }
    Row {
        for(estadistica in pokemon.stats) {
            Column {
                Text("${estadistica.stat.name}")
                Text("${estadistica.base_stat}")
                Text("${estadistica.effort}")
            }
        }
    }
}

@Preview
@Composable
fun previsualizacion_PantallaPokemon(){
    // PantallaPokemon()
}