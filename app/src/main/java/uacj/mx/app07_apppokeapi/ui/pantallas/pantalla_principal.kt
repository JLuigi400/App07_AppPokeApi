package uacj.mx.app07_apppokeapi.ui.pantallas

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import uacj.mx.app07_apppokeapi.viewmodels.PokemonViewModel

@Composable
fun PantallaPrincipal(modificador: Modifier = Modifier,
                      controlador_pokemon: PokemonViewModel = hiltViewModel()){
    Text("Hola Mundo")
}

@Composable
@Preview(showBackground = true)
fun PreviewPantallaPrincipal(){
    PantallaPrincipal()
}