/*
Return If & When
-> Kadang dalam sebuah function, kita sering menggunakan if expression atau when expression, lalu
   didalam bloknya kita mengembalikan nilai untuk sebuah function
-> Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita ketika ingin mengembalikan nilai dalam if atau when
 */

fun main() {
    fun sayHello(name: String = ""): String {
        return if (name == "") {
            "Hello bro"
        } else {
            "Hello $name"
        }
    }
    //println(sayHello())
    //println(sayHello("Dimas"))

    fun sayHi(nama: String = ""): String {
        return when (nama) {
            "" -> "Hello bro"
            else -> "Hello $nama"
        }
    }
    println(sayHi())
    println(sayHi("Dimas Cahyo"))
}