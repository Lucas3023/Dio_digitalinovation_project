package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "123.123.123-12"

    private set
}

fun main(){
    val lucas = Pessoa()

    println(lucas)
    println(lucas.nome)
    println(lucas.cpf)

}