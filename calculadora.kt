//Projeto escrito no VS Code
 
fun main(args: Array<String>) {
    while (true) {
        try {
            println("Please enter an equation, for example: 3 + 4, separated by spaces")
            // Read from the command line, if you read the null, directly break
            val input = readLine() ?: break
            //The read result may be empty. So make a non-empty check
            // Cut with a space, trim remove the blank of the first string
            val splits = input.trim().split(" ")
            if (splits.size < 3){
                throw IllegalArgumentException("The number of parameters is incorrect")
            }
            // The first parameter
            val arg1 = splits[0].toDouble()
            //The second parameter
            val op = splits[1]
            //The third parameter
            val arg2 = splits[2].toDouble()
 
            // Print the results
            println("$arg1 $op $arg2 = ${Operator(op).apply(arg1, arg2)}")
        }catch (e: NumberFormatException){
            println("Please enter in the normal format")
        }catch (e: IllegalArgumentException){
            println("Are you sure your input is separated by spaces?")
        }catch (e: Exception){
            println("Hello, the program encountered an unknown error, the error message is ${e.printStackTrace()}")
        }
        println("Come again? [Y]")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            break
        }
    }
    // After the user quits, need to thank the user for their use
    println("Thank you for using Kumamoto's calculator")
}
/**Define a class*/
class Operator(op: String){
    // Define an opFun, use a lambda expression
    val opFun:(left: Double,right: Double) -> Double
 
    init {
        opFun = when(op){
            "+" -> {l,r -> l + r}
            "-" -> {l,r -> l - r}
            "*" -> {l,r -> l * r}
            "/" -> {l,r -> l / r}
            "%" -> {l,r -> l % r}
            else ->{
                throw UnsupportedOperationException(op)
            }
        }
    }
    // Define a method
    fun apply(left: Double, right: Double): Double{
        return opFun(left,right)
    }
}