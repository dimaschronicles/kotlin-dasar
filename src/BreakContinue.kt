/*
Break & Continue
-> Break & continue adalah kata kunci yang bisa digunakan dalam semua perulangan di Kotlin
-> Break digunakan untuk menghentikan semua perulangan
-> Continue digunakan untuk menghentikan perulangan yang berjalan, dan langsung menjalankan ke perulangan selanjutnya

*/

fun main() {
    //kodeBreak() // break
    kodeContinue() // continue
}

fun kodeBreak() {
    var i = 0
    while (true) {
        println("Break Me $i")
        i++
        if (i > 100) {
            break
        }
    }
}

fun kodeContinue() {
    for (i in 1..100) {
        if (i % 2 == 0) {
            continue
        }
        println("Angka $i")
    }
}
