/*
Unit Returning Function
-> Function ada 2 jenis, pertama tidak mengembalikan nilai, yang kedua mengembalikan nilai
-> Penulisan Unit adalah tidak wajib, namun jika kita menulis tipe data pengembalian sebuah function, maka
   secara otomatis dia adalah Unit
*/

fun main() {
    printHello("Dimas")
    printHello("")
}

fun printHello(name: String?) : Unit {
    if (name == null){
        println("Hello bro")
    } else{
        println("Hello $name")
    }
}
