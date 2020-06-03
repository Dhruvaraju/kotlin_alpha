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
