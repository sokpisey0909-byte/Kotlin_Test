fun  main() {
    val obj: Any = "kotlin"
    if(obj is String){
        println(obj.length) //smart casting

    }
    val number: Any = 123
    val castedNumber = number as Int  // Explicit casting
    println(castedNumber)
    
}