import java.lang.reflect.Array

/*
When Expression
-> Selain if expression, untuk melakukan percabangan di Kotlin, kita juga bisa menggunakan When Expression
-> When expression sangat sederhana dibandingkan if
-> Biasanya expression digunakan untuk melakukan pengecekan ke kondisi dalam satu variable

 */

fun main() {
    val nilai = 'D'

    when (nilai) {
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        'E' -> {
            println("Try Again")
        }
        else -> {
            println("Invalid")
        }
    }

    // multiple option
    when (nilai) {
        'A', 'B', 'C' -> println("Lulus")
        else -> {
            println("Tidal lulus")
        }
    }

    // In
//    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
//    when (nilai) {
//        in nilaiLulus -> println("You Passed")
//        !in nilaiLulus -> println("Failed")
//    }

    // Is
    val name = "Dimas"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Not String")
    }

    // pengganti if else
    val nilaiUjian = 70
    when {
        nilaiUjian > 80 -> println("Amazing")
        nilaiUjian > 70 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Try Again")
    }
}