/*
Main Parameters
- Kadang saat menjalankan program, kita butuh input parameter dari luar
- Bisa untuk konfigurasi program, ataupun yang lainnya
- Kotlin mendukung parameter untuk main function
 */

fun main(args: Array<String>) {
    for (value in args) {
        println(value)
    }
}