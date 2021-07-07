//Escrito no VS Code

//Elvis operator é um sistema de atribuição condicional que elimina as variaveis nulas por dar opções a elas
//Exemplo:


//Função Principal
fun main() {
    var t:Int
    var x:Int? = null
    var w:Int? = 40
    t = x ?: w ?: -1

    println(t)
}

//A função vai atribuir o tipo Int para t, depois x pode ser Int ou null e w pode ser Int ou null mas tá valendo 40
//Aí t será seu próprio valor se for nulo ou não atribuido, ou será = w
//Se w for não nulo ela assume esse valo, se for nulo ela passará ao valor de -1
//Como w = 40, não nulo, t assumirá esse valor e será impresso na linha 14