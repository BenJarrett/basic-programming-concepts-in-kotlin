
// Val keyword creates immutable properties //

// Val keyword types can be known at runtime, but then the values cannot be reassigned //
// Const keyword is used to declare immutable variables who's values are known at compile time - Cannot be local to functions, they have to be global or the property of an object or a companion object. Lastly, they should be primitive data types //

// In this example, there is no difference between the const and val type //
//val val_salary = 100000
//const val const_salary = 100000
//fun main() {
//    println("Salary (value): $val_salary")
//    println("Salary (constant value): $const_salary")
//}
// In this example, there is no difference between the const and val type //

// In this example, there is a difference //
// Let's say we are computing the value of salary using kind of function. You can see the function getSalary that takes no input args and returns and integer. Returns the value 100000. //
// We are using this function to initialize a val type val_salary, but we cannot use this function to initialize the const type val //
// Any variables defined using Const should be initialized with a constant value //
// This constant value needs to be known at compile time and not at run time, so when you invoke a function, the return value of that function is only known at runtime and cannot be used to initialize a const //
val val_salary = getSalary()
const val const_salary = getSalary()
fun main() {
    println("Salary (value): $val_salary")
    println("Salary (constant value): $const_salary")
}

fun getSalary(): Int {
    return 100000
}

// In this example, there is there is a difference //