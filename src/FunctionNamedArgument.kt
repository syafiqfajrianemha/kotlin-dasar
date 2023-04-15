/*
Kadang ada function yang parameternya banyak sekali
Hal ini sangat menyulitkan saat kita akan memanggil function tersebut, kita harus benar-benar tahu urutan parameter di function tersebut
Untungnya kotlin memiliki fitur yang namanya Named Argument
Named Argument adalah fitur dimana kita bisa menyebutkan nama parameter saat memanggil function, dengan demikian kita tidak wajib tahu posisi tiap parameter
*/
fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello, $firstName $middleName $lastName")
}

fun main() {
    fullName(
        lastName = "Emha",
        firstName = "Syafiq",
        middleName = "Fajrian"
    )
}