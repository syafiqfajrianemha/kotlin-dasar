/*
Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap dua data
Hampir semua operasi matematika adalah infix notation
Di kotlin, kita bisa membuat function infix notation juga
Untuk menggunakan function infix notation, tidak wajib menggunakan tanda . (titik)

Syarat Function Infix Notation
- Harus sebagai function member (akan dibahas di OOP) atau function extension
- Harus memiliki 1 parameter
- Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
*/
infix fun String.to(type: String): String {
    if(type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    // val result = "Syafiq Emha".to("UP")
    val result = "Syafiq Emha" to "LOW"
    println(result)
}