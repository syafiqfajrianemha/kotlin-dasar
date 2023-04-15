fun main() {
    /*
    Selain if expression, untuk melakukan percabangan di Kotlin, kita juga bisa menggunakan When Expression
    When expression sangat sederhana dibandingkan if
    Biasanya when expression digunakan untuk melakukan pengecekan ke kondisi dalam satu variable
    */
    val finalExam = 'D'
    when (finalExam) {
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        else -> {
            println("Try Again Next Year")
        }
    }

    // When Expression Multiple Option
    when (finalExam) {
        'A', 'B', 'C' -> {
            println("Selamat anda lulus")
        }
        else -> {
            println("Maaf, anda tidak lulus")
        }
    }

    // When Expression In
    val passValues = arrayOf('A', 'B', 'C')
    when(finalExam) {
        in passValues -> {
            println("Anda Lulus")
        }
        !in passValues -> {
            println("Anda Tidak Lulus")
        }
    }

    // When Expression Is
    val name = "Syafiq";
    when (name) {
        is String -> println("This is String")
        !is String -> println("This is not string")
    }

    // When Tanda Variable
    val nilaiUjian = 90
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Ngulang tahun depan")
    }
}