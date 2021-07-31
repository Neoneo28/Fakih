package Test

class Gerente(
    Nome: String,
    CPF: String,
    Salario: Double,
    val Senha: String
) : Funcionario (Nome = Nome, CPF = CPF, Salario = Salario), Logavel {
    override fun calculoAuxilio(): Double = Salario * 0.4

    override fun login(): Boolean = "Senha123" == Senha
}