//fun main() {
//
//	// SETS // - Another common data structure. A unique collection of elements, where an element
//// can occur exactly one. THERE ARE NO DUPLICATES - There is no ordering, it does not matter //
//	// IMMUTABLE SETS //
//	// setOf() Method - Creates set of elements - immutable //
//
//	val peopleSet = setOf("Greg", "Alice", "Bob", "Greg", "Alice") // Greg and Alice are
//	// duplicates, when the set is create, the duplicates will be eliminated //
//	println("peopleSet (initialized using setOf()) : $peopleSet")
//	// RESULT //
////	peopleSet (initialized using setOf()) : [Greg, Alice, Bob]
//	// RESULT //
//
//	// This technique for creating sets IS NOT RECOMMENDED
//	// The duplicate peter is eliminated
//	val anotherPeopleSet = setOf<String>("Julie","Peter","Brian","Charles","Peter")
//	println("anotherPeopleSet (initialized using setOf<String>()) : $anotherPeopleSet")
// RESULT //
//	anotherPeopleSet (initialized using setOf<String>()) : [Julie, Peter, Brian, Charles]
// RESULT //

// linkedHashSet() - MUTABLE - TAKES UP MORE MEMORY - Maintains the order of the elements in
// the set, based on the order in which you added those elements, but because it maintains an additional linked list kind of
// structure, IT TAKES UP MORE MEMORY SPACE. // Used to retrieve the elements in the set in the order in which you added those elements to the set - Specific use case. Main
// This LinkedHashSet orders elements but takes up more space in memory
// Still removes duplicates bc it's a SET
//	val orderedPeopleSet = LinkedHashSet<String>()
//	orderedPeopleSet.add("Nora")
//	orderedPeopleSet.add("Michael")
//	orderedPeopleSet.add("Nora")
//	orderedPeopleSet.add("Judy")
//	println("orderedPeopleSet (initialized using LinkedHashSet<String>) : $orderedPeopleSet")
//	// RESULT //
////	orderedPeopleSet (initialized using LinkedHashSet<String>) : [Nora, Michael, Judy]
//	// RESULT //
//
//
//	// When obstantiating an EMPTY SET, like in the examples below, you have to specify the type
//	// parameter of the elements in that set //
//	// HASH SET - HashSet<String>() - DOES NOT maintain the order of the elements // Takes up
//// less memory space compared to linkedHasSet() bc it DOESN'T use a kind of linked list like // structure
//// USE CASE - If you don't really care about the order in which the elements of a set are accessed.
//	// This HashSet does NOT order elements, but takes up less memory space
//	// STILL REMOVES DUPLICATES like any other set
//	// Elements may be printed in any random order
//	//
//	val unorderedPeopleSet = HashSet<String>()
//	unorderedPeopleSet.add("Daisy")
//	unorderedPeopleSet.add("Geoff")
//	unorderedPeopleSet.add("Geoff")
//	unorderedPeopleSet.add("Thomas")
//	println("unorderedPeopleList (initialized using HashSet<String>) : $unorderedPeopleSet")
//	// RESULT //
////	unorderedPeopleList (initialized using HashSet<String>) : [Thomas, Daisy, Geoff]
//	// RESULT //
//
//}

//	// IMMUTABLE SETS //
// SETS //

// MUTABLE SETS - mutableSetOf() //
fun main() {
	val numberSet = mutableSetOf(23.5, 56.1, 45.7, 88.9)

	println("Original numberSet: $numberSet")

	numberSet.add(102.9)
	numberSet.remove(23.5)
	println("Updated numberSet: $numberSet")


	// SET SPECIFIC OPERATIONS //

	// UNION - Combines the elements of the set with the elements of the new set that is
// specified.
	// When performing the Union operation in the manner below, the RESULT IS A NEW SET. THE
	// ORIGINAL NUMBERSET REMAINS UNCHANGED //
	println("Union operation")
	println(numberSet union setOf(1000.34, 2000.23)) // Union the contents of numberSet with a
	// set of two numbers 1000.34 and 2000.23
	// Duplicates are removed
	println("Original numberSet: $numberSet") // For my reference to show that the original set
	// is unchanged and the Union created a new set that did not change the original
	// UNION //

	// INTERSECT - Will return a set with the elements that are common between the two sets that
	// you have intersected //
	println("Intersection Operation")
	println(numberSet intersect setOf(1000.34, 56.1, 45.7)) // numberSet intersect setOf and
// specified three elements, 1000.34, 56.1, and 45.7
	// 1000.34 is not part of the original numberSet, but the other two elements 56.1 and 45.7
// are common between the two sets and that will be the result
	// INTERSECT //

	// SUBTRACTION - Computes the difference between the two compared sets //
	println("Subtract Operation")
	println(numberSet subtract setOf(1000.34, 56.1)) // If you look at numberSet and the set we
// are subtracting from it, you can see that the element 1000.34 is not present in the
// original numberSet, bu the element 56.1 is present. The element that is present will be
// subtracted from the original set
	// 546.1 will be removed from the original set, and we will get a new set as the result
	// SUBTRACTION //

	// RESULTS //
//	Original numberSet: [23.5, 56.1, 45.7, 88.9]
//	Updated numberSet: [56.1, 45.7, 88.9, 102.9]
//	Union operation
//			[56.1, 45.7, 88.9, 102.9, 1000.34, 2000.23]
//	Original numberSet: [56.1, 45.7, 88.9, 102.9]
//	Intersection Operation
//			[56.1, 45.7]
//	Subtract Operation
//			[45.7, 88.9, 102.9]
	// RESULTS //

	// SET SPECIFIC OPERATIONS //
}

// MUTABLE SETS - mutableSetOf() //
