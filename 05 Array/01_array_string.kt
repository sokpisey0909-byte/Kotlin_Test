fun main(){
    val fruits1 = arrayOf("Aapple", "Banana", "Grapes", "Orange")
    val fruits2 = arrayOf<string>("Apple","mango","Orange")
    println(fruits1[0])
    println(fruits2[0])

    val names = arrayOf("Alice","Bob","Charlie")
    for (name in names){
        println(name)
    }
    names[1] = "Boo"
    println("Modified array : ${names.joinToString()}")
}