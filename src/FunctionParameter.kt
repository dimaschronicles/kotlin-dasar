/*
Function Parameter
-> Saat membuat function, kadang-kadang kita membutuhkan data dari luar, atau kita bisa sebut parameter
-> Di Kotlin, kita bisa menambahkan parameter di function, bisa lebih dari satu
-> Parameter tidaklah wajib, jadi kita bisa membuat function tanpa parameter seperti sebelumnya yang sudah kita buat
-> Namun jika kita menambahkan parameter di function, maka ketika memanggil function tersebut, kita wajib memasukan data parameternya

*/

fun sayHello(firstname: String, lastname: String?) {
    if (lastname == null) {
        println("Hello $firstname")
    } else {
        println("Hello $firstname $lastname")
    }
}

fun main() {
    sayHello("Dimas", "Cahyo")
    sayHello("Ayash", null)
}
