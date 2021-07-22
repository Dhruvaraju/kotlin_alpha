import java.util.*

class UserInteractions {
}

fun main(args: Array<String>){
    for (arg in args){
        println(arg)
    }
    readLineExample()
    scanner()
}

fun readLineExample(){
    println("Enter a some string: ")
    val valueOne = readLine() ?: ""
    println("Entered value is ${valueOne}")
}

fun scanner() {
    println()
    val scan = Scanner(System.`in`)
    print("Enter an integer number: ")
    val num1 = scan.nextInt()
    print("Enter an double number: ")
    val num2 = scan.nextDouble()

    println()
    println("First input number = $num1")
    println("Second input number = $num2")
}