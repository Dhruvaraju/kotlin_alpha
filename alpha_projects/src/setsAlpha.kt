class setsAlpha {}

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