/*
Function Named Argument
-> Kadang ada function yang parameternya banyak sekali
-> Hal ini sangat menyulitkan saat kita memanggil function tersebut, kita harus benar-benar
   tahu urutan parameter di function tersebut
-> Untungnya Kotlin memiliki fitur yang namanya Named Argument
-> Named Argument adalah fitur dimana kita bisa menyebutkan nama parameter saat memanggil
   function, dengan demikian kita tidak wajib tahu posisi tiap parameter
*/

fun main() {
    fullname("Dimas", "Cahyo")
    fullname(
        firstName = "Dimas",
        midleName = "Cahyo",
        lastName = "Nur Aditya"
    )
}

fun fullname(
    firstName: String,
    midleName: String = "",
    lastName: String = ""
) {
    println("Hello $firstName $midleName $lastName")
}
