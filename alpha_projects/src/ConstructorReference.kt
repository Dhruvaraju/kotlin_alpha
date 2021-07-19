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

fun main() {
    val student = ConstructorReference("dexter", "CSI", "MIAMI")
    println(student)
    val student001 = ConstructorReference("redJohn", "forensics", "California", "MIT")
    println(student001)
    val student002 = ConstructorReference("keen","Criminology","DC","Yale","STF")
    println(student002)
}