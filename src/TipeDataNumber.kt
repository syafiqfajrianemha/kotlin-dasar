fun main() {
    /*
    Tipe data number terbagi menjadi dua yaitu
    - Integer adalah bilangan bulat
    - Floating Point adalah bilangan pecahan
    */

    /*
    Integer Number
    - Byte : 8bits (min value -128 sampai max value 127)
    - Short : 16bits (min value -32768 sampai max value 32767)
    - Int : 32bits (min value -2,147,483,648 sampai max value 2,147,483,647)
    - Long : 64bits (min value -9,223,372,036,854,775,808 sampai max value 9,223,372,036,854,775,807)
    */
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L
    //kita perlu menambahkan huruf L diakhir untuk menandakan bahwa itu bilangan Long
    //karena jika kita tidak menambahkan, akan terdeteksi menjadi float karena 100jt masih dibawah max value float

    /*
    Floating Point Number
    - Float : 32bits
    - Double : 64bits
    */
    var value: Float = 98.98F
    var radius: Double = 2342342343.54535
    //note: type float jarang digunakan karena jika kita mendefinisikan type float harus menambahkan huruf F diakhir value

    // Literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b01010101
    println(binaryLiteral)

    // Underscore: untuk memudahkan kita membaca value yang panjang
    var price: Long = 100_000_000
    println(price)

    /*
    Conversion
    - toByte()  - toShort()
    - toInt()   - toLong()
    - toFloat() - toDouble()
    */
    var number: Int = 100
    var numberFloat = number.toFloat()
    println(numberFloat)
}