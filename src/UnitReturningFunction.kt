/*
Function ada 2 jenis, pertama tidak mengembalikan nilai, yang kedua mengembalikan nilai
Function-function yang sebelumnya sudah kita buat adalah function yang tidak mengembalikan nilai
Sebenarnya, function-function yang sudah kita buat sebelumnya, dia mengembalikan tipe data Unit, dimana Unit adalah tanda bahwa function tersebut tidak mengembalikan apa-apa
Penulisan Unit adalah tidak wajib, namun jika kita menulis tipe data pengembalian sebuah function, maka secara otomatis dia adalah Unit
*/
fun printHello(): Unit {
    println("Hello")
}

fun main() {
    printHello()
}