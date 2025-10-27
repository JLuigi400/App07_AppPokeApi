package uacj.mx.app07_apppokeapi.modelo

data class MT(
    val id: Int,
    val name: String,
    val accuracy: Int,
    val effect_chance: Int,
    val pp: Int,
    val priority: Int,
    val power: Int,

    val contest_type: List<ContestType>,
    val damage_class: List<DamageClass>,

)

data class ContestType(
    val name: String,
    val url: String,
)

data class DamageClass(
    val name: String,
    val url: String,
)

/*
Maquinas Movimiento
{
  "id": 1,
  "name": "pound",
  "accuracy": 100,
  "effect_chance": null,
  "pp": 35,
  "priority": 0,
  "power": 40,
  "contest_type": {
    "name": "tough",
    "url": "https://pokeapi.co/api/v2/contest-type/5/"
  },
  "contest_effect": {
    "url": "https://pokeapi.co/api/v2/contest-effect/1/"
  },
  "damage_class": {
    "name": "physical",
    "url": "https://pokeapi.co/api/v2/move-damage-class/2/"
  },
  "effect_entries": [
    {
      "effect": "Inflicts [regular damage]{mechanic:regular-damage}.",
      "short_effect": "Inflicts regular damage with no additional effect.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "effect_changes": [],
  "generation": {
    "name": "generation-i",
    "url": "https://pokeapi.co/api/v2/generation/1/"
  },
  "meta": {
    "ailment": {
      "name": "none",
      "url": "https://pokeapi.co/api/v2/move-ailment/0/"
    },
    "category": {
      "name": "damage",
      "url": "https://pokeapi.co/api/v2/move-category/0/"
    },
    "min_hits": null,
    "max_hits": null,
    "min_turns": null,
    "max_turns": null,
    "drain": 0,
    "healing": 0,
    "crit_rate": 0,
    "ailment_chance": 0,
    "flinch_chance": 0,
    "stat_chance": 0
  },
  "names": [
    {
      "name": "Pound",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "past_values": [],
  "stat_changes": [],
  "super_contest_effect": {
    "url": "https://pokeapi.co/api/v2/super-contest-effect/5/"
  },
  "target": {
    "name": "selected-pokemon",
    "url": "https://pokeapi.co/api/v2/move-target/10/"
  },
  "type": {
    "name": "normal",
    "url": "https://pokeapi.co/api/v2/type/1/"
  },
  "learned_by_pokemon": [
    {
      "name": "clefairy",
      "url": "https://pokeapi.co/api/v2/pokemon/35/"
    }
  ],
  "flavor_text_entries": [
    {
      "flavor_text": "Pounds with fore­\nlegs or tail.",
      "language": {
        "url": "https://pokeapi.co/api/v2/language/9/",
        "name": "en"
      },
      "version_group": {
        "url": "https://pokeapi.co/api/v2/version-group/3/",
        "name": "gold-silver"
      }
    }
  ]
}
*/