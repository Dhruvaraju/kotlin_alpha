# kotlin_alpha
Learning log for kotlin

## Creating a new project
- In intellij create new project >> kotlin >> jvm/kotlin create
- goto src folder and create a kotlin file
- create the function as mentioned below, run the program
```kotlin
fun main(){
    println("Hello World");
}
```
## variables
- use var or val key word to create variables
- using var is mutable and val is immutable, as programmers preference is immutable prefer val
```
var count: int = 0
val counter: int = 0

val number = 42
```
### Numeric Data-types
#### Integers 
Type | Size | Example
---------- | -------------- | -----------------
Int | 32 bits | 1234
Long | 64 bits | 1234L
Byte | 8 bits | 127
Short | 16 bits | 32767
> We need to append L at the end of a long variable
#### Floating Type
Type | Size | Example
---------- | -------------- | -----------------
Double | 64 bits | 1234.56
Float | 32 bits | 1234.56F
> F should be appended at the end of float variable
#### Literals
Type | Size 
---------- | -------------- 
Hexadecimal | 0xFEDC
Binary | 0b10101 
Long | 123456L
> Hexadecimal values would with '0x', binary values should start with '0b'
- Kotlin supports numerics in many forms as mentioned above.
- It support type conversion in numerics
- large numbers can mentioned using '_'
```
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
```
> Immutable variables are used for legible, testable and thread-safe code

### Character
Type | Example
---------- | -----------------
Char | var letter = 'A'
ASCII | var tab = '\t'
Unicode | var infinity = '\u221E'
> a boolean will have a true or false value
> 'Or', 'and' operands work as usual like all other languages
```
private fun charExample(){
    //Kotlin supports unicode, character and tab manymore
    val charEg : Char = 'A'
    var tabEg = '\t'
    var unicodeExample = '\u221E'
    println("This is a character $charEg and now a tab will appear $tabEg , now a infinity symbol $unicodeExample")
}
```
### String 
- keyword is String, special character escape sequence is '\'
- Number of character in a string are fetched using length function
- character at an index can be fetched by using get function or []
- portion of string can be fetched by using subsequence function
- String comparison is done using compareTo method
- strict typing or retaining all the spaces types in a string is done by using  triple quotes **""""""**
```
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
    //string comparison using compareTo
    val string001 = "text"
    val string002 = "test"
    println("comparing both strings, comparison result is: ${string001.compareTo(string002)}")
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
```
## Conditional flows
### If
- 'if' is used for verifying an expression and executing an action on the result of the expression
- general syntax mentioned below:
```
private fun conditionalOpsIf(){
        //In kotlin every statement is an expression
        val largeNumber = 700
        val smallNumber = 25
        val comparisonResult = if(largeNumber > smallNumber) true else false
        println(comparisonResult)
        //the same can be written below
        val result = largeNumber > smallNumber
        println("Normal comparison $result")
        //the normal way of writing if
        if(largeNumber > smallNumber){
            println("Large Number")
        }else{
            println("small Number")
        }
    }
```
### when
- When keyword is used for multiple conditional checks
- It is compared to the switch case in other languages
- If we are using finite sets like enum then we do not have to write a default clause
- for all other thing we need to write default clause called as else
- While using a range we will make use of in key word
```
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
```