fun main(){
    val numbers = arrayOf(1, 2, 3)
    // Add an items
    val newNumbers = numbers + 4
    println(numbers.joinToString())
    println(newNumbers.joinToString())
    val string = arrayOf("A", "B", "C")
    val newString = string + "D"   
    println(string.joinToString())
    println(newString.joinToString())
}