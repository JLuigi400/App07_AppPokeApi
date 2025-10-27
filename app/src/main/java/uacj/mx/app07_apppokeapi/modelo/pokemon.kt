package uacj.mx.app07_apppokeapi.modelo

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
    val stats: StatBase,
    val type: List<Types>,
    val species: Species,
)