/*
Variable Constant
Constant adalah Immutable data, yang biasanya diakses untuk keperluan global.
Global artinya bisa diakses dimanapun
Untuk menandai bahwa variable tersebut adalah constant, biasanya menggunakan UPPER_CASE dalam pembuatan nama variable constant nya
*/
const val APP_NAME = "Belajar Kotlin"
const val  APP_VERSION = "0.0.1"

fun main() {
    println("$APP_NAME: version $APP_VERSION")

    /*
    Variable adalah tempat untuk menyimpan data
    Kotlin mendukung 2 jenis variabel; Mutable (bisa diubah) dan Immutable (tidak bisa diubah).
    Untuk membuat variable Mutable, di kotlin bisa menggunakan kata kunci var
    Untuk membuat variable Immutable, di kotlin bisa menggunakan kata kunci val
    *Direkomendasikan menggunakan Immutable dibanding Mutable data
    */
    var firstName = "Syafiq"
    var lastName = "Emha"
    val phi = 3.14

    // mengubah variable
    lastName = "Fajrian Emha"

    println(lastName)
    println(phi)

    /*
    Nullable
    Secara standar, variable di Kotlin harus dideklarasikan / diinisialisasikan nilai nya
    Jika saat membuat variable, tidak diberi nilai, maka akan error
    Kotlin mendukung variable yang boleh null (tidak memiliki data)
    Ini dikarenakan Kotlin bisa mengakses Java, dan kebanyakan di Java, semua variable bisa null
    Untuk membuat variable bisa bernilai null, di Kotlin bisa menggunakan ? (tanda tanya) setelah tipe datanya.
    Penggunaan  fitur ini tidak direkomendasikan untuk dilakukan di kotlin, hanya sebagai jalan akhir jika misal mengakses kode Java
    *tidak direkomendasikan kita membuat variable yang null kecuali kita mengakses kode java
    */
    var name: String? = null
    name = "Syafiq"

    println(name)
    println(name?.length)
}