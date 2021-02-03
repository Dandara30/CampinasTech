package basico.operadores.exercicios


// Fazer um listOf com 3 expressões aritméticas diferentes
fun main() {

  val (v1,v2,v3,v4) = listOf(2, 3, 5, 8)
  val (v5,v6,v7,v8,v9) = listOf(10, 20, 25, 30, 50)

 val r1 = (v1 * v4 +v6 - v1) - ((v8 - v7) + v6)
 val r2 = (v2 * (v2 * v2 * v2)) / (v9 -(v5/ v1 * v4))
 val r3 = (((v1 * v4) / 2) + (v2 * v4) / (v3 % v2))

 println("Resultado Um " +r1)
 println("Resultado Dois " +r2)
 println("Resultado Tres " +r3)





}