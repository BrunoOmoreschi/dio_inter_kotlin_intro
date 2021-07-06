//Escrito no VS Code
// Outro exemplo de uso de condicionais variaveis e  .random más agora mostrando 2 formas de fazer condicionais

//Declarando as idades para poder andar no brinquedo
const val MIN_AGE = 4
const val MAX_AGE = 12

//Função principal
fun main() {
    //Gerar uma criança aleatória
    var age = (1..100).random()
    //exibe a idade sorteada
    println(age)

    //Comparar por range:
    println(age in  MIN_AGE.. MAX_AGE)
    
    //Comparar usando operador lógico && (e) - lembrando que existe o ou que é (|| - pipes)
    println (age >= MIN_AGE && age <=MAX_AGE)
}

//Tb é legal lembrar que qualquer desses operadores podem ser invertidos quando se add ! antes por ex: == é igualdade, mas != é diferença