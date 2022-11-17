fun main() {
   val media = readLine()!!.toDouble();
   
   when {
       media < 5 -> println("REP");
       media >= 5 && media < 7 -> println("REC");
       media > 7 -> println("APR");
   }
} 
