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

// LADDERED IF-ELSE  EXPRESSION//

//}


// WHEN EXPRESSION/STATEMENT //


//fun main() {
//    // Accept a country as an input argument //
//    // Check whether the country is USA or Canada and then I assign assign 'North America' to the continent. //
//    // If the country is China, India, or Japan, I assign Asia to the variable continent //
//    // If the country is Uk, France, or Germany, assign continent to Europe //
//    // If the input is none of the countries, assign the value of continent to 'Unknown' //
//    // String interpolate to print "'The Country' is in 'Continent'" //
//
//    print("Please enter the name of a country: ")
//    val country = readln()
//
//    val continent = if ((country == "USA") || (country == "Canada")) {
//        "North America"
//    } else if (( country == "China") || (country == "India") || (country == "Japan")) {
//        "Asia"
//    } else if (( country == "UK") || (country == "France") || (country == "Germany")) {
//        "Europe"
//    } else {
//        "Unknown"
//    }
//
//    print("$country is in $continent")
//}
// WHEN EXPRESSION/STATEMENT - Can be use as either a statement or an expression //
// Rather than using a laddered if-else expression, we are using a a when statement //
// Continent can be on of many values and each value is specified here //
//
//fun main() {
//
//	print("Please enter the name of a continent: ")
//	val continent = readln()
//
//	when (continent) {
//		// If continent is == North America, this condition is true and will print that
//		// continent's countries //
//		"North America" -> println("USA, Canada, Mexico")
//
//		"South America" -> println("Brazil, Argentina, Chile, Peru")
//
//		"Asia" -> println("China, Japan, India, South Korea")
//
//		"Europe" -> println("UK, France, Germany, Russia")
//
//		else -> println("Sorry, unknown continent")
//
//		// Else statements are optional. REQUIRE WHEN THE WHEN STATEMENT HAS A SUBJECT OR A
//		CONDITION OF TYPE BOOLEAN, ENUM, OR A SEALED TYPE THAT CAN BE NULLABLE.When using else statements that don't return a
//		// value, they are not necessary.
//	}
// USING ENUMS //
// EXAMPLE COVERS ALL CONDITIONS POSSIBLE //
//enum class Continent {
//	NorthAmerica, SouthAmerica, Asia, Europe
//}
//
//fun main() {
//
//	print("Please enter the name of a continent: ")
//	val continent = Continent.valueOf(readln()) // valueOf converts enum into it's string value //
//
//	when (continent) {
//		Continent.NorthAmerica -> println("USA, Canada, Mexico")
//		Continent.Asia -> println("Japan, China, India, South Korea")
//		Continent.Europe -> println("UK, Russia, Germany, France")
//		Continent.SouthAmerica -> println("Brazil, Peru, Argentina, Chile")
//	}
//
//}enum class Continent {
//	NorthAmerica, SouthAmerica, Asia, Europe
//}
//
//fun main() {
//
//	print("Please enter the name of a continent: ")
//	val continent = Continent.valueOf(readln()) // valueOf converts enum into it's string value //
//
//	when (continent) {
//		Continent.NorthAmerica -> println("USA, Canada, Mexico")
//		Continent.Asia -> println("Japan, China, India, South Korea")
//		Continent.Europe -> println("UK, Russia, Germany, France")
//		Continent.SouthAmerica -> println("Brazil, Peru, Argentina, Chile")
//	}
//
//}enum class Continent {
//	NorthAmerica, SouthAmerica, Asia, Europe
//}
//
//fun main() {
//
//	print("Please enter the name of a continent: ")
//	val continent = Continent.valueOf(readln()) // valueOf converts enum into it's string value //
//
//	when (continent) {
//		Continent.NorthAmerica -> println("USA, Canada, Mexico")
//		Continent.Asia -> println("Japan, China, India, South Korea")
//		Continent.Europe -> println("UK, Russia, Germany, France")
//		Continent.SouthAmerica -> println("Brazil, Peru, Argentina, Chile")
//	}
//
//}

// EXAMPLE COVERS ALL CONDITIONS POSSIBLE //


// EXAMPLE OF NOT COVERING ALL CONDITIONS //
//enum class Continent {
//	NorthAmerica, SouthAmerica, Asia, Europe
//}
//
//fun main() {
//
//	print("Please enter the name of a continent: ")
//	val continent = Continent.valueOf(readln()) // valueOf converts enum into it's string value //
//
//	when (continent) {
//		Continent.NorthAmerica -> println("USA, Canada, Mexico")
//		else -> {
//			println("Brazil?, India?, Germany?")
//		}
//	}
//
//}
// USING ENUMS //
// EXAMPLE OF NOT COVERING ALL CONDITIONS //

// WHEN EXPRESSIONS - Expressions evaluate to values. They are used on the right hand side of an
// assignment that is the equal to and whatever they evaluate to, that is what's assigned to the
// variable on the left hand side. //

fun main() {

	print("Please enter a country: ")
	val country = readln()

	// When can be used with arbitrary expressions, not just constants as branch conditions. //
	// When the written console value is in a list of the countries, it assigns the continent of
	// that written country //
	// The when express returns a value, that is then assigned to the variable of the left hand
	// side expression //
	val continent = when (country) {
		in listOf("China", "India", "Korea", "Indonesia", "Japan") -> "Asia"
		in listOf("USA", "Canada", "Mexico") -> "North America"
		in listOf("The UK", "France", "Germany", "Russia") -> "Europe"
		in listOf("Brazil", "Argentina", "Chile", "Peru") -> "South America"
		else -> "Unknown country"
	}
	println("$country is in $continent")
}

// WHEN EXPRESSIONS //
// CONDITIONAL BRANCHING //
