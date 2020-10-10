/*
Lamda Expression
-> Function di Kotlin adalah first-class citizens, artinya dianggap seperti tipe data yang lainnya
-> Bisa disimpan divariable, array, bahkan bisa dikirim ke parameter function itu sendiri
-> Lamda expression secara sederhana adalah function yang tidak memiliki nama
-> Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata kunci fun dan mendeklarasikan nama functionnya
-> Dengan lamda expression, kita bisa membuat function tanpa harus mendeskripsikan functionnya

 */

fun main() {
    // membuat lamda
    val contohLamda: (String, String) -> String = { firstname: String, lastname: String ->
        val result = "$firstname $lastname"
        result
    }
    // eksekusi
    val result = contohLamda("Dimas", "Cahyo")
    //println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }
    //println(sayHello("Dimas"))

    val toUpperCase : (String)-> String = ::toUpper
    println(toUpperCase("Dimas Cahyo Nur"))
}

fun toUpper(value: String): String = value.toUpperCase()

