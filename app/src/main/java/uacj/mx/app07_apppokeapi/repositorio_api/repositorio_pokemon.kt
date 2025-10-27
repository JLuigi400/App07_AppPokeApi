package uacj.mx.app07_apppokeapi.repositorio_api

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import uacj.mx.app07_apppokeapi.modelo.Pokemon
import java.util.Collections.emptyList

class AlmacenDatosPokemon(
    override val pokemon: MutableState<List<Pokemon>> = mutableStateOf(emptyList<Pokemon>())
): RepositorioPokemon{

}

interface RepositorioPokemon{
    val pokemon: MutableState<List<Pokemon>>
}