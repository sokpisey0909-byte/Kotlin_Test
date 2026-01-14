fun main(){
    val fruits = mutableListOf("Apple", "Banana", "Orange")

    fruits.remove("Mango")
    println(fruits.joinToString())
    for(fruit in fruits){
        println(fruit)
    }

}