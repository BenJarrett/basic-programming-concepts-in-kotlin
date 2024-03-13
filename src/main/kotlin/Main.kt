// Just like in Java, in Kotlin strings are just a sequence of characters. So you can use the square brackets to access the individual characters in a string //
//fun main() {
//    val title = "Harry Potter and the Prisoner of Azkaban"
//    println(title)
//
//    println("First Character: " + title[0])
//    println("Third Character: " + title[2])
//    println("Ninth Character: " + title[8])

// Strings in Kotlin can be RAW STRINGS //
// RAW STRINGS - Can contain arbitrary characters within them, that can contain new lines or arbitrary text. RAW STRINGS are delimited using triple quotes. //
// The 3 spaces after and + in the variable title are arbitrary spaces. They are also part of the string //
// These are referred to as LEADING WHITE SPACES //
// TRIMMING LEADING WHITE SPACES EMBEDDED WITHIN THE RAW STRING - use the trimMargin() function - EX. in anotherTitle variable below //
// trimMargin() by default, looks for the | character and trims all leading white spaces just before the | character //

//    fun main() {
//        val title = """Harry Potter and
//            the Goblet of Fire"""
//        println(title)
//
//        val anotherTitle = """Harry Potter
//            |and the Order of the Phoenix""".trimMargin()
//        println(anotherTitle)

// This is the output when running the code above //
// Harry Potter and
//            the Goblet of Fire
//Harry Potter
//and the Order of the Phoenix //
// This is the output when running the code above //
//}

// Can change the marginPrefix of the trimMargin() function //
//        fun main() {
//            val title = """Harry Potter and
//                the Goblet of Fire"""
//            println(title)
//
//            val anotherTitle = """Harry Potter
//                |and the Order of the Phoenix""".trimMargin()
//            println(anotherTitle)
//
//            val oneMoreTitle = """Harry Potter
//                *and the Chamber of Secrets""".trimMargin(marginPrefix = "*")
//            println(oneMoreTitle) // Result //
////            Harry Potter
////                    and the Chamber of Secrets
//            // Result //
//
//        // Can change the marginPrefix of the trimMargin() function //
//
//
//        }


// STRING POOLS //
// When you initialize a new string using quotes, that string is automatically placed in the STRING POOL //
// If you initialize the same string twice in different places, it will reference the same string within the STRING POOL //
// title and sameTitle with reference the same instance in the STRING POOL //
// anotherTitle is a completely different string and will be a separate instance of the string in the STRING POOL //
// .equals() method is a way to check the structural equality of the two strings with the == //
//        fun main() {
//            val title = "Harry Potter and the Prisoner of Azkaban"
//
//            val sameTitle = "Harry Potter and the Prisoner of Azkaban"
//            val anotherTitle = "Harry Potter and the Goblet of Fire"
//
//            println("Is title == sameTitle: " + (title == sameTitle)) // this checks the action contents or value of the variable, in this case the string, and return true or false if they are equal or not //
//            // == checks for the equality of the string contents, does not check whether the two strings belong to the same memory location //
//            println("Is title.equals.(sameTitle): " + (title.equals(sameTitle))) // this line does the same thing, but with the .equals() function instead //
//
//            println()
//
//            println("Is title == anotherTitle: " + (title == anotherTitle))
//            println("Is title.equals.(anotherTitle): " + (title.equals(anotherTitle)))
//
//            // Expected Result from example above //
//            // Is title == sameTitle: true
//            //Is title.equals.(sameTitle): true
//            //
//            //Is title == anotherTitle: false
//            //Is title.equals.(anotherTitle): false //
//
//        // STRING POOLS //
//
//        }

//fun main() {
//
//    // === Operator //
//    // Checking whether two objects reference the same memory location //
//    val title = "Harry Potter and the Prisoner of Azkaban"
//
//    val sameTitle = "Harry Potter and the Prisoner of Azkaban"
//    val anotherTitle = "Harry Potter and the Goblet of Fire"
//
//    println("Is title === sameTitle: " + (title === sameTitle))
//    println("Is title === anotherTitle: " + (title === anotherTitle))
//
//    // Returns //
////    Is title === sameTitle: true
////    Is title === anotherTitle: false
//    // Returns //
//    // === Operator //
//
//}

//fun main() {
//
//    // String are immutable //
//    // When invoking methods on a string that changes the string, the string itself is not changed //
//    // Instead, you get a new string with the changed values //
//
//    val title = "Harry Potter and the Prisoner of Azkaban"
//
//    val titleInUppercase = title.uppercase()
//    val titleInLowercase = title.lowercase()
//
//    println("Title: $title")
//    println("Title in lowercase: $titleInLowercase")
//    println("Title in uppercase: $titleInUppercase")
//
//    // Result //
//    // Title: Harry Potter and the Prisoner of Azkaban
//    //Title in lowercase: harry potter and the prisoner of azkaban
//    //Title in uppercase: HARRY POTTER AND THE PRISONER OF AZKABAN //
//    // Result //
//
//}

//fun main() {
//
//    // TEMPLATE EXPRESSIONS - Pieces of code that are evaluated and the results are then concatenated and then embedded into the string  //
//    // TEMPLATE EXPRESSIONS always start with the $ and contain either a variable name or an expression evaluated within curly braces //
//    // String literals, that is string specified in quotes, may contain a TEMPLATE EXPRESSION //
//    // Both values of the variables stringVal and intVal will be evaluated and embedded into stringTemplateVal variable //
//    val stringVal = "Nora"
//    val intVal = 23
//    val stringTemplateVal = "The name is $stringVal and the number is $intVal"
//
//    println(stringTemplateVal)
//
//    // RESULT //
////    The name is Nora and the number is 23 //
//    // RESULT //
//
//    // TEMPLATE EXPRESSIONS //
//
//}

//fun main() {
//    // If you have template expression that you want to evaluate and embed the result within a string, you with use curly braces {}//
//
//    val intValOne = 23
//    val intValTwo = 43
//    val stringTemplateVal = "The sum of the two numbers is ${intValOne + intValTwo}"
//
//    println(stringTemplateVal)
//
//    // RESULT //
//    // The sum of the two numbers is 66 //
//    // RESULT //
//}

fun main() {

    // You can also invoke methods //
    // You can have chained expressions //
    val title = "Harry Potter and the Prisoner of Azkaban"

    println("Title: $title")
    println("Title in lowercase: ${title.lowercase()}")
    println("Title in uppercase: ${title.uppercase()}")

    // RESULT //
    // Title: Harry Potter and the Prisoner of Azkaban
    //Title in lowercase: harry potter and the prisoner of azkaban
    //Title in uppercase: HARRY POTTER AND THE PRISONER OF AZKABAN //
    // RESULT //
}
