fun main(args: Array<String>) {
   //assign greeting function to a variable
    val greetingFunction : () -> String ={
        val currentYear = 2018
        "Welcome to SimVillage,Mayor! (copyright $currentYear"
    }
    println(greetingFunction())
}