// CONDITIONAL BRANCHING //
//fun main() {
//    if (true) {
//        print("'true' is True.")
//    }
//
//    // RESULT //
//    // 'true' is True. //
//    // RESULT //
//}

//fun main() {
//    if (false) {
//        print("'false' is True")
//    } else {
//        print("'false is False")
//    }
//
//    // RESULT //
//    // 'false is False //
//    // RESULT //
//}

//fun main() {
//    // Accepts two numbers from console input. If the first number is greater than or equal to the second number, I'll print something, otherwise I will print out something else //
//
//    print("Input the first number: ")
//    val firstNum = readln().toInt()
//
//    print("Input the second number: ")
//    val secondNum = readln().toInt()
//
//    if (firstNum >= secondNum) {
//        print("$firstNum is greater than or equal to $secondNum")
//    } else {
//        print("$firstNum is less than $secondNum")
//    }
//
//
//}

//fun main() {
//    // Something a little different about conditional branching in Kotlin //
//    // IF EXPRESSIONS - If statements in Kotlin can be if expressions, can be written as expressions where you don't have statements executed in a block, but can have statements with a return value that can then be assigned to a variable //
//
//    print("Input the first number: ")
//    val firstNum = readln().toInt()
//
//    print("Input the second number: ")
//    val secondNum = readln().toInt()
//
//    var result = if (firstNum >= secondNum) {
//        "$firstNum is greater than or equal to $secondNum"
//    } else {
//        "$firstNum is less than $secondNum"
//    }
//
//    println(result)
//    // IF EXPRESSIONS //
//}

//fun main() {
//
//    // If firstNum is equal to secondNum, then I store the string in the result, firstNum and secondNum with be evaluated to their variables. Else I store the string, firstNum is not equal to secondNum in the variable result, then print out what's in result. //
//    print("Input the first number: ")
//    val firstNum = readln().toInt()
//
//    print("Input the second number: ")
//    val secondNum = readln().toInt()
//
//    val result = if (firstNum == secondNum) {
//        "$firstNum is equal to $secondNum"
//    } else {
//        "$firstNum is not equal to $secondNum"
//    }
//
//    println(result)
//}

        // LADDERED IF-ELSE EXPRESSION //
        // Chain together multiple if-else statements //

fun main() {
    // Accept a country as an input argument //
    // Check whether the country is USA or Canada and then I assign assign 'North America' to the continent. //
    // If the country is China, India, or Japan, I assign Asia to the variable continent //
    // If the country is Uk, France, or Germany, assign continent to Europe //
    // If the input is none of the countries, assign the value of continent to 'Unknown' //
    // String interpolate to print "'The Country' is in 'Continent'" //

    print("Please enter the name of a country: ")
    val country = readln()

    val continent = if ((country == "USA") || (country == "Canada")) {
        "North America"
    } else if (( country == "China") || (country == "India") || (country == "Japan")) {
        "Asia"
    } else if (( country == "UK") || (country == "France") || (country == "Germany")) {
        "Europe"
    } else {
        "Unknown"
    }

    print("$country is in $continent")
}
        // LADDERED IF-ELSE  EXPRESSION//
// CONDITIONAL BRANCHING //
