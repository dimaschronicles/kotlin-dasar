fun main() {
    val result = double(2)
    println(result)

    val name = hi("Dimas")
    println(name)
}

fun double(a: Int): Int = a * 2

fun hi(name: String): Unit = println("Hi $name")