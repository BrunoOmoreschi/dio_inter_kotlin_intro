//When equivale ao elif do python em resultado mas tem uma estrutura diferente
//Exemplo::
//Função principal:
fun main() {
    val grade = (0..10).random()
    println(grade.getStudentStatus())
}

fun Int.getStudentStatus():String{
    println("A nota do aluno = $this")

    return when (this){
        in 0..4 -> "Ainda não aprovado"
        in 5..7 -> "Pode melhorar"
        in 8..9 -> "Bom"
        10 -> "Excelente"
        else -> "Indefinido"
    }
}