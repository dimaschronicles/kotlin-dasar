/*
Function Return Type
-> Untuk memberitahu bahwa function mengembalikan data, kita harus menuliskan tipe data kembalian dari function tersebut
-> Jika function tersebut kita deklarasikan dengan tipe data pengembalian, maka wajib di dalam function nya kita harus mengembalikan data
-> Untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return, diikuti dengan datanya
*/

fun main() {
    println(penjumlahan(12, 12))

    val hasil = penjumlahan(100, 1212)
    println(hasil)

    pembagian(100,5)

    val hasil2 = pembagian(122,6)
    println(hasil2)
}

fun pembagian(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    } else {
        val result = a / b
        return result
    }
}

fun penjumlahan(a: Int, b: Int): Int {
    val total = a + b
    return total
}
