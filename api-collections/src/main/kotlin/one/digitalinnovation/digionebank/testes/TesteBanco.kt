package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBanco = Banco(nome = "Digione", numero = 12)

    println(digiOneBanco.nome)
    println(digiOneBanco.numero)

    val banco2 = digiOneBanco.copy(nome = "banco2", numero = 22)

    println(banco2.info())
}

