//Class ddefinition
class Person(val name: String, var age: Int){
    // method inside the class
    fun greet(){
        println("Hello my name is $name and i am $age years old.")
    }

}
fun  main(){
    // Creating an object of the Person class
    val person = Person("Alice", 30)
    person.greet() // Calling the greet method
}