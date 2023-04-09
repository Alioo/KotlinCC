fun main() {
//    println("Hello World!")
//    // Type is fixed once value is assigned
//    val name = "kotlin"
//    val name2 : String = "kotlin"
//    var language = "java"
//    language = "c++"
//    //name = "php"  -- nope
//
//    // Null safety
//    // language = null will not work normally
//    var language2 : String? = "java" // can be null now with ?
//    language2 = null
//
//    // String templates
//    println("Hello, $name")
//    println("Hello, ${1+2}")
//
//    // arrays
//    // arrays are a class in Kotlin (everything is)
//    val arr = arrayOf(1,2,3)
//    println(arr[0])
//
//    val intArr : IntArray = intArrayOf(2,4,6,8) // No inheritence from regular arrays but same methods
//
//    // Conditional branches
//    print("Enter age: ")
//    val age = Integer.valueOf(readln())
//
//    if(age >= 21) println("booze up boi")
//    else println("go home boi")
//
//    val result = if (age >= 21) "Booze up boi" else "go home boi"
//    println(result)
//
//    // When expression
//    println("What day is it: ")
//    val day = readln()
//    when(day) {
//        "Monday" -> println("Ass")
//        "Friday" -> println("Feesh")
//        "Sunday" -> println("Jesus")
//        else -> println("Bacon I guess")
//    }
//    val food = when(day) {
//        "Monday" -> "Ass"
//        "Friday" -> "Feesh"
//        "Sunday" -> "Jesus"
//        else -> "Bacon I guess"
//    }
//    println(food)
//
//    val food2 = when(day) {
//        "Monday", "Wednesday" -> "Ass"
//        "Friday" -> "Feesh"
//        "Sunday" -> "Jesus"
//        else -> "Bacon I guess"
//    }
//    println(food2)
//
//    // When with no args
//    val food3 = when {
//        day == "Monday" -> "Ass"
//        food == "Feesh" -> "Kill"
//        day == "Friday" -> "Feesh"
//        day == "Sunday" -> "Jesus"
//        else -> "Bacon I guess"
//    }
//    println(food3)

    // for loops (while is the same)
//    val list = listOf<String>("Kotlin", "Java", "Python")
//    val map = mapOf(1 to "Kotlin", 2 to "Java", 3 to "Python")
//    val ia : IntArray = intArrayOf(2,4,6,8)
//    for ( a in list) {
//        println(a)
//    }
//    for ((key, value) in map) {
//        println("$key => $value")
//    }
//
//    for (i in 1..9) { // inclusive of upper
//        print(i)
//    }
//
//    for (i in 1 until 9 step 2) { // does not include uper, steps 2
//        print(i)
//    }
//
//    for (i in 9 downTo 1) { // Count down
//        print(i)
//    }

    // extension function (extends features onto a class)
    fun String.getEmotion(): String {
        return when {
            last() == '!' -> "Excited"// last is from string class
            last() == '?' -> "Curious"
            last() == '.' -> "Calm"
            else -> "Unknown"
        }
    }
    val s = "How are you?"
    println(s.getEmotion())

}