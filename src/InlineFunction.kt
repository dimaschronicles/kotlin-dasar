/*
Inline Function
- Menggunakan Higher-Order Function adalah salah satu fitur yang sangat berguna
- Namun penggunaan Higher Order Function akan berdampak terhadap performa saat aplikasi berjalan,
  karena harus membuat object lambda berulang-ulang. Jika penggunaannya tidak terlalu banyak mungkin
  tidak akan terasa, tapi jika benyak sekali, maka akan terasa impactnya
- Inline Functions adalah kemampuan di Kotlin yang mengubah Higher Order Function menjadi Inline Function
- Dimana dengan Inline Function, code didalam Higher Order Function akan diduplicate agar pada saat runtime,
  aplikasi tidak perlu membuat object lambda berulang-ulang

Noinline
- Saat menandai bahwa function adalah inline, maka secara otomatis semua parameter akan menjadi inline
- Jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter, kita bisa menandai parameter
  tersebut dengan kata kunci noinline

 */

// inline
//inline fun hello(name: () -> String): String {
//    return "Hello ${name()}"
//}
//fun main() {
//    println(hello { "Dimas" })
//    println(hello { "Cahyo" })
//}


// noinline
inline fun hello(
    firstname: () -> String,
    lastname: () -> String
): String {
    return "Hello ${firstname()} ${lastname()}"
}

fun main() {
    for (i in 1..100) {
        println(hello({ "Dimas" }, { "Cahyo" }))
    }
}

