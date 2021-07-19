class VarsAndCasting {
    val doubleVariable: Double = 49.9494
    fun performOps() {
        println("Value of double: ${doubleVariable}")
        // Identify the type of an attribute or element
        println(doubleVariable::class.qualifiedName)
        println(doubleVariable is Double)
    }
}