fun main(){
    val doubleArray = doubleArrayOf(1.5, 2.5, 3.5, 4.5)
    println("First element: ${doubleArray[0]}") // out put 1.5
    doubleArray[0] = 5.5
    println(doubleArray.joinToString())
    println("Sum: ${doubleArray.sum()}")

}