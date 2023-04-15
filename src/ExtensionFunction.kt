/*
Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
Extension function adalah salah satu fitur yang sangat powerfull, namun harap bijak menggunakannya, karena jika terlalu banyak digunakan, akan membuat program sulit dimengerti, karena terlihat seperti magic
Untuk membuat extension function, kita cukup menambahkan tipe data pada nama function nya, lalu diikuti dengan tanda . (titik)
Untuk mengakses data nya di extension function, kita bisa menggunakan kata kunci this
*/
fun String.hello(): String = "Hello, $this"

fun String.printHello(): Unit = println("Hello, $this!")

fun main() {
    val name = "Syafiq"
    println(name.hello())

    name.printHello()

    "Emha".printHello()
}