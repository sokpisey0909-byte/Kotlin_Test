fun main(){
    val booleanArray = booleanArrayOf(true, false, true, false)
    //ACCESS and print elements
    println("First element: ${booleanArray[0]}") // output true
    booleanArray[0] = false
    println(booleanArray.joinToString()) // count true values
    println("Number of true values: ${booleeanArray.count { it }}")
}