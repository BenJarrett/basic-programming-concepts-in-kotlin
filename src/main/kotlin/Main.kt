// LISTS - DATA STRUCTURE - KOTLIN HAS TWO TYPES OF EVERY DATA STRUCTURE , MUTABLE
// AND
// IMMUTABLE //

// IMMUTABLE LIST - USE listOf() to instantiate - Any list created using listOf() is IMMUTABLE //
// LIST - A sequence of elements in which order matters //
//fun main() {
//	val boysList = listOf("Greg", "James", "Aaron", "Bob") // IMMUTABLE LIST OF STRING
//	// ELEMENTS //
//	println("boysList (initialized using listOf()) : $boysList") // Print out //
//
//	// Explicitly specifying the type parameter when using listOf() is not recommended //
//	val girlsList = listOf<String>("Julie", "Nora", "Sandra", "Nina")
//	println("girlsList (initialized using listOf<String>()) : $girlsList")
//
//	// When using the default listOf, under the hood  is an arrayList, a list backed by
//	// an array, elements in contiguous locations //
//
//	val arrayList = ArrayList<String>() // Explicitly creating and arrayList //
//	arrayList.add("Jack")
//	arrayList.add("Nora")
//	arrayList.add("Michael")
//
//	println("arrayList (initialized using ArrayList<String>()) : $arrayList")
//
//	// CREATING LIST OF A DIFFERENT TYPE //
//	// LINKED LIST - ONE ELEMENT POINTS TO THE NEXT ONE IN THE LIST //
//	val linkedList = LinkedList<String>()
//	linkedList.add("Dylan")
//	linkedList.add("Jessica")
//
//	println("linkedList (initialized using LinkedList<String>()) : $linkedList")
//	// LINKED LIST //
//
//	// EMPTY LIST - If instantiating an empty list, you HAVE to specify the type in
//	// angular brackets //
//	val emptyList = listOf<String>()
//
//	println("emptyList (initialized using listOf<String>()) : $emptyList")
//	// EMPTY LIST //
//	// CREATING LIST OF A DIFFERENT TYPE //
//
//	// RESULT //
////	boysList (initialized using listOf()) : [Greg, James, Aaron, Bob]
////	girlsList (initialized using listOf<String>()) : [Julie, Nora, Sandra, Nina]
////	arrayList (initialized using ArrayList<String>()) : [Jack, Nora, Michael]
////	linkedList (initialized using LinkedList<String>()) : [Dylan, Jessica]
////	emptyList (initialized using listOf<String>()) : []
//	// RESULT //
//}


// DUPLICATED ELEMENTS LIST EX. //
// These can contain duplicate elements, where as SETS can only include unique values //

//fun main() {
//
//	val peopleList = listOf("Greg", "James", "Bob", "Claudia", "Claudia" )
//
//
//	println("peopleList : $peopleList")
//	println("Size of peopleList : ${peopleList.size}")
//
//	println("First Element of peopleList : ${peopleList[0]}") // Access first element in the list //
//	println("Last element of peopleList : ${peopleList[peopleList.size - 1 ]}") // .size gives us
//	// the number of elements in the list // // We are using the square brackets again, but this
//	// time to  access the last element of the list which is at index position peopleList.size -1
//	// . That is  number of elements minus one. That is the last index position //
//
//	// Both SETS AND LISTS support the contains() method - Tells you whether or not it contains a
//	// a specific element //
//	println("Does peopleList contain Alice? : ${peopleList.contains("Alice")}")
//	println("Subset of peopleList : ${peopleList.subList(1,3)}") // Get part of the list starting
//	// at element 1 and up to, but not including the element at index position 3 //
//
//
//	println("Is peopleList empty? : ${peopleList.isEmpty()}")
//	println("Is peopleList NOT EMPTY? : ${peopleList.isNotEmpty()}")

// RESULT //
//	peopleList : [Greg, James, Bob, Claudia, Claudia]
//	Size of peopleList : 5
//	First Element of peopleList : Greg
//			Last element of peopleList : Claudia
//			Does peopleList contain Alice? : false
//	Subset of peopleList : [James, Bob]
//	Is peopleList empty? : false
//	Is peopleList NOT EMPTY? : true
// RESULT //
//}


// DUPLICATED ELEMENTS LIST EX. //

// Collections support a variety of methods and operations //

//fun main() {
//	val numbersList = listOf(20, 34, 56, 76, 11, 37)
//	println("numbersList : $numbersList")
//
//	// Predicates
//	// Invoking a number of predicates on the list to test for specific conditions //
//	println("Test if any() > 50 true : ${numbersList.any { it > 50 }}") // See if any element in
//// the list is greater than 50, doing so by invoking the any() method and passing in the
//// predicate condition on my list // Invoking any() by passing in a trailing Lambda //
//	println("Test if none() > 100 true : ${numbersList.none { it > 100 }}")
//	println("Test if all() < 60 true : ${numbersList.all { it < 60 }}")
//
//	// FILTERING
//	val greaterThan50 = numbersList.filter { it > 50 } // gives all elements in numbersList that
//	// are greater than 50, and store them in a new list called greaterThan50 //
//	println("Greater than 50 : $greaterThan50")
//
//	// Plus and Minus // - LISTS in KOTLIN support the PLUS and MINUS operators //
//	// Can use these to add and subtract elements to a list //
//	// We then asked it to store the new result into a new list called plusList //
//	val plusList = numbersList + 100 + 200
//	println("Added Elements: $plusList")
//
//	val minusList = numbersList - listOf(56, 76)
//	println("Subtracted Elements: $minusList")
//}
// EXPECTED RESULTS //
//	numbersList : [20, 34, 56, 76, 11, 37]
//	Test if any() > 50 true : true
//	Test if none() > 100 true : true
//	Test if all() < 60 true : false
//	Greater than 50 : [56, 76]
//	Added Elements: [20, 34, 56, 76, 11, 37, 100, 200]
//	Subtracted Elements: [20, 34, 11, 37]
// EXPECTED RESULTS //

// LISTOF() LISTS ARE IMMUTABLE //
// EX. OF THE ERROR YOU WOULD SEE //
// Error - "No set method providing array access //
//fun main() {
//	val numbersList = listOf(20, 34, 56, 76, 11, 37)
//
//	numbersList[0] = 1000
//}

// CREATING A MUTABLE LIST - mutableListOf() //
//fun main() {
//	val numbersList = mutableListOf(20, 34, 56, 76, 11, 37)
//
//	numbersList[0] = 1000 // changing the first element to 1000
//
//	println("Mutated List : $numbersList")
//
//	// EXPECTED RESULT //
//
////	Mutated List : [1000, 34, 56, 76, 11, 37]
//
//	// EXPECTED RESULT //
//}

fun main() {

	// ADDITIONAL OPERATIONS //
	// MUTABLE LIST WITH OTHER OPERATIONS //
	val peopleList = mutableListOf("Greg", "James", "Alice", "Bob")
	println("Original peopleList")
	println("peopleList : $peopleList")
	println()

	// REMOVE AT
	peopleList.removeAt(3) // remove which element you want to remove
	println("Removing element from list")
	println("peopleList : $peopleList")
	println()

	// MODIFY ELEMENT IN LIST
	println("Modifying element in list")
	peopleList[1] = "Larry"
	println("peopleList : $peopleList")
	println()

	// SHUFFLE OR RANDOMIZE LIST
	println("Shuffling elements in list")
	peopleList.shuffle()
	println("peopleList : $peopleList")
	println()

	// RESULTS //
// Original peopleList
	//peopleList : [Greg, James, Alice, Bob]
	//
	//Removing element from list
	//peopleList : [Greg, James, Alice]
	//
	//Modifying element in list
	//peopleList : [Greg, Larry, Alice]
	//
	//Shuffling elements in list
	//peopleList : [Larry, Greg, Alice]
	// RESULTS //

	// ADDITIONAL OPERATIONS //

}

// CREATING A MUTABLE LIST - mutableListOf() //

// LISTOF() LISTS ARE IMMUTABLE //

// IMMUTABLE LIST - USE listOf() to instantiate //




