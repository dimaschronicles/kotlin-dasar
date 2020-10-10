// variable constant
const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    // 1. mutable -> data bisa diubah
//    var firstName: String = "Dimas"
//    var lastName: String = "Aditya"

    // mengubah variable
//    lastName = "Cahyo"

//    println("$firstName $lastName")

    // 2. immutable -> data tidak bisa diubah
//    val firstName: String = "Dimas"
//    val lastName = "Aditya"

    // mengubah variable
//    lastName = "Cahyo"

//    val nama = "Dimas"
//    val umur = 20
//
//    println(nama)
//    println(umur)

    // 3. nullable
//    var nama: String? = "Dimas"
//    nama = null

    // error karena nama tidak bisa null
//    println(nama.length)
    // cara mengakses yang benar
//    println(nama?.length)

//    var nama: String? = null
//    nama = "Dimas"
//    println(nama)
//    println(nama?.length)

    // 4. Constant
    println("$APPLICATION : $VERSION")
}