fun main(){
    val colors = arrayOf("Red", "Green", "Blue", "Yellow")
    colors[0] = "Purple"
    colors[1] = "Orange"
    colors[2] = "Pink"
    println(colors.joinToString())
}