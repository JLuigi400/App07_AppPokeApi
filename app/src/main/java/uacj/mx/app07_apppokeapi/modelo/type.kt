package uacj.mx.app07_apppokeapi.modelo

data class Type(
    val name : String,
    val url : String,
)

data class Types(
    val slot : Int,
    val types : Type,
)