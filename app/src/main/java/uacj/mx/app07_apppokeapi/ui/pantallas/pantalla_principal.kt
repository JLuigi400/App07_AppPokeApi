package uacj.mx.app07_apppokeapi.ui.pantallas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uacj.mx.app07_apppokeapi.modelo.Pokemon
import uacj.mx.app07_apppokeapi.ui.molecula.PokemonLista
import uacj.mx.app07_apppokeapi.viewmodels.PokemonViewModel

@Composable
fun PantallaPrincipal(modificador: Modifier = Modifier,
                      controlador_pokemon: PokemonViewModel = hiltViewModel()){
    val controlador_navegacion = rememberNavController()

    var pokemon_seleccionado by remember { mutableStateOf<Pokemon?>(null) }

    NavHost(navController = controlador_navegacion, startDestination = "lista_pokemon"){
        composable("lista_pokemon") {
            Column (modifier = modificador) {
                Column {
                    Text("Atrapa a los ${controlador_pokemon.pokemon.value.size} Pokémon")
                }

                Column (modifier = Modifier.verticalScroll(rememberScrollState())) {
                    for( pokemon in controlador_pokemon.pokemon.value){
                        PokemonLista(pokemon = pokemon, modificador = Modifier.clickable {
                            pokemon_seleccionado = pokemon
                            controlador_navegacion.navigate("Pantalla_pokemon")
                        })
                    }
                }
            }
        }

        composable("Pantalla_pokemon") {
            PantallaPokemon(modificador = modificador, pokemon = pokemon_seleccionado!!)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewPantallaPrincipal(){
    PantallaPrincipal()
}