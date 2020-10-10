fun main() {
    //var result1: Int = 10 / 2
    //println(result1)

    //var result2: Int = 10 + 10 / 2
    //println(result2)

    val result = 10.0 + 2.1
    println(result)

    val result2 = 20 * 2 / 2
    println(result2)


    // augmented assignments
    var total: Int = 0

    val barang1 = 100
    total += barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)

    // unary
    total++
    total--
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)
}