//Código feito no VS Code

//var = váriavel de valor mutavel, CamelCase
//val = constante, ou váriavel de atribuíção única, CamelCase
//constval = Definido durante a compilação, SNAKE_CASE, é um valor de consulta

//Exemplos:

//Inferencia do valor, vai presumir qualo tipo de váriavel
//var currentAge = 22

//Declaração explicita do tipo de váriavel com possibilidade de ser nula (?)
//var currentAge: Int?
//currentAge = null ou 22

//Inferencia do valor, vai presumir qualo tipo de váriavel, ele não será alterado durante a execução do código
//val currentAge = 22

//Declaração explicita do tipo de váriavel com possibilidade de ser nula (?)
//val currentAge: Int?
//currentAge = null ou 22


//Usado como valor fixo que pode ser consultado na execução, mas nunca alterado
//const val MIN_AGE = 16
//const val MAX_AGE = 68

//Exemplo

//função principal:
//Variavel global que será consultada - veja que está fora da função main
const val MAX_AGE = 68

fun main() {
    val currentAge: Int = 90
    println(currentAge > MAX_AGE)
}

//A execução deve retornar o booleano da verificação se a idade atual é maior que a da variavel global de idade máxima