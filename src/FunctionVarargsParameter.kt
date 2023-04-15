/*
Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs
Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
Apa bedanya dengan parameter biasa dengan tipe data Array?
- Jika parameter tipe Array, kita wajib membuat array terlebih dahulu sebelum mengirimkan ke function
- JIka parameter menggunakan varargs, kita bisa langsung mengirim data nya, jika lebih dari satu, cukup gunakan tanda koma
*/
fun hitungTotal(vararg values:Int): Int {
    var total = 0
    for(value in values) {
        total += value
    }
    return total
}

fun finalValue(name: String, vararg values: Int) {
    var total = 0.0
    for(value in values) {
        total += value
    }
    total /= values.size
    println("Final Value $name = $total")
}

fun main() {
    // val angka = arrayOf(10,10,10,10)
    val hasil = hitungTotal(10,10,10,10,10)
    println(hasil)

    finalValue("Rata-rata", 10,10,10,10,10,10,10)
}