package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object{
        fun imprimi(funcionario: Funcionario){
           println(
               funcionario.toString()
           )
        }
    }
}