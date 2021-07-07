//Escrito no VS Code

//Aqui algumas iteraçãoes sobre o for e usos do downTo, until, step, letters :: Só diversão XP

//Função principal:
fun main() {
    println("Usando um 4 normal: ")
    direto()
    println("\nUsando o Down2 de 20 a 0: " )
    downto()
    println("\nUsando o Until, aqui ele não calcula o ultimo, o 20 pq é o fim do intervalo.")
    until()
    val num:Int = 2
    println("\nUsando o passo = ${num} com o step")
    step(num)
}

fun direto(){
    for (i in 0..20){
        print("$i ")
    }
}


fun downto(){
    for (i in 20 downTo 0){
        print("$i ")
    }
}

fun until (){
    for (i in 0 until 20){
        print("$i ")
    }
}

fun step (num:Int){
    for (i in 0..20 step num){
    print("$i ")
 } 
}