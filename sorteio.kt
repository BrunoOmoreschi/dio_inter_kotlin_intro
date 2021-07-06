//Escrito no VS Code
// Exemplo de aplicação das funções In e random

// Função principal
fun main() {
    //lista dos números que eu tenho no bilhete
    val bingo = listOf(8,6,34,2,13)
    //Declara uma variavel de nome number no range de 1 a 34  e escolhe um valor aleatório e depois armazena na variavel
    var number = (1..34).random()

    //Coloca na tela qual o numero sorteado
    println("O numero sorteado foi "+ number)
    //Verifica se o numero sorteado está listado no seu bilhete e resulta num booleano
    println("Esta no seu bilhete? :" + (number in bingo))
}