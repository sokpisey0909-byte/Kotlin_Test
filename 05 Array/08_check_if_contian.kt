fun main(){
    val fruits = arrayOf("Apple", "Banana", "Orange", "Grapes")
    //check if "Banana" exists in the array

    if (fruits.contains("Banana")){
        println("Banana exists in fruits")
    } else {
        println("Banana not exist in fruits")
    }
    val numbers = arrayOf(1,2,3,4,5)

    if (numbers.contains(3)){
        println("3 exists in numbers")
    } else {
        println("3 not exist in numbers")
    }

}