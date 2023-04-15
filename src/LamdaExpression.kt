/*
Function di kotlin adalah first-class citizens, artinya dianggap seperti tipe data yang lainnya.
Bisa disimpan di variable, array, bahkan bisa dikirim ke parameter function itu sendiri
Lambda expression secara sederhana adalah function yang tidak memiliki nama
Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata kunci fun dan mendeklarasikan nama function nya
Dengan lambda expression, kita bisa membuat function tanpa harus mendeskripsikan function nya
*/

fun kapital(value: String): String = value.toUpperCase()

fun main() {
    // Lambda Expression di Variable
    val fullName: (String, String) -> String = {firstName: String, lastName: String ->
        val name = "$firstName $lastName"
        name
    }
    println(fullName("Syafiq Fajrian", "Emha"))

    // it (hanya bisa jalan ketika parameternya hanya satu)
    val nama: (String) -> String = {
        it.toLowerCase()
    }
    println(nama("EMHA"))

    // Method References
    val ubahKeKapital: (String) -> String = ::kapital
    println(ubahKeKapital("fajrian"))
}