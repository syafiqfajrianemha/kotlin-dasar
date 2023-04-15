/*
Kadang salam sebuah function, kita sering menggunakan If expression atau when expression, lalu di dalam blok nya kita mengembalikan nilai untuk sebuah function
Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita ketika ingin mengembalikan nilai dalam if atau when
*/
fun main() {
    fun sayHello(name: String = ""): String {
        // return if
        /*return if(name == "") {
            "Hello Bro!"
        } else {
            "Hello $name!"
        }*/

        // return when
        return when(name) {
            "" -> {
                "Hello Bro!"
            }
            else -> "Hello $name"
        }
    }

    println(sayHello())
    println(sayHello("Syafiq"))
}