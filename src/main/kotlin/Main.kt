import java.util.*
import kotlin.collections.ArrayList


	// LISTS - DATA STRUCTURE - KOTLIN HAS TWO TYPES OF EVERY DATA STRUCTURE , MUTABLE AND
// IMMUTABLE //

	// IMMUTABLE LIST - USE listOf() to instantiate //

		fun main() {
			val boysList = listOf("Greg", "James", "Aaron", "Bob") // IMMUTABLE LIST OF STRING
		// ELEMENTS //
			println("boysList (initialized using listOf()) : $boysList") // Print out //

			// Explicitly specifying the type parameter when using listOf() is not recommended //
			val girlsList = listOf<String>("Julie", "Nora", "Sandra", "Nina")
			println("girlsList (initialized using listOf<String>()) : $girlsList")

			// When using the default listOf, under the hood  is an arrayList, a list backed by
		// an array, elements in contiguous locations //

			val arrayList = ArrayList<String>() // Explicitly creating and arrayList //
			arrayList.add("Jack")
			arrayList.add("Nora")
			arrayList.add("Michael")

			println("arrayList (initialized using ArrayList<String>()) : $arrayList")

			// CREATING LIST OF A DIFFERENT TYPE //
			// LINKED LIST - ONE ELEMENT POINTS TO THE NEXT ONE IN THE LIST //
			val linkedList = LinkedList<String>()
			linkedList.add("Dylan")
			linkedList.add("Jessica")

			println("linkedList (initialized using LinkedList<String>()) : $linkedList")
			// LINKED LIST //

			// EMPTY LIST - If instantiating an empty list, you HAVE to specify the type in
			// angular brackets //
			val emptyList = listOf<String>()

			println("emptyList (initialized using listOf<String>()) : $emptyList")
			// EMPTY LIST //
			// CREATING LIST OF A DIFFERENT TYPE //
		}

	// IMMUTABLE LIST - USE listOf() to instantiate //


	// LISTS //


