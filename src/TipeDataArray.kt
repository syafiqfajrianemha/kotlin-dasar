fun main() {
    /*
    Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
    Tipe data array di Kotlin direpresentasikan dengan kata kunci Array
    */
    val users: Array<String> = arrayOf("Syafiq", "Fajrian", "Emha")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balance: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    /*
    Operasi Array
    - size : untuk mendapatkan panjang Array
    - get(index) & [index] : Mendapat data di posisi index
    - set(index, value) & [index] = value : Mengubah data di posisi index
    */
    users[2] = "Budi"
    println(users[2])

    /*
    Array Nullable
    Secara standard data di Array di Kotlin tidak boleh null
    Jika kita butuh membuat Array yang datanya boleh null, kita bisa menggunakan ? (tanda tanya)
    */
    val names: Array<String?> = arrayOfNulls(5)
    names[0] = "Syafiq"
    names[1] = null
    names[2] = "Fajrian"
    names[3] = null
    names[4] = "Emha"

    println(names[0])
}