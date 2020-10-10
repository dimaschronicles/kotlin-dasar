fun main() {
    // 1. integer number
//    var age: Byte = 30
//    var height: Int = 170
//    var distance: Short = 2000
//    var balance: Long = 1000000000L
//
//    println(age)
//    println(height)
//    println(distance)
//    println(balance)

    // 2. floating point number
//    var sample: Double = 19.29
//    var sample1: Double = 21.50
//
//    println(sample)
//    println(sample1)

    // 3. literals
//    var decimal: Int = 100
//    var hexa: Int = 0xFF
//    var binary: Int = 0b0101010
//
//    println(decimal)
//    println(hexa)
//    println(binary)

    // 4. underscore
//    var price: Long = 9_000_000_000L
//    println(price)

    // 5. conversion
    var number: Int = 200

    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println(byte)
    println(short)
    println(int)
    println(long)
    println(float)
    println(double)

    var price: Long = 9_000_000_000L
    var binary: Int = 0b010101010

    var priceInt: Int = price.toInt()
    var doubleBinary: Double = binary.toDouble()

    println(priceInt)
    println(doubleBinary)
}