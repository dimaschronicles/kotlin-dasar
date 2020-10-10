/*
For Loops
-> Digunakan untuk melakukan perulangan iterasi dari data iterator (Array, Range, dll)

 */

fun main() {
    // for array
    val names = arrayOf("Dimas", "Cahyo", "Nur", "Aditya")

    var total = 0
    for (name in names) {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    println("")

    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray) {
        println("Index ke $i = ${names.get(i)}")
    }

    println("")

    // for range
    for (i in 1..100 step 5) {
        println(i)
    }

    println("")

    for (value in 1000 downTo 0 step 100) {
        println(value)
    }
}