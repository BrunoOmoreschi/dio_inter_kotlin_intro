//Escrito no VS CODE, mas nesse caso copiado da entrega de desafios da plataforma da DIO.
//Estou colocando aqui como referencia de codigos a serem estudados no futuro.

import java.util.Scanner;

fun main(args: Array<String>) {
  val leitor = Scanner(System.`in`);
  
  val H: Double = leitor.nextDouble();
  val P: Double = leitor.nextDouble();
  
    val media: Double = H / P;
    //Para mudar a precisão entregue pelo Double altere de "%.2f" para "%3.f"
    println(String.format("%.2f", media));
}

