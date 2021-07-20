class CollectionsOps {
}

fun main(){
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
}