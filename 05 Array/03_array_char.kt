fun main(){
    val charArray = charArrayOf('A', 'B', 'C', 'D', 'E')
    println(charArray[1]) // output B

    charArray[0] = 'z'
    println(charArray.joinToString()) // output z, B, C, D, E

    for (char in charArray){
        println("$char")
    }
}