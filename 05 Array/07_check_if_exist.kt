fun main(){
    val fruits = arrayOf<string>("Apple", "Banana", "Orange", "Grapes")
    if("mango" in fruits){
        println("Mango exists in fruits")
    } else {
        println("Mango not exist in fruits")
    }
    val numbers = arrayOf(1,2,3,4,5)
    if(10 in numbers){
        println("10 exists in numbers")
    } else {
        println("10 not exist in numbers")
    }
}