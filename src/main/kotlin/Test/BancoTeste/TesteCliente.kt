package Test.BancoTeste

import Test.Cliente
import Test.ClienteTipo

fun main() {
    val jose = Cliente(
        Nome = "José da Silva" ,
        CPF = "125.548.457-68",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().antentica(jose)
}