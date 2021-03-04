package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main (){

    val maria = Gerente( nome = "Maria da Luz", cpf = "12345", salario = 5000.0, senha = "senha123")

    imprimeRelatorioFuncionario.imprimi(maria)

    TesteAutenticacao().autentica(maria)

}