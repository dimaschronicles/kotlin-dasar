/*
Recursive Function
-> Adalah salah satu kemampuan bagus di Kotlin, namun sayangnya ada keterbatasan dalam penggunaan recursive
-> Jika recursive function yang kita buat, saat dijalankan memanggil function dirinya sendiri terlalu dalam, maka bisa
   dimungkinkan akan terjadi error stack overflow

Tail Recursive Function
-> Adalah teknik mengubah recursive function yang kita buat menjadi looping biasa ketika dijalankan
-> Tidak semua recursive function bisa secara otomatis dibuat menjadi tail recursive function, ada syarat-syaratnya

Syarat Tail Recursive Function
-> Tambahkan tailrec di functionnya
-> Saat memanggil function dirinya sendiri, hanya boleh memanggil function dirinya sendiri, tanpa embel-embel operasi dengan data lain

    factorial(5, 1)
    factorial(4, 5)
    factorial(3, 20)
    factorial(4, 60)
    factorial(5, 120)

 */

fun main() {
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }
    //display(10000)

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialRecursive(value - 1, total * value)
        }
    }
    println(factorialRecursive(10))

}
