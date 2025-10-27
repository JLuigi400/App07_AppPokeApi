package uacj.mx.app07_apppokeapi.modelo

import uacj.mx.app07_apppokeapi.modelo.pokemon.Aullido
import uacj.mx.app07_apppokeapi.modelo.pokemon.Habilidad
import uacj.mx.app07_apppokeapi.modelo.pokemon.LocationArea
import uacj.mx.app07_apppokeapi.modelo.pokemon.Species
import uacj.mx.app07_apppokeapi.modelo.pokemon.Sprite
import uacj.mx.app07_apppokeapi.modelo.pokemon.StatBase
import uacj.mx.app07_apppokeapi.modelo.pokemon.Types

data class Pokemon(
    val id: Int,
    val name: String,
    val base_experience: Int,
    val height: Int,
    val is_default: Boolean,
    val order: Int,
    val weight: Int,
    val abilities: List<Habilidad>,

    val sprites: Sprite,
    val cries: Aullido,
    val stats: List<StatBase>,
    val types: List<Types>,
    val species: Species,

    val location_area: List<LocationArea>,
)

/*
Locaciones de Spawneo Pokemon
[
  {
    "location_area": {
      "name": "kanto-route-2-south-towards-viridian-city",
      "url": "https://pokeapi.co/api/v2/location-area/296/"
    },
    "version_details": [
      {
        "max_chance": 10,
        "encounter_details": [
          {
            "min_level": 7,
            "max_level": 7,
            "condition_values": [
              {
                "name": "time-morning",
                "url": "https://pokeapi.co/api/v2/encounter-condition-value/3/"
              }
            ],
            "chance": 5,
            "method": {
              "name": "walk",
              "url": "https://pokeapi.co/api/v2/encounter-method/1/"
            }
          }
        ],
        "version": {
          "name": "heartgold",
          "url": "https://pokeapi.co/api/v2/version/15/"
        }
      }
    ]
  }
]
*/