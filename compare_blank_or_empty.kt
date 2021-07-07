//Cod. escrito no VS Code
//mostrando a diferença dos metodos de comparação .isEmpty e .isBlank

fun main() {
    val a = ""
    val b = "   "

    println("Sobre a val A = '' podemos dizer:")
    if (a.length == 0){
        println("Comprimento da string a = 0,")
    }
    else{
        println("Comprimento da string a = ${a.length}")
    }
    println("Portanto, isBlank vai retornar: ${a.isBlank()}")
    println("E também, portanto, isEmpty vai retornar: ${a.isEmpty()}, lembrando que espaços também são contados aqui")

    println("Sobre a val B = '   ' podemos dizer:")
    if (b.length == 0){
        println("Comprimento da string a = 0,")
    }
    else{
        println("Comprimento da string a = ${b.length}")
    }
    println("Portanto, isBlank vai retornar: ${b.isBlank()}")
    println("E também, portanto, isEmpty vai retornar: ${b.isEmpty()}, lembrando que espaços também são contados aqui")

    
}