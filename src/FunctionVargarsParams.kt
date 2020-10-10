/*
Function Varargs Parameter
-> Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam array
-> Apa bedanya dengan parameter biasa dengan tipe data array
   + Jika parameter tipe array, kita wajib membuat array terlebih dahulu sebelum mengirimnya ke function
   + Jika paramenter menggunkaan varargs, kita bisa langsung mengirimkan data nya, jika lebih dari satu, cukup gunakan tanda koma
*/

fun main() {
//    val values = arrayOf(11, 12, 13, 14, 15)
    val result = hitungTotal("Dimas", 11, 12, 13, 14)

    println(result)
}

fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}