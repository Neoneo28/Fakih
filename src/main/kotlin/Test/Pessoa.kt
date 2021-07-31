package Test

class Pessoa {
    var Nome: String = "Ali Fakih Junior"

    var CPF: String = " CPF: 345.765.567-67"
    private set

    constructor()

    fun pessoaInfo() = "$Nome e $CPF"

    inner class Endereço {
        var Rua: String = "Rua Onze de Agosto"
    }
}

fun main() {
    val Ali = Pessoa()


    println(Ali.pessoaInfo())
    println(Ali.Endereço().Rua)
}