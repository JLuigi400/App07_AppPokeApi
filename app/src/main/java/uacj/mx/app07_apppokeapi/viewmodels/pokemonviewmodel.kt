package uacj.mx.app07_apppokeapi.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.launch
import uacj.mx.app07_apppokeapi.modelo.Pokemon
import uacj.mx.app07_apppokeapi.repositorio_api.RepositorioPokemon

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val repositorio: RepositorioPokemon
    private val conxeion_server: InterfazPokemonAPI
) : ViewModel() {
    private var estado = mutableStateOf("Cargando")

    private val pokemon: State<List<Pokemon>> = repositorio.pokemon

    init{
        for(indice_pokemon in 1..50){
            descargar_pokemon(indice_pokemon)
        }
    }

    fun descargar_pokemon(id: Int){
        var pokemon: Pokemon? = null

        viewModelScope.launch {
            pokemon = conxeion_server.descargar_pokemon(id)

            val lista = repositorio.pokemon.value.toMutableStateList()

            if(pokemon != null){
                lista.add(pokemon!!)
            }

            repositorio.pokemon.value = lista
        }
    }
}