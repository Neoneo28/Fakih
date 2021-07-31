package Test.BancoTeste

import Test.Banco

fun main() {
    val SantanderBank = Banco(Nome = "Santander", Numéro = 12 )

    println(SantanderBank.Nome)
    println(SantanderBank.Numéro)

    val Banco2 = SantanderBank.copy(Nome = "Banco2")

    println(Banco2.info())
}