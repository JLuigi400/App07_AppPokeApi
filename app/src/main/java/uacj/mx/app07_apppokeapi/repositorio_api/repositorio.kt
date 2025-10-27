package uacj.mx.app07_apppokeapi.repositorio_api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uacj.mx.app07_apppokeapi.repositorio_api.api_conexion.InterfazPokemonAPI
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositorioOficial{
    @Provides
    @Singleton
    fun crea_repositorio_guardar_pokemon(): RepositorioPokemon{
        return AlmacenDatosPokemon()
    }
}