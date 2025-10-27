package uacj.mx.app07_apppokeapi.modelo.pokemon

data class Habilidad(
    val is_hidden : Boolean,
    val slot : Int,
    val ability : HabilidadURL,
)