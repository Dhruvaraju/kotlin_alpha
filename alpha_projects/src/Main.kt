public enum class games{
    Cricket, volleyball, carrom, chess
}

fun main(){
    //println("Hello World");
    //numberExample() //for calling numbers
    //charExample() //for character examples
    //stringOperations() //for string operations

    //conditionalOpsIf() //for checking if statements
    //conditionalOpsWhen() //for checking when
    //loopsEg() //for testing loops
    nullableAndCasting() //for checking null instances and casting them
}
 data class Person(var firstName: String, var lastName: String){

 }
    private fun nullableAndCasting(){
        //the class person cannot be declared as null like var person: Person = null
        //This can be done only by mentioning question mark at the end
        var person : Person? = null //the '?' at the end allows person to be null
        val greeting:String? = "Hi"
        if (greeting != null){ // If '?' is not used null check will not be allowed
            println("User says $greeting")
        }else {
            println("Greeting is null")
        }
        //for all subsequent operations we need to use the '?'
        println("Length of greeting is ${greeting?.length}")// This will print null if greeting is null without crashing the code
        var testString : String? = "NewText"
        val len = testString?.length ?: null
        println("Lenght of test String is $len")
        //exception throwing while a value is null
        println(testString!!.length) //if teststring has value this will work

        //type casting example
        val castingExample: String? = greeting as? String
        println("Typecasting example value is $castingExample")
    }

    private  fun loopsEg(){
        //C styles loops are not present in Kotlin for (i =0 ; i<10 ; i++) will not work
        //basic for loop syntax
        println("This loop will print 1 to 10 numbers")
        for (i in 1..10){
            print("$i \t")
        }
        // for mainly used for iteration of collections and array
        val names = listOf("dex","clarke","barry","bruce")
        println("Names will be print below")
        for (name in names){
            println(name)
        }
        //same names list will be printed with index
        println("Names list with index")
        for ((index,name) in names.withIndex()){
            println("$index is $name")
        }
        //While loop
        var count: Int = 5
        while (count > 0){
            println("Value of Count is $count")
            count--
        }
        //Do while
        var stat: Int = 5
        do {
           println("Value of stat is $stat")
            stat--
            if(stat == 2 ) break
        }while (stat > 0)
    }

    private fun conditionalOpsWhen(){
        //basic syntax of when
        val x = 1
        when(x){
            1 ->  println("Value of x is 1")
            2 -> println("Value of x is 2")
            3,4 -> println("Value of x is 3 or 4")
            else -> println("value of x is unknown")
        }
        //when can be used with strings also
        val test = games.Cricket
        val result = when(test){
            games.Cricket, games.volleyball -> "Outdoor Games"
            games.carrom, games.chess -> "Indoor Games"
        }
        println("Result of games is $result")
        //When can be used for range also
        val myAge = 30
        val currentPhase = when(myAge){
            in 0..1 -> "baby"
            in 2..5 -> "toddler"
            in 6..12 -> "kid"
            in 13..19 -> "teenager"
            in 20..64 -> "adult"
            else -> "senior"
        }
        println("Your current phase is $currentPhase")

    }

    private fun conditionalOpsIf(){
        //In kotlin every statement is an expression
        val largeNumber = 700
        val smallNumber = 25
        val comparisionResult = if(largeNumber > smallNumber) true else false
        println(comparisionResult)
        //the same can be written below
        val result = largeNumber > smallNumber
        println("Normal comparision $result")
        //the normal way of writing if
        if(largeNumber > smallNumber){
            println("Large Number")
        }else{
            println("small Number")
        }
    }

private fun stringOperations(){
    //declaring a simple string
    val testString : String = "Hi this a simple string"
    val appendString = 50

    println("$testString , and appended string is  $appendString")
    //adding special characters - $ symbol is printed
    println("Cost of product is \$$appendString")
    //unicode symbols
    println("Unicode symbol infinity is added for this line \u221E")
    //length function is used to get length of a string
    println("The number of characters in testString val is ${testString.length} ")
    //Fetching character at specific index
    val extractedChar: Char = testString.get(3)
    println("Extracted Character is $extractedChar another way is ${testString[1]}")
    //string comparision using compareTo
    val string001 = "text"
    val string002 = "test"
    println("comparing both strings, comparision result is: ${string001.compareTo(string002)}")
    //fetching the substring by using sub sequence
    println("Fetching a substring from testString ${testString.subSequence(3,6)}")
    //printing each letter in a string
    for (letter in testString){
        print("$letter \t")
    }
    //string with exact indentation
    val strictString: String = """Hi
        All the spacing
        secondary lines will be
        printed as they are.
    """
    println(strictString)
}
private fun charExample(){
    //Kotlin supports unicode, character and tab manymore
    val charEg : Char = 'A'
    var tabEg = '\t'
    var unicodeExample = '\u221E'
    println("This is a character $charEg and now a tab will appear $tabEg , now a infinity symbol $unicodeExample")
}

private fun numberExample(){
    //Basic numeric declaration
    val longAttribute: Long = 234567L
    val intAttribute: Int = 49
    val byteAttribute: Byte = 124
    val shortAttribute: Short = 32567
    val doubleAttribute: Double = 17.63
    val floatAttribute: Float = 17.567F

    //Basic numeric conversions
    val convertedInt : Int = doubleAttribute.toInt()
    val convertedFloat: Float = longAttribute.toFloat()
    val maxInt = 23_546_456788

    //logging details:
    println("Converted Int: "+convertedInt+" Converted Float:"+convertedFloat+" Maximum Integer: "+maxInt)
}