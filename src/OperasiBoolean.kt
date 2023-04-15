fun main() {
    /*
    Operator logika adalah operator untuk dua buah data boolean
    Hasil dari operator logika adalah boolean lagi
    - && (dan)
    - || (atau)
    - ! (kebalikan)
    */
    val finalExam = 80
    val attendent = 75

    val passFinalExam = finalExam > 75
    val passAttendent = attendent > 80

    val pass = passFinalExam && passAttendent
    println(pass)
}