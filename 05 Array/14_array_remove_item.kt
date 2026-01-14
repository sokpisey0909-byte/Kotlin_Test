fun main(){
    var myarray = arrayOf(1,2,3,4,5,6)
    myarray = removeElement(myarray,4)
    println("Elements in Array: ")
    for(element in myarray){
        println(element)
    }
}

fun removeElement(myarray: Array<Int>, element: Int): Array<Int>{
    val mutableArray = myarray.toMutableList()
    mutableArray.remove(element)
    return mutableArray.toTypedArray()
}