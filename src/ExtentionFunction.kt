/*
Extention Function
-> Extention function adalah kemampuan menambahkan function pada tipe data yang sudah ada
-> Extention function adalah salah satu fitur yang sangat powerfull, namun harap bijak menggunakannya, karena jika
   terlalu banyak digunakan, akan membuat program lebih sulit dimengerti, karena terlihat seperti magic
-> Untuk membuat extention function, kita cukup menambahkan tipe data pada nama functionnya lalu diikuti dengan tanda titik
-> Untuk mengakses datanya di extention function, kita bisa menggunakan kata kunci this
*/

fun main() {
    val name: String = "Dimas"

    println(name.hello())

    name.printHellow()
    "Cahyo".printHellow()
}

fun String.hello(): String = "Hello $this"

fun String.printHellow(): Unit = println("Hello $this")
