class SequenceAsAsync {
}


fun main(){
    val finalResult = (100 until 150).asSequence()
        .map{it * 2}
        .filter { it % 3 == 0 }
        .first()
    println("final result: ${finalResult}")

    val myThrees = sequenceOf(1, 3, 5, 7, 9).filter { it % 3 == 0 }.toList()
    println(myThrees)
    println(myThrees.toList())
}