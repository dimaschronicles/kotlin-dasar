/*
* Tipe Data Range
* -> Kadang kita ingin membuat array yang berisi data yang mungkin angka berurutan
* -> Membuat array dengan jumlah data sedikit mungkin mudah, tapi bagaimana jika data angka yang urutannya sangat banyak, misal 1 sampai 1000
* -> Kotlin mendukung tipe data range, yang digunakan untuk kebutuhan seperti ini
*
* Operasi Range
* count() ~> mendapatkan total data di range
* containts ~> mengecek apakah terdapat value tersebut
* first ~> mendapatkan nilai pertama
* last ~> mendapatkan nilai terakhir
* step ~> mendapatkan nilai setiap kenaikan
*
*/

fun main() {
    // val range = 1..100
    val range = 100 downTo 1 step 3

    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
}