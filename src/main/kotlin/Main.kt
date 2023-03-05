fun main(){
    val harvey = Human("Gisey",22,10)
    println(harvey.weight)
    harvey.eat(20)
    harvey.weight
    println(harvey.weight)
    harvey.speak("We love working in teams")
    harvey.birthday()
    println(harvey.age)

    val myUser = User("Gisemba","Faith","faithmgisemba@gmail.com",6785,7896)
    println(myUser.firstName)
    println(myUser.email)
    println(myUser.lastName)
    println(myUser.phoneNumber)

}
//Create a class called Human with these attributes: name, age, weight. It has the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
// and increments the human’s weight by the weight of the food eaten (3
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food.")
        weight += foodWeight
    }
//    speak(speech: String) :Prints the string passed to it
    fun speak(speech: String){
        println(speech)
    }
//    - birthday( ) :Increments the human’s age by 1
    fun birthday(){
        age++
    }
// Create a data class User with these fields: firstName, lastName, email, phoneNumber, password.
// Create an instance of User and print out any 2 attr
}
data class User(var firstName: String,var lastName:String,var email:String,var phoneNumber: Int,var password: Int)