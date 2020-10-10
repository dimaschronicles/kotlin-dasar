/*
Anonymous Function
- Lambda akan menganggap baris terakhir diblok lambda sebagai hasil kembalian
- Kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa mengembalikan hasil dimanapun
- Untuk hal ini, kita bisa menggunakan Anonymous Function
- Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda, masih menggunakan kata kunci fun
 */

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Dimas", upper))
    println(hello("", upper))

    // as parameter
    println(hello("Dimas", fun(value: String): String {
        return value.toLowerCase()
    }))
}