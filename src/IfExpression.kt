/*
If Expression
-> Dalam Kotlin, if adalah salah satu kata kunci yang digunakan untuk percabangan
-> Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
-> Hampir di semua bahasa pemrograman mendukung if expression

Else Expression
-> Blok if akan dieksekusi ketika kondisi if bernilai true
-> Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
-> Hal ini bisa dilakukan menggunakan else expression

Else If Expression
-> Kadang dalam if, kita butuh membuat bebrapa kondisi
-> Kasus seperti ini, di Kotlin kita bisa menggunakan Else If expression

 */

fun main() {
    val nilai = 90

    if (nilai >= 80) {
        println("A")
    } else if (nilai >= 70) {
        println("B")
    } else if (nilai >= 60) {
        println("C")
    } else if (nilai >= 50) {
        println("D")
    } else {
        println("E")
    }
}