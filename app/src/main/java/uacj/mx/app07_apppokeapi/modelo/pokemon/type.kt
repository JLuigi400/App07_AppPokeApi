package uacj.mx.app07_apppokeapi.modelo.pokemon

data class Type(
    val name : String,
    val url : String,
)

data class Types(
    val slot : Int,
    val types : Type,
)