/*
Higher Order Function
- Adalah function yang menggunakan function sebagai parameter atau mengembalikan function
- Penggunaan Higher Order Function kadang berguna ketika kita ingin membuat function yang general dan ingin mendapatkan input yang flexible berupa lambda,
  yang bisa dideklarasikan oleh si user ketika memanggil function tersebut
 */




fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("Dimas", lambdaUpper))

    println(hello("Dimas", { value: String -> value.toLowerCase() }))

    val result1 = hello("Dimas", { value: String -> value.toUpperCase() })
    // trailing lambda
    val result2 = hello("Dimas") { value: String ->
        value.toUpperCase()
    }
}