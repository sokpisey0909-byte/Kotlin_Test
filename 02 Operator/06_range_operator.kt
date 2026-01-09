fun main(args: Array<String>) {
    var range1 = 1..5
    println("Range 1..5: $range1")
    for (i in range1){
        print("$i")

    }
    println()
    val range2 = 1 until 5
    println("Range 1 until 5: $range2")
    for(i in range2){
        print("$i")
    }
    println()
    val range3 = 5 downTo 1
    println("Range 5 downTo 1:  $range3")
    for (i in range3)
    print("$i")

}