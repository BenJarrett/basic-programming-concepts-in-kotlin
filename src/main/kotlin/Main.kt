fun main() {

	// DATA STRUCTURES CONTINUED //

	// MAPS - Sores elements in the form of key value pairs, where every key is associated with a
	// value and you can look up the corresponding value by specifying the key that you're
	// looking for//
	// KEYS need to be UNIQUE, VALUES do not //
	val peopleMap = mapOf("Greg" to 36,
		"Bob" to 23,
		"Jack" to 38,
		"Alice" to 32)
	println("peopleMap (initialized using mapOf()) : $peopleMap")

	// When creating a map, all of the key elements should be of the same type and the values of
	// should be of the same time. //
	// You can specify the types of the keys and values using angular brackets //

	val anotherPeopleMap = mapOf<String, Int>("Janice" to 43, // <Type Specification is only
		// needed when there is an empty map //
		"Tim" to 38,
		"Peter" to 28,
		"Joseph" to 24)
	println("anotherPeopleMap (initialized using mapOf<String, Int>()) : $anotherPeopleMap")

	// LINKED HASH MAP -Preserves the order in which you add elements to the map //
	// TAKES UP MORE MEMORY //

	// USES CONSTRUCTOR to instantiate a linked hash map //
	// When using a CONSTRUCTOR to create a map, the map is MUTABLE //
	val orderedPeopleMap = LinkedHashMap<String, Int>()
	orderedPeopleMap["Zelda"] = 38
	orderedPeopleMap["Carrie"] = 56
	orderedPeopleMap["Gabrielle"] = 38
	println("orderedPeopleMap (intialized using LinkedHashMap<String, Int>) : $orderedPeopleMap")
	// LINKED HASH MAP //

	// HASH MAP - Takes up LESS memory and DOESN'T preserve the order //
	val unorderedPeopleMap = HashMap<String, Int>()
	unorderedPeopleMap["John"] = 45
	unorderedPeopleMap["Ted"] = 32
	unorderedPeopleMap["Susan"] = 34
	println("unorderedPeopleMap (initialized using HashMap<STring, Int> : $unorderedPeopleMap")
	// HASH MAP //

	// When instantiating an empty using mapOf() or mutableMapOf()< you need to specify the
// generic type parameters of the keys and values
	val emptyMap = mapOf<Int, String>()
	println("emptyMap (initialized using mapOf<Int, String>) : $emptyMap")


	// RESULT OF CODE //

/*	peopleMap (initialized using mapOf()) : {Greg=36, Bob=23, Jack=38, Alice=32}
	anotherPeopleMap (initialized using mapOf<String, Int>()) : {Janice=43, Tim=38, Peter=28, Joseph=24}
	orderedPeopleMap (initialized using LinkedHashMap<String, Int>) : {Zelda=38, Carrie=56, Gabrielle=38}
	unorderedPeopleMap (initialized using HashMap<String, Int> : {Ted=32, Susan=34, John=45}
	emptyMap (initialized using mapOf<Int, String>) : {}*/
	// RESULT OF CODE //
	// MAPS //
	// DATA STRUCTURES CONTINUED //

	// COMMON OPERATIONS PERFORMED WITH MUTABLE MAPS //
	val peopleMapTwo = mutableMapOf(
		"Greg" to 36,
		"Barbara" to 23,
		"Jack" to 38,
		"Alice" to 32,
	)

	println("Original peopleMapTwo: $peopleMapTwo")

	// ADD a new key-value pair
	peopleMapTwo["Claudia"] = 29

	// UPDATE existing key-value pair
	peopleMapTwo["Alice"] = 25

	// REMOVE existing key-value pair
	peopleMapTwo.remove("Jack")

	println("Updated peopleMapTwo: $peopleMapTwo")

	// RESULTS //

	/*Original peopleMapTwo: {Greg=36, Barbara=23, Jack=38, Alice=32}
	Updated peopleMapTwo: {Greg=36, Barbara=23, Alice=25, Claudia=29}*/

	// RESULTS //

	// COMMON OPERATIONS PERFORMED WITH MUTABLE MAPS //

	// SPECIAL OPERATIONS PERFORMED USING MAPS //
	// ACCESSING UNKNOWN KEYS //
	val peopleMapThree = mutableMapOf(
		"Greg" to 36,
		"Barbara" to 23,
		"Jack" to 38,
		"Alice" to 32,
	)

	println("Original peopleMapThree: $peopleMapThree")

	// Accessing unkown keys
	println("Access to unknown key: ${peopleMapThree["Louise"]}") // by default, this returns
	// null. We are accessing the value of an unknown key in a map

	// We might not want to deal with nulls in our code. If so, we would want to use the
	// getOrDefault() method. If we pass in a known key, the corresponding value is return, but
	// if we pass in an unknown key, like we do below, the default value of 0 will be returned
	// for the value
	// getOrDefault() is BEST PRACTICE when accessing keys in a map, that way if the key does not
	// exist, we are not left dealing with null values. Instead we are dealing with a reaasonable
	// default value such as 0 or a negative number
	println("Access unknown key using getOrDefault(): " +
			"${peopleMapThree.getOrDefault("Louise", 0)}")

	// USING CLASS OPERATOR OVERLOADING to add and remove elements from a map //

	// ADD
	// Includes all key-value pairs from original peopleMapThree, plus the key-value pair of
	// Louise, 48
	val plusLouise = peopleMapThree + Pair("Louise" , 48)
	println("Adding Louise: $plusLouise")

	// ADD TO EXISTING/ UPDATING KNOWN KEY-VALUE PAIRS
	// Plus operator with a setOf() key-value pairs
	// The overloaded Plus operator with AUTOMATICALLY perform an update if the keys already
	// exist in the map
	// peopleMapThree + setOf pairs "Greg" map to 42 and "Jack" map to 56
	// UPDATING EXISTING KEYS IN A MAP

	val updateGregJack = peopleMapThree + setOf("Greg" to 42, "Jack" to 56);
	println("Updating Greg and Jack: $updateGregJack")

	// SUBTRACT - Just like the ADD operator, this can be used to remove key-value pairs in a map

	// SUBTRACTING key-value pair
	// NOTICE - Only need to specify the KEY you want to remove
	val minusJack = peopleMapThree - "Jack"
	println("Removing Jack: $minusJack")

	// SUBTRACTING MULTIPLE - use listOF() - can use setOf() as well
	val minusGregAlice = peopleMapThree - listOf("Greg", "Alice")
	println("Removing Greg and Alice: $minusGregAlice")

	// RESULTS //
/*	Access to unknown key: null
	Access unknown key using getOrDefault(): 0
	Adding Louise: {Greg=36, Barbara=23, Jack=38, Alice=32, Louise=48}
	Updating Greg and Jack: {Greg=42, Barbara=23, Jack=56, Alice=32}
	Removing Jack: {Greg=36, Barbara=23, Alice=32}
	Removing Greg and Alice: {Barbara=23, Jack=38}*/

	// RESULTS //

	// Subtract

	// USING CLASS OPERATOR OVERLOADING to add and remove elements from a map //
	// ACCESSING UNKNOWN KEYS //

	//

	// SPECIAL OPERATIONS PERFORMED USING MAPS //


}