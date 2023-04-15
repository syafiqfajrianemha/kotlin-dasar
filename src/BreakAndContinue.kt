fun main() {
    /*
    Break & continue adalah kata kunci yang bisa digunakan dalam semua perulangan di Kotlin
    Break digunakan untuk menghentikan seluruh perulangan
    Continue adalah digunakan untuk menghentikan perulangan yang berjalan, dan langsung melanjutkan ke perulangan selanjutnya
    */
    var i = 1
    while(true) {
        println("Perulangan ke-$i")
        i++

        if(i > 1_000) {
            break
        }
    }

    for(i in 1..100) {
        if(i % 2 == 0) {
            continue
        }
        println("Angka $i")
    }

    var index = 1
    while(index <= 10) {
        println(index)
        i++
    }
}