fun main(){
    val fruits = mutableListOf("Apple", "Banana", "Orange")
    fruits.add("Grapes")
    prinntln(fruits.joinToString())
    for(fruit in fruits){
        println(fruit)
    }
}