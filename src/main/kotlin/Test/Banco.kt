package Test

data class Banco(
    val Nome: String,
    val Numéro: Int
) {
    fun info() = "$Nome - $Numéro"
}
