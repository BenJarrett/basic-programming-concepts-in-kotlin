fun main() {

	// NULL SAFETY - Variable CANNOT hold nulls unless you EXPLICITLY SPECIFY that they CAN //
	// By default, any variables and values that you declare are NON-NULLABLE and can safely
	// access the objects within those variables and invoke methods on them without having null
	// reference errors

	// Null cannot be a value of a non-null type //
	// Val and Var type variables on non-nullable by default - They cannot hold null values
	// That allows us to use them safely


	// EX. WILL GET THIS COMPILE TIME ERROR - Null can not be a value of a non-null type String //
/*	val someString: String = null
	val someBoolean: Boolean = null
	var someInt: Int = null
	var someDouble: Double = null


	println("Some string $someString")
	println("Some boolean $someBoolean")
	println("Some Int $someInt")
	println("Some double $someDouble")*/
	// EX. WILL GET THIS COMPILE TIME ERROR - Null can not be a value of a non-null type String //

	// EX. CORRECT EXAMPLE //
	// There might be situations where you want a variable to be able to hold a null value. A
	// null is a valid value and you're OK performing all null safety checks
	// You need to explicitly indicate that a variable is nullable by using the ?
	val someString: String? = null
	val someBoolean: Boolean? = null
	var someInt: Int? = null
	var someDouble: Double? = null


	println("Some string $someString")
	println("Some boolean $someBoolean")
	println("Some Int $someInt")
	println("Some double $someDouble")

	// RESULT //
/*	Some string null
	Some boolean null
	Some Int null
	Some double null*/
	// RESULT //
	// EX. CORRECT EXAMPLE //

	// NULL SAFETY CONTINUED //
	// INVOKING A METHOD ON A NON-NULLABLE TYPE //
	// Kotlin will try to make sure you don't inadvertently invoke methods on null objects //
	val alice : String? = null
	val george = "George"

	println("Alice in uppercase ${alice?.uppercase()}") // This value is nullable
	println("George in uppercase ${george.uppercase()}") // This value is non-nullable

	// RESULTS //
	/*Alice in uppercase null
	George in uppercase GEORGE*/
	// RESULTS //

	// NOT NULL ASSERTION OPERATOR !! - If you're absolutely certain that a nullable object DOES
	// DOES NOT contain a null value //
	// Tells Kotlin we are completely certain it is not null
	// Kotlin will then convert that value to a non-null type and invoke the method on that variable
	// Now, by some change that Alice ends up being null, you'll get a null reference exception compile time error
	// If using this operator, you BETTER BE SURE YOU'RE VARIABLE IS NOT NULL.
	// If it somehow is, you will get a runtime exception error


	val aliceTwo: String? = "Alice" // value is of Nullable Type
	val georgeTwo = "George" // value is of non-nullable Type

	println("Alice first character ${aliceTwo!!.get(0)}")
	println("George first character ${georgeTwo.get(0)}")

				// RESULTS //
/*			Alice first character A
			George first character G*/
				// RESULTS //
	// NOT NULL ASSERTION OPERATOR //

	// EXTENSION FUNCTIONS - Functions that extend a class that you do not have access to, that you do not control //
	// It's possible for you to define EXTENSION FUNCTIONS on a NULLABLE RECEIVER
	// In fact, the toString() function available on all objects in Kotlin, it belongs to the
// base class for all objects called Any
	// This toString() Function has been defined on a NULLABLE RECEIVER //

	val aliceThree : String? = "Alice" // have a variable called aliceThree that is a nullable
	// string
	// But it holds a valid object, the String "Alice"
	// then I have a variable called georgeThree that holds the String "George"
	// This is a NON-NULLABLE string
	// IT IS POSSIBLE TO INVOKE THE toString() METHOD ON A NULLABLE TYPE WITHOUT USING SAFE
	// INVOCATION
	val georgeThree = "George"

	// Printing Implicitly calls the .toString() method on the variable's base class
	// The .toString() method belongs to the Any BASE CLASS in Kotlin, which is the equivalent of
	// the OBJECT BASE CLASS
	println(aliceThree.toString()) // Able to invoke .toString method on aliceThree without using
	// the safe invocation
	// I'm simply able to call aliceThree.toString() with no issues
	println(georgeThree.toString())

	// RESULTS //
	/*Alice
	George*/
	// RESULTS //

	// WHEN ALICE IS ACTUALLY NULL //
	// EVEN WHEN NULL, ALICEFOUR.toString() can be invoked with the ?. safe invocation
	// THE REASON WHY .toString() COULD BE INVOKED ON A NULL VARIABLE IS BECAUSE THAT FUNCTION
	// HAS BEEN DEFINED ON A NULLABLE RECEIVER.
	// ESSENTIALLY .toString(), IF THE OBJECT ON WHICH YOU INVOKE IS NULL, WILL SIMPLY RETURN
	// NULL. THAT IS THE STRING NULL, RATHER THAN THE VALUE NULL
	// WHEN YOU CALL aliceFour.toString() AND ALICE IS NULL, IT'S THE STRING NULL THAT IS BEING
	// RETURNED BY .tiString(). BECAUSE OF THE WAY THAT .toString() HAS BEEN DEFINED ON A
	// NULLABLE RECEIVER.
	val aliceFour : String? = null
	val georgeFour = "George"

	println(aliceFour.toString())
	println(georgeFour.toString())

	// RESULTS //
	/*null
	George*/
	// RESULTS //
	// WHEN ALICE IS ACTUALLY NULL //

	// EXTENSION FUNCTIONS //

	// INVOKING A METHOD ON A NON-NULLABLE TYPE //
	// NULL SAFETY CONTINUED //

	// NULL SAFETY - Variable CANNOT hold nulls unless you EXPLICITLY SPECIFY that they CAN //
}
