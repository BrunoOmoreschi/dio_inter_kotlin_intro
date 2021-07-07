//Escrito no VS Code

//Funções extensão são funções que só podem ser chamadas por variaveis de tipo definido
//Exemplo:

fun String.randomCaplizedletter() =   
this[(0..this.length-1).random()].toUpperCase()

fun main() {
    //Só por diversão essa é a maior palavra, atualmente, do idioma português:
    var x = "pneumoultramicroscopicossilicovulcanoconiótico"
    //Note que a função randomCaplizedletter foi chamada usando o tipo de variavel que ela aceita, no caso string, ponto o nome dela ()
    //Aqui só vai imprimir a letra que foi captalized
    println(x.randomCaplizedletter()) 
}