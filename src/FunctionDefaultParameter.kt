/*
Function Default Argument / Parameter
-> Di Kotlin, function parameter wajib diisi ketika memanggil function
-> Namun kita juga bisa memasukan nilai default pada parameter, dengan demikian saat memanggil function tersebut,
   kita tidak wajib memasukan nilai pada parameternya
-> Default parameter ini cocok pada jenis parameter yang sekiranya memang tidak wajib untuk diisi
*/

fun main() {
    hello("Dimas")
    hello("Anggie", "Febriansyah")
}

fun hello(firstname: String, lastname: String = "") {
    if (lastname == null) {
        println("Hello $firstname")
    } else {
        println("Hello $firstname $lastname")
    }
}
