fun main(){
    val value: Any =6
    when (value){
        is Int -> println("It an integer")
        is String -> println("it a string")
        in 1..50 -> println("it within range 1-50.")
        else -> println("Unknow type.")
        
    }
}