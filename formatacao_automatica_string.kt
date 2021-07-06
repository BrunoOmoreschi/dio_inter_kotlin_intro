//Código feito no VS Code

//Para concatenar strings com espaços altomaticos deve-se usar "S{x}" - x é a váriavel ou string chamada
// Exemplo:
//fun main() {
//    val name = "Aline"
//  val adjetivo = "linda"
//
//  println ("${name} ${adjetivo}!")    
//}

//Função com exemplo do captalize: Retorna a primeira letra do nome com ctz maiúscula
fun main(){
    val welcome = "Bem vindo(a)"
    var name: String = "bruno"

    println("${welcome} ${name.capitalize()}")
}

//Outros métodos de formatação:
//toUpperCase() / toLowerCase() / decaptalize()
//Remoção de espaços nas extremidades:: trimEnd() / trimStart() / trim()
//Troca de caracteres:: replace(x,y) x o que estou tirando, y o que estou colocando no lugar