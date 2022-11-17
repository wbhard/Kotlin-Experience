fun main() {
   val media = readLine()!!.toDouble();
   
   when {
       media < 5 -> println("Reprovado");
       media >= 5 && media < 7 -> println("Recuperacao");
       media > 7 -> println("Aprovado");
   }
} 
