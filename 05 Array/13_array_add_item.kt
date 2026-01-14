fun main(){
    var myarray = arrayOf(1,2,3,4,5,)
    myarray = addElement(myarray,6)
    println("Elements in Array: ")

    for(element in myarray){
        println($element)
    }
    println("")

}
fun addElement(myarray: Array<Int>, element: Int): Array<Int>{
    val multableArary = myarray.toMutableList()
    multableArary.add(element)
    return multableArary.toTypedArray()
    
}   