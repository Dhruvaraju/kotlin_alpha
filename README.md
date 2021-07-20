- [kotlin_alpha](#kotlin_alpha)
  - [Creating a new project](#creating-a-new-project)
  - [variables](#variables)
    - [Numeric Data-types](#numeric-data-types)
      - [Integers](#integers)
      - [Floating Type](#floating-type)
      - [Literals](#literals)
  - [instance check and class check](#instance-check-and-class-check)
    - [Character](#character)
    - [String](#string)
  - [Conditional flows](#conditional-flows)
    - [If](#if)
    - [when](#when)
    - [Loops](#loops)
    - [Nullable variables and type casting](#nullable-variables-and-type-casting)
  - [Array](#array)
  - [Collections](#collections)
    - [List](#list)
    - [Set](#set)
    - [Map](#map)
  - [Collection Operations](#collection-operations)
  - [Sequences](#sequences)
  - [Classes](#classes)
    - [Different ways of creating classes](#different-ways-of-creating-classes)
    - [Constructors and init](#constructors-and-init)

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

> Like java println is used to log details to console

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

| Type  | Size    | Example |
| ----- | ------- | ------- |
| Int   | 32 bits | 1234    |
| Long  | 64 bits | 1234L   |
| Byte  | 8 bits  | 127     |
| Short | 16 bits | 32767   |

> We need to append L at the end of a long variable

#### Floating Type

| Type   | Size    | Example  |
| ------ | ------- | -------- |
| Double | 64 bits | 1234.56  |
| Float  | 32 bits | 1234.56F |

> F should be appended at the end of float variable

#### Literals

| Type        | Size    |
| ----------- | ------- |
| Hexadecimal | 0xFEDC  |
| Binary      | 0b10101 |
| Long        | 123456L |

> Hexadecimal values would with '0x', binary values should start with '0b'

- Kotlin supports numerics in many forms as mentioned above.
- It support type conversion in numerics
- large numbers can mentioned using '\_'

```kotlin
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

## instance check and class check

- To check an instance of a variable to a particular type use the keyword 'is'

```
val aDoubleVar = 42.3
println("Is the variable a double object ${aDoubleVar is Double}")
```

### Character

| Type    | Example                 |
| ------- | ----------------------- |
| Char    | var letter = 'A'        |
| ASCII   | var tab = '\t'          |
| Unicode | var infinity = '\u221E' |

> a boolean will have a true or false value
> 'Or', 'and' operands work as usual like all other languages

```kotlin
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
- strict typing or retaining all the spaces types in a string is done by using triple quotes **""""""**

```kotlin
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

```kotlin
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

```kotlin
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

### Loops

- The c style for loop will not work in kotlin, for is mainly used for iterating through collections and range
- index of collections can be iterated without any additional code.
- while and do while will work like java, break keyword is used to exit from a loop when a certain condition is met.
- While dealing with a collection, having an index use withIndex() function

```kotlin
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
```

### Nullable variables and type casting

- A basic variable declaration will not allow it to be null in kotlin
- we need to use the '?' at end of declaration to make a variable nullable.
- '!!' is used to run the code as it is, it will cause any exception without the basic kotlin safeguards

```kotlin
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
        println("Length of test String is $len")
        //exception throwing while a value is null
        println(testString!!.length) //if test-string has value this will work

        //type casting example
        val castingExample: String? = greeting as? String
        println("Typecasting example value is $castingExample")
    }
```

## Array

- Used to store group of elements, elements can be grouped by using arrayOf function.
- Array can restrict type of data entered in it by using generic <T>
- primitive array types are available like intArray and others
- elements are fetched by index base, starting with 0.

```kotlin
private fun exploreArrays(){
        //Simple array declaration
        val testArray = arrayOf(1,2,3,"hi","any")
        println("Logging elements of array")
        for(element in testArray){
            println(element)
        }
        println("array information : ${testArray.indices}")
        //Assigning the value of an array
        testArray[0]="one"
        //Arrays with objects
        var details = arrayOf<Person>(Person("dexter","morgan"), Person("Clarke","Allen"))
        for (detail in details){
            println(detail)
        }
        println("size of details: ${details.size}")
        println("Indices of details: ${details.indices}")
        println("Last index of details: ${details.lastIndex}")
    }
```

## Collections

### List

- We have mutable lists and immutable list
- A simple list is created by using the keyword listof
- Mutable list can be created by using mutableListOf
- elements are accessed by index, we can use the [], or the get function
- List allow duplicate values

```kotlin
private fun exploreLists(){
        //Simple list declaration
        val list001 = listOf(1,2,3,4,5,6)
        println("First element in list is ${list001[0]}")
        println("Fetching elements using get function ${list001.get(3)}")

        //Creating a sublist from list001
        val sublist001 = list001.subList(1,4)
        println("Sublist is $sublist001")

        //Creating a mutable list
        val mutableListEg = mutableListOf(67,78,56,79)
        mutableListEg.add(97)
        println("List after update $mutableListEg")
        println("Size of mutable attribute ${mutableListEg.size}")
        mutableListEg.remove(78)
        mutableListEg.removeAt(0)
        println("Updated List $mutableListEg")
    }
```

### Set

- Similar to Lists have mutable set and immutable set.
- Sets does not allow duplicates
- Normal set preserves order of addition
- Two sets will be equal when they have the same elements in them even if order differs.
- Hash set does not preserve order of addition
- we can use `setOf()` or `mutableSetOf()` or `hashSetOf()` for creating sets on the go.
- Adding values to sets will be done using `add` function

```kotlin
fun main(){
    val exampleSet = setOf(5,4,9,4,4)
    println(exampleSet)
    println("size of set is ${exampleSet.size}")
    println("Do set contain 9: ${exampleSet.contains(9)}")

    val firstSet = mutableSetOf(5,4,3,2,1)
    val secondSet = mutableSetOf(1,2,3,4,5)
    println("are both sets equal ${firstSet == secondSet}")
    println("First Element in firstSet: ${firstSet.first()} ")
    println("First Element in secondSet: ${secondSet.first()} ")

    val firstHashSet = hashSetOf(5,4,3,2,1)
    val secondHashSet = hashSetOf(1,2,3,4,5)
    println("are both sets equal ${firstHashSet == secondHashSet}")
    println("First Element in firstSet: ${firstHashSet.first()} ")
    println("First Element in secondSet: ${secondHashSet.first()} ")
}
```

### Map

- We can have mutable and immutable maps
- Maps is a list of key value pairs
- A simple map can be created as `val maptwo = mapOf("ethan" to "mi", "keen" to "blacklist", "rhodes" to "chicagoMed", "dexter" to "dexter")`
- Two maps are considered equal when they have the same key vale pairs in them.
- Values can be fetched by using keys using get function or by the following syntax `mapOne["keen"]`
- A key value pair can be removed from map using the remove function which takes key as input.
- The list of keys and values can be fetched as map.keys and map.values respectively.
- On removing a key the value is returned as output.

```kotlin
fun main(){
    // Creating Maps
    val mapOne = mapOf("dexter" to "dexter", "keen" to "blacklist", "ethan" to "mi", "rhodes" to "chicagoMed")
    val maptwo = mapOf("ethan" to "mi", "keen" to "blacklist", "rhodes" to "chicagoMed", "dexter" to "dexter")

    // Maps are equal when they have same keys and values and same number of key-value pairs
    println("Are mapOne and mapTwo equal: ${mapOne == maptwo}")

    // Fetching values using key
    println("value of keen from mapOne: ${mapOne["keen"]}")
    // If key is not present it return null or we can return a default
    println("Value of a key narcos : ${mapOne.getOrDefault("narcos","Key not found")}")

    var tvSeriesMap = mutableMapOf("narcos" to "Agent Pena", "maria" to "dexter", "charles" to "chicago med")
    // Added new element in map
    tvSeriesMap["john-snow"]="game of thrones"

    //Removing values in a map
    println("Is charles removed from tvSeries maps ${tvSeriesMap.remove("charles")}")
    // Checking if a key is present in map
    println("is narcos present in tv series: ${"narcos" in tvSeriesMap.keys}")
    // Checking for a value in lists of values in a map
    println("Is the value dexter available in values of map tvSeriesMap ${"dexter" in tvSeriesMap.values}")
}
```

## Collection Operations

- We can create a list using listOf() function, Map using mapOf(), set using setOf(). these are immutable.
- map function is used to add transformations on an existing collection
- A list can be converted to set using list.set
- A set can be converted to list using set.list
- We can use filter function to filter elements based on a condition
- Sorting can also can be done. few examples are mentioned below.

```kotlin
val listExample = listOf(1,2,3,4,5,6,7,8,9,9,9)
    val setExample = setOf(10,20,30,40,50)
    val mapExample = mapOf(2 to 20, 5 to 50, 6 to 60)
    //List transformed by multiplying each element by 3
    val listMap = listExample.map { it * 3 }
    println("updated map : ${listMap}")
    val transformedMap = mapExample.map { Pair(it.key, it.value*2) }.toMap()
    println("Transformed map: ${transformedMap}")
    // Filter usage
    val evenNumberList = listExample.filter { it % 2 == 0 }
    println("Even numbers list: ${evenNumberList}")
    val setGreaterThan30Numbers = setExample.filter { it > 30 }
    println("updated set ${setGreaterThan30Numbers}")
    println("set in desending order ${setExample.sortedDescending()}}")
```

## Sequences

> Yet to be added

## Classes

- General class syntax `class baseClass {}`
- It can also be created as `class baseClass` but it is of no use.
- Parameters are sent to class by using constructor.
- Access modifiers or visibility modifiers can be used in from of class key word.
  - public
  - private
  - protected
  - internal

> Default is public

### Different ways of creating classes

- Can create a class with constructor keyword
- Constructor keyword is not mandatory
- If we are using internal keyword, which means this can be only used by code with in the class, Constructor keyword in mandatory.
- Parameters are passed in class declaration or with in class body.
- We can override default toString implementation, as it only provides the info of memory location of a class.

```kotlin
class sampleClass {}

class withConstructor constructor(val name: String) {}

class withOutConstructorKeyword(val name: String) {}

class withConstructorKeywordMandatory internal constructor(val name: String) {}

class Course(title: String) {
    val title = title;
    internal var description = ""
        get() {
            return if (field.isNullOrBlank()) "no description" else field
        }
    fun display(){
        print((title))
    }

    override fun toString(): String {
        return "$title - $description"
    }
}

fun main(){
    val course = Course("zen")
    course.description = "leisure book"
    println(course.toString())
}
```

### Constructors and init

Many constructors can be created in a single class, the constructors other than first one should implement all other constructors. To initialize properties `init` block can be used. Init is executed as many times as the class is invoked.

We do not have to mention constructor keyword for the first constructor, the class variables passed in are considered as constructor parameters, in the below example `(val name: String, val dept: String, val location: String = "AP")` are initial parameters.

The second constructor should implement the initial constructor as mentioned below

```
constructor(name: String, dept: String, location: String, college: String) : this(
        name,
        dept,
        location
    ) {
        this.college = college
    }
```

The next constructors should implement the one above it, example mentioned below.

```kotlin
class ConstructorReference(val name: String, val dept: String, val location: String = "AP") {
    override fun toString(): String {
        return "$name - $dept - $location"
    }

    init {
        println("Initialization block")
    }

    constructor(name: String, dept: String, location: String, college: String) : this(
        name,
        dept,
        location
    ) {
        this.college = college
    }

    constructor(name: String, dept: String, location: String, college: String, project: String) : this(
        name,
        dept,
        location,
        college
    ) {
        this.project = project
    }

    private var college = ""
    private var project = ""
}
```
