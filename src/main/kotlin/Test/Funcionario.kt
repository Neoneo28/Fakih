package Test

abstract class Funcionario(
    Nome: String,
    CPF: String,
    val Salario: Double,
) : Pessoa(Nome, CPF) {
    protected abstract fun calculoAuxilio() : Double

    override fun toString(): String = """
        Nome: $Nome 
        CPF: $CPF 
        Salario: $Salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()

}