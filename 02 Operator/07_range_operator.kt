fun main(args: Array<String>) {
   
    println()
    val range1 = 1..10 step2
    println("Range 1..10 step 2: $range1")
    for (i in range1){
        print("$i ")
    }
    println()
    val charRange = 'a'..'e'
    println("Char range a..e: $charRange")
    for (c in charRange) {
        print("$c ")
    }
}