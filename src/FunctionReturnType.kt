fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if(b == 0) {
        return 0
    } else {
        val result = a / b
        return result
    }
}

fun main() {
    val result = sum(5, 5)
    println(result)

    println(sum(100, 100))

    println(bagi(100, 10))
    println(bagi(100, 0))
}