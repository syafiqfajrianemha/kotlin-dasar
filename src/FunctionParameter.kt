/*
Saat membuat function, kadang-kadang kita membutuhkan data dari luar, atau kita sebut parameter.
Di Kotlin, kita bisa menambahkan parameter di function, bisa lebih dari satu
Parameter tidaklah wajib, jadi kita bisa membuat function tanpa parameter seperti sebelumnya yang sudah kita buat
Namun jika kita menambahkan parameter di function, maka ketika memanggil function tersebut, kita wajib memasukkan data ke parameternya
*/
fun sayHello(firstName: String, lastName: String?) {
    if(lastName == null) {
        println("Hello, $firstName")
    } else {
        println("Hello, $firstName $lastName")
    }
}

fun main() {
    sayHello("Syafiq", "Emha")
    sayHello("Budi", null)
}