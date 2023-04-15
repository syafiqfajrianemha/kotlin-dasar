fun main() {
    /*
    Kadang kita ingin membuat array yang berisi data yang angka berurutan
    Membuat array dengan jumlah data sedikit mungkin mudah, tapi bagaimana jika data angka yang berurutannya sangat banyak, misal dari 1 sampai 1000
    Kotlin mendukung tipe data range, yang digunakan untuk kebutuhan seperti ini
    Cara membuat range di Kotlin sangat mudah cukup menggunakan tanda .. (titik dua kali) :
    - 0..10 : Range dari 0 sampai 10
    - 1..100 : Range dari 1 sampai 100
    */
    val range = 1..100

    /*
    Operasi Range
    - count() : mendapatkan total data di range
    - contains(value) : mengecek apakah terdapat value tersebut
    - first : mendapatkan nilai pertama
    - last : mendapatkan nilai terakhir
    - step : mendapatkan nilai tiap kenaikan
    */
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)

    // Range Terbalik
    val rangeReverse = 1_000 downTo 1
    println(rangeReverse.count())

    // Range Dengan Step
    val range1 = 1..100 step 2
    val range2 = 1000 downTo 1 step 5

    println(range1.step)
    println(range2.step)
}