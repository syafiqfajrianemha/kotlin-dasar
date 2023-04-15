fun main() {
    /*
    Tipe data string adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks.
    Di kotlin, tipe data string direpresentasikan dengan kata kunci String.
    Untuk membuat string di kotlin, kita bisa menggunakan
    - “ (tanda petik 2) untuk teks satu baris
    - “”” (tanda petik 2 sebanyak 3 kali) untuk teks lebih dari satu baris
    */
    var firstName: String = "Syafiq Fajrian"
    var lastName: String = "Emha"
    var address: String = """
        Lorem Ipsum,
        Central Java,
        Indonesia,
    """.trimIndent()

    println(firstName)
    println(address)

    /*
    Menggabungkan String
    Kadang kita butuh melakukan menggabungkan data String
    Untuk melakukan penggabungan data String, kita bisa menggunakan operator +
    */
    var fullName: String = firstName + " " + lastName
    //tidak disarankan. Gunakan String Template

    println(fullName)

    /*
    String Template
    String template adalah kemampuan String di kotlin yang mendukung ekspresi template
    Dengan string template, secara otomatis kita bisa mengakses data dari luar teks string.
    - $ adalah tanda yang digunakan untuk template ekspresi sederhana, seperti mengakses variable lain
    - ${ isi ekspresi } adalah tanda yang digunakan untuk template ekspresi yang kompleks
    */
    var stringTemplate: String = "string template: $firstName $lastName"
    var desc: String = "length char $firstName adalah ${firstName.length}char"

    println(stringTemplate)
    println(desc)
}