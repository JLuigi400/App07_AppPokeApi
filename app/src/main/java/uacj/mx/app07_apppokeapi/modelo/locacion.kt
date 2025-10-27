package uacj.mx.app07_apppokeapi.modelo

import uacj.mx.app07_apppokeapi.modelo.locacion.Region

data class Location(
    val id: Int,
    val name: String,

    val region: List<Region>,
)

/*
Areas y lugares.
{
  "id": 1,
  "name": "canalave-city",
  "region": {
    "name": "sinnoh",
    "url": "https://pokeapi.co/api/v2/region/4/"
  },
  "names": [
    {
      "name": "Canalave City",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "game_indices": [
    {
      "game_index": 7,
      "generation": {
        "name": "generation-iv",
        "url": "https://pokeapi.co/api/v2/generation/4/"
      }
    }
  ],
  "areas": [
    {
      "name": "canalave-city-area",
      "url": "https://pokeapi.co/api/v2/location-area/1/"
    }
  ]
}
*/
