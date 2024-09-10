fun main() {
    var argument: IntArray = intArrayOf(1,2,3,4,5)
    println(checkArg(argument))

}

fun<T> checkArg(argument: T): String {
    var result = ""
    when(argument){
        is String -> result = (argument.length + 1).toString()
        is Int -> result = (argument.toInt() + 1).toString()
        is IntArray -> result = argument.sum().toString()
        else -> result ="Не знаю что это"

    }
    return result
}