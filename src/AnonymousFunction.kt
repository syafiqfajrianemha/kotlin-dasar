/*
Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
Kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa mengembalikan hasil dimanapun
Untuk hal ini, kita bisa menggunakan Anonymous Function
Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda, masih menggunakan kata kunci func
*/
fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello, $nameTransform"
    }

    val upper = fun(value: String): String {
        if(value.isBlank()) {
            return "User"
        } else {
            return value.toUpperCase()
        }
    }
    println(hello("Emha", upper))
    println(hello("", upper))

    println(hello("Syafiq", fun(value: String): String {
        return value.toLowerCase()
    }))
}