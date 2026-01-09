fun main(){
    val nnumber = 5
    val result = when (nnumber){
        1 -> "One"
        2,3,4 -> "A few"
        in 5..0 -> "Many"
        else -> "Unknow"
    }
    println(result)
}