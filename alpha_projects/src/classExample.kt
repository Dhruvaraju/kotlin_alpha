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