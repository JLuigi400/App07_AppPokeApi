package uacj.mx.app07_apppokeapi.modelo

data class StatsURL(
    val name : String,
    val url : String,
)

data class Stat(
    val base_stat : Int,
    val effort : Int,
    val stat : List<StatsURL>
)

data class Aullido(
    val latest: String?,
    val legacy: String?,
)

data class Sprite(
    val back_default: String?,
    val back_female: String?,
    val back_shiny: String?,
    val back_shiny_female: String?,
    val front_default: String?,
    val front_female: String?,
    val front_shiny: String?,
    val front_shiny_female: String?,
)

data class HabilidadURL(
    val name : String,
    val url : String,
)

data class Habilidad(
    val is_hidden : Boolean,
    val slot : Int,
    val ability : HabilidadURL,
)

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
    val stats: Stat,
)

/*
{
   val id": 35,
   val name": "clefairy",
   val base_experience": 113,
   val height": 6,
   val is_default": true,
   val order": 56,
   val weight": 75,
   val abilities": [
    {
      }
    }
  ],
  "forms": [
    {
      "name": "clefairy",
      "url": "https://pokeapi.co/api/v2/pokemon-form/35/"
    }
  ],
  "game_indices": [
    {
      "game_index": 35,
      "version": {
        "name": "white-2",
        "url": "https://pokeapi.co/api/v2/version/22/"
      }
    }
  ],
  "held_items": [
    {
      "item": {
        "name": "moon-stone",
        "url": "https://pokeapi.co/api/v2/item/81/"
      },
      "version_details": [
        {
          "rarity": 5,
          "version": {
            "name": "ruby",
            "url": "https://pokeapi.co/api/v2/version/7/"
          }
        }
      ]
    }
  ],
  "location_area_encounters": "/api/v2/pokemon/35/encounters",
  "moves": [
    {
      "move": {
        "name": "pound",
        "url": "https://pokeapi.co/api/v2/move/1/"
      },
      "version_group_details": [
        {
          "level_learned_at": 1,
          "version_group": {
            "name": "red-blue",
            "url": "https://pokeapi.co/api/v2/version-group/1/"
          },
          "move_learn_method": {
            "name": "level-up",
            "url": "https://pokeapi.co/api/v2/move-learn-method/1/"
          },
          "order": 1
        }
      ]
    }
  ],
  "species": {
    "name": "clefairy",
    "url": "https://pokeapi.co/api/v2/pokemon-species/35/"
  },

  "cries": {
  },
  "stats": [
    {

    }
  ],
  "types": [
    {
      "slot": 1,
      "type": {
        "name": "fairy",
        "url": "https://pokeapi.co/api/v2/type/18/"
      }
    }
  ],
  "past_types": [
    {
      "generation": {
        "name": "generation-v",
        "url": "https://pokeapi.co/api/v2/generation/5/"
      },
      "types": [
        {
          "slot": 1,
          "type": {
            "name": "normal",
            "url": "https://pokeapi.co/api/v2/type/1/"
          }
        }
      ]
    }
  ],
  "past_abilities": [
    {
      "generation": {
        "name": "generation-iv",
        "url": "https://pokeapi.co/api/v2/generation/4/"
      },
      "abilities": [
        {
          "ability": null,
          "is_hidden": true,
          "slot": 3
        }
      ]
    }
  ]
}
*/