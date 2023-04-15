fun hello(name: String, transformer: (String) -> String): String {
    val nameTransform = transformer(name)
    return "Hello, $nameTransform"
}

fun main() {
    val upperTransformer = {value: String -> value.toUpperCase()}
    println(hello("Emha", upperTransformer))

    println(hello("Syafiq", {value: String -> value.toLowerCase()}))

    // Trailing Lambda (biasa digunakan jika parameter lamdanya paling akhir)
    val result = hello("Fajrian") {value: String ->
        value.toLowerCase()
    }
    println(result)
}