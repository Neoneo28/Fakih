package Test

class Pessoa {
    var Nome: String = " Ali Fakih Junior"

    var CPF: String = " CPF: 345.765.567-67"
    private set

    inner class Endereço {
        var Rua: String = "Rua teste"
    }
}

fun main() {
    val Ali = Pessoa()

    println(Ali)
    println(Ali.Nome)
    println(Ali.CPF)

    println(Ali.Endereço().Rua)
}