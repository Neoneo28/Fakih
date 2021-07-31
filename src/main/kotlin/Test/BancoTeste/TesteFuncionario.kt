package Test.BancoTeste

import Test.Funcionario
import Test.Pessoa
import java.math.BigDecimal

fun main() {
    val Ali = Pessoa(Nome = "Fakih Junior", CPF = " CPF: 541.541.125-45")


    println(Ali.Nome)
    println(Ali.CPF)

    val Joao = Funcionario("Fakih Junior", "CPF: - 541.541.125-45", BigDecimal.valueOf(2000.0))

    println(Joao.Nome)
    println(Joao.CPF)
    println(Joao.Salario)
}