fun main() {
    // hati-hati jika kita ingin menjumlahkan dengan hasil yang koma-koma atau bilangan pecahan
    // gunakan type data number Double

    val result1 = 10 / 3
    println(result1)

    val result2 = 10.0 / 3.0
    println(result2)

    /*
    Urutan operasi matematika
    1. Tanda kurung
    2. Eksponen
    3. Perkalian
    4. Pembagian
    5. Penjumlahan
    6. Pengurangan)
    */
    val result3 = 10 + 10 / 2
    println(result3)

    // Augmented Assignments (+=, -=, *=, /=, %=)
    var total: Int = 0

    val barang1 = 100
    total += barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)

    // Unary Operator (++ (a = a + 1), -- (a = a - 1), - (negative), + (positive), ! (boolean kebalikan)
    total++ // total = total + 1
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)
}