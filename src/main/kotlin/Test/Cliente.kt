package Test

class Cliente(
    Nome: String,
    CPF: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(Nome, CPF), Logavel {
    override fun login(): Boolean ="123456" == senha

    override fun toString(): String = """
        Nome:     $Nome         
        CPF:      $CPF         
        Tipo:     ${clienteTipo.Descricao}  
   """.trimIndent()
}