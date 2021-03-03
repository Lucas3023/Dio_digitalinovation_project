package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main (){

    val joao = Analista( nome = "Joao", cpf = "12345", salario = 2000.0)

   imprimeRelatorioFuncionario.imprimi(joao)

}