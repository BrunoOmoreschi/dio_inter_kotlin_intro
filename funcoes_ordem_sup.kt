//Escrito no VS Code

fun main() {
    val x:Int
    x = calculate(12,13,::sum)
    println(x)
}

fun sum (a1:Int, a2:Int) = a1.plus(a2)


//Função calculate que será chamada em outras partes do codigo, recebe os inteiros n1 e n2
//Função operation é uma função lambda: ela recebe 2 parametros do tipo inteiro, que não interessa o nome e retorna um inteiro; se liga que o nome da operação é substituído pelo nome sum no chamado na linha 5
fun calculate (n1:Int, n2:Int, operation:(Int,Int)->Int):Int{
    val result = operation(n1,n2)
    return result
}