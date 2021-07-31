package Test.BancoTeste

import Test.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elementos ->
        println("${elementos.name} - ${elementos.Descricao}")
    }
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.Descricao}")
    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.Descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.Descricao}")
}