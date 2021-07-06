//Escrito no VS Code

//A operação compareTo vai comparar 2 valores e retornar 0, 1 ou -1 para quando eles são iguais, o primeiro maior que o segundo ou o primeiro menor que o segundo, respectivamente
//Exemplo
//Função principal
fun main() {
    val d = 220
    val t = 90
    val x = 90

    println (d.compareTo(t))
    println ("D= 220 > que T=90")
    println(t.compareTo(d))
    println("T=90 < que D=220")
    println(t.compareTo(x))
    println("T=90 == x=90")
}