//Escrito no VS Code

//Declaração simples de função:
//fun nomeDaFuncao("requerimentos":Tipo):TipoRetorno{}
//Podem ser: anônimas, single-line, inline, extensões, lambda, ordem superior

//Exemplos:
//Função de nome "getFullName", que requer um argumento para "name" esperado string e tb um argumento para lastName tb esperado string; Essa fun irá devolver uma string
private fun getFullName (name:String, lastName:String) : String {
    //Junta as strings mantendo um espaço no meio
    val fullname = "$name $lastName"
    //Devolve após fazer a união, que é o objetivo dessa fun
    return fullname
}

fun main() {
    println(getFullName("Bruno", "Moreschi"))
}


//Essa fun acima pode ser simplificada:
/*private fun getFullName (name:String, lastName:String) : String {
    return "$name $lastName"
}*/

//E tb pode ser feita como single line:
/*private fun getFullName (name:String, lastName:String) = "$name $lastName"
 */