fun main() {
    /*
    Dalam Kotlin, if adalah salah satu kata kunci yang digunakan untuk percabangan
    Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
    Hampir di semua bahasa pemrograman mendukung if expression

    Blok if akan dieksekusi ketika kondisi if bernilai true
    Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
    Hal ini bisa dilakukan menggunakan else expression

    Kada dalam If, kita butuh membuat beberapa kondisi
    Kasus seperti ini, di Kotlin kita bisa menggunakan Else If expression
    */
    val examValue = 70

    if (examValue > 80) {
        println("Good Job!")
    } else if(examValue > 60) {
        println("Not Bad")
    } else {
        println("Try again next year")
    }
}