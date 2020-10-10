/*
Function Infix Notation
-> Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap dua data
-> Hampir semua operasi matematika adalah infix notation
-> Di Kotlin, kita bisa membuat function infix notation juga
-> Untuk menggunakan function infix notation, tidak waajib menggunakan tanda .(titik)

Syarat Function Infix Notation
-> Harus sebagai function member (akan dibahas di OOP) atau function extention
-> Harus memiliki 1 parameter
-> Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
*/

fun main() {
    val result = "Dimas" to "LO"
    println(result)
}

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}
