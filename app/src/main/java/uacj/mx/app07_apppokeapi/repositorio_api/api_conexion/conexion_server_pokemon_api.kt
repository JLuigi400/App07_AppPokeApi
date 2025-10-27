package uacj.mx.app07_apppokeapi.repositorio_api.api_conexion

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ConexionPokemonAPI{
    @Provides
    @Singleton
    fun conexion_server() : Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())

    }

    @Provides
    @Singleton
    fun enlace_servidor(server: Retrofit.Builder): InterfazPokemonAPI{
        return server
            .build()
            .create(InterfazPokemonAPI::class.java)

    }
}