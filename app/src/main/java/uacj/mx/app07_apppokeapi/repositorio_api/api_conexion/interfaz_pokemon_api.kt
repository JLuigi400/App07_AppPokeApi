package uacj.mx.app07_apppokeapi.repositorio_api.api_conexion

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import uacj.mx.app07_apppokeapi.modelo.Pokemon

interface InterfazPokemonAPI{
    //@POST("/pokemon")

    @GET("pokemon/{id}")
    suspend fun descargar_pokemon(@Path("id") id:Int): Pokemon
}