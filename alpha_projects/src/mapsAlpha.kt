class mapsAlpha {
}

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