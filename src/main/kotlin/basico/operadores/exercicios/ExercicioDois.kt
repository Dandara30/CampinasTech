package basico.operadores.exercicios


// Fazer um booleano resultado true usando xor
fun main() {
    val ex1 : Boolean = true
    val ex2 : Boolean = true

    val ex3 : Boolean = (ex1  xor ex2) xor ex2
    println(ex3)
}