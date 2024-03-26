fun main() {

	// ITERATING OVER DATA - FOR, WHILE, DO-WHILE LOOPS //
	// FOR LOOP //

	// FOR LOOP ITERATING OVER AN OBJECT - Only if that object provides an iterator //
	// This object must provide a these conditions to be able to loop through it //
	// MUST RETURN - an object of type iterator from the iterator() function
	// MUST - implements a next() function that allows you to move to the next element in
// the collection
	// MUST  impliments a hasNext() function that returns a boolean which tells you whether there
// is indeed a next element in the collection or not
// LISTS, SETS, AND MAPS ALL IMPLEMENT ITERATORS

	val countriesList = listOf("India","Japan","Indonesia","Vietnam","China") // Immutable List

	for (country in countriesList) {
		println(country)
	}

	// RESULT //
/*	India
	Japan
	Indonesia
	Vietnam
	China*/
	// RESULT //
	// FOR LOOP ITERATING OVER AN OBJECT - Only if that object provides an iterator //

	// LAMBDA FUNCTIONS - can also be used TO ITERATOR OVER THE ELEMENTS IN A COLLECTION //
	// FOR EACH with LAMBDA //

	val countriesListTwo = listOf("India","Japan","Indonesia","Vietnam","China")

	countriesListTwo.forEach{ country -> println(country.uppercase())} // {} mean TRAILING LAMBDA
	// the country variable is the INPUT PARAMETER to the lambda function
	// the -> separates the input parameters from the body of the function and the body of the
// Lambda that simply contains the statement
	// REMINDER - Lambdas are just syntactic sugar over actual functional implementations, just a
// shorter way to write a function for readability

	// RESULTS //
/*	INDIA
	JAPAN
	INDONESIA
	VIETNAM
	CHINA*/
	// RESULTS //

	// MAPS ITERATION - can be mutable or immutable //
	// person is a variable that contains a pair object

	val peopleMap = mutableMapOf(
		"Greg" to 36,"Bob" to 23,"Jack" to 38,"Alice" to 32,"Julie" to 36)

	for (person in peopleMap){
		println("Key: ${person.key} Value: ${person.value}")
	}
	// RESULT //
/*	Key: Greg Value: 36
	Key: Bob Value: 23
	Key: Jack Value: 38
	Key: Alice Value: 32
	Key: Julie Value: 36*/
	// RESULT //
	// MAPS ITERATION //

	// MAP - PERFORMING ACTIONS ON A MAP WITH A LAMBDA //
	// DESTRUCTURING DECLARATION - Restructure an object into a number of variables that make
	// up that object //
	// Using a DESTRUCTURING DECLARATION to create two variables, name and age, from the original
	// pair object present within the map
	// The KEY of the PAIR will be assigned to the NAME variable
	// The VALUE will be assigned to the AGE variable
	val peopleMapTwo = mutableMapOf(
		"Greg" to 36,"Bob" to 23,"Jack" to 38,"Alice" to 32,"Julie" to 36)

	peopleMapTwo.forEach{ (name, age) -> println("Name: $name, Age: $age") } // input parameters to
// the lamba are name and aage
	// how are we accessing two values from a pair?
	// USES THE DESTRUCTURING DECLARATIONS TO ACCESS THE KEY AND VALUES DIRECTLY
	// DESTRUCTURING DECLARATION //

	// A different way to syntactically write the function above //
	fun printPerson(name: String, age: Int) {
		println("Name: $name, Age: $age")
	}

	for ((name, age) in peopleMapTwo) {
		printPerson(name, age)
	}
	// A different way to syntactically write the function above //

	// RESULT //
/*	Name: Greg, Age: 36
	Name: Bob, Age: 23
	Name: Jack, Age: 38
	Name: Alice, Age: 32
	Name: Julie, Age: 36*/
	// RESULT //

	// MAP - PERFORMING ACTIONS ON A MAP WITH A LAMBDA //

	// FOR EACH with LAMBDA //
	// LAMBDA FUNCTIONS - can also be used TO ITERATOR OVER THE ELEMENTS IN A COLLECTION //

	// ITERATING OVER A RANGE OF NUMERIC VALUES WITH A FOR LOOP //
	// .. OPERATOR - RANGES	are specified using the .. OPERATOR //
	// This is starting at one and ending at 6, including 6 //

	for (i in 1 .. 6 ) {
		println(i)
	}
	// RESULT //
/*	1
	2
	3
	4
	5
	6*/
	// RESULT //

	// RANGE TO BE EXCLUSIVE, DOES NOT INCLUDE THE FINAL NUMBER THAT YOU HAVE SPECIFIED //
	for (i in 1 until 6) {
		println(i)
	}
	// RESULT //
/*	1
	2
	3
	4
	5*/
	// RESULT //
	// RANGE TO BE EXCLUSIVE, DOES NOT INCLUDE THE FINAL NUMBER THAT YOU HAVE SPECIFIED //

	// REVERSE ORDER //
	for (i in 6 downTo 1) {
		println(i)
	}

	// RESULT //
/*	6
	5
	4
	3
	2
	1*/
	// RESULT //
	// REVERSE ORDER //

	// ITERATING OVER NUMBERS IN FORM LOOP WITH INCREMENTS BEING IN STEPS OF TWO OR THREE, OR
	// SOMETHING OTHER THAN 1 - STEP KEYWORD //

	for (i in 12 .. 16 step 2) {
		println(i)
	}

	// RESULT //
/*	12
	14
	16*/
	// RESULT //

	// ITERATING OVER NUMBERS IN FORM LOOP WITH INCREMENTS BEING IN STEPS OF TWO OR THREE, OR
	// SOMETHING OTHER THAN 1 - STEP KEYWORD //

	// .. OPERATOR //
	// ITERATING OVER A RANGE OF NUMERIC VALUES WITH A FOR LOOP //
	// FOR LOOP //

	// WHILE AND DO WHILE LOOPS //
	// WHILE LOOP //
	// sets variable someInt to 0
	var someInt = 0

	// As long as the value of someInt does not equal -1. we will be iterating through the loop
	while (someInt != -1) {
		print("Enter a number: ") // Tells console to print this
		someInt = readln().toInt() // Setting the number written in console to the value of someInt

		println("You entered: $someInt") // prints "You entered" whatever value you entered
	}

	println("Goodbye!") // If negative, print this message and break out of the loop
	// It will keeps iterating through the while block until a -1 is written //

	// WHILE LOOP //
	// DO WHILE LOOP //
	// As long as someIntTwo value is an even number, we will execute the cod ein the do while block
	do {
		print("Enter a number: ")
		val someIntTwo = readln().toInt()

		println("You entered: $someIntTwo")
	} while (someIntTwo % 2 == 0)

	println("Goodbye!") // Prints "Goodbye" - Exits block of code when an odd number is entered
	// DO WHILE LOOP //
	// WHILE AND DO WHILE LOOPS //

	// BREAK AND CONTINUE STATEMENTS //
	// BREAK STATEMENT //
	// Runs an infinite loop with While (true)
	// Reads in a number that is entered
	// Within that While loop, we have an if check. If someIntThree is negative, it's less than
	// 0, then I break out of the loop.
	// Otherwise I print out that number entered
	while (true) {
		print("Enter a number: ")
		val someIntThree = readln().toInt()

		if (someIntThree < 0) {
			print("Goodbye!")
			break;
		}

		println("You entered: $someIntThree")
	}

	// BREAK STATEMENT //

	// CONTINUE STATEMENT - ALLOWS YOU TO SKIP OVER THE REST OF THE LOOP BLOCK //
	// A for loop where i takes on values from 1 through 10
	// Within the for block, I have an if check
	// The if check checks whether i is an even number (i % 2 == 0)
	// If this condition is satisfied, we'll encounter the continue statement and we'll skip over
	// the rest of the loop code
	// So basically, this will print out all the odd numbers of the range.
	// Since the range stops when it looks at 10, there are no more odd numbers for it to print
	// It will then break out and say goodbye
	// Essentially, skipping over the printing of the even numbers with that specified range
	for (i in 1 .. 10) {
		if (i % 2 == 0) {
			continue
		}
		println("Odd Number: $i")
	}
	println("Goodbye!")

	// RESULT //
/*	Odd Number: 1
	Odd Number: 3
	Odd Number: 5
	Odd Number: 7
	Odd Number: 9
	Goodbye!*/
	// RESULT //


	// CONTINUE STATEMENT - ALLOWS YOU TO SKIP OVER THE REST OF THE LOOP BLOCK //
	// BREAK AND CONTINUE STATEMENTS //
	// ITERATING OVER DATA - FOR, WHILE, DO-WHILE LOOPS //
}