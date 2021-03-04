package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.123-12",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)

}