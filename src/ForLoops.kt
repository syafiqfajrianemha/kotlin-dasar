fun main() {
    /*
    Dalam bahasa pemrograman, biasanya ada fitur yang bernama perulangan
    Salah satu fitur perulangan di Kotlin adalah for
    For digunakan untuk melakukan perulangan iterasi dari data iterator (Array, Range, dan lain-lain)
    */
    val names = arrayOf("Syafiq", "Fajrian", "Emha", "Budi", "Joko")

    var total = 0
    for(name in names) {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    // for range
    for(i in 0..100) {
        println(i)
    }

    for(value in 100 downTo 0 step 2) {
        println(value)
    }

    val lengthArray = names.size - 1
    for(index in 0..lengthArray) {
        println("Index $index = ${names.get(index)}")
    }
}