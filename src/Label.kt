/*
Label
- Label adalah penanda
- Semua expression di Kotlin bisa ditandai dengan label
- Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @

Break, Continue, dan Return
- Salah satu kegunaan label adalah bisa diintegrasikan dengan break, continue, dan return
- Biasanya break, continue, dan return hanya bisa menghentikan proses di blok kode tempat mereka berada,
  namun dengan menggunakan label, kita bisa menentukan ke label mana kode akan berhenti

 */

//fun main() {
//    loopI@ for (i in 1..10) {
//        loopJ@ for (j in 1..10) {
//            println("$i * $j = ${i * j}")
//        }
//    }
//}

// break to label
//fun main() {
//    loopI@ for (i in 1..10) {
//        loopJ@ for (j in 1..10) {
//            if (i > 5) {
//                break@loopI
//            }
//            println("$i * $j = ${i * j}")
//        }
//    }
//}

// continue to label
//fun main() {
//    loopI@ for (i in 1..10) {
//        loopJ@ for (j in 1..10) {
//            if (j == 5) {
//                continue@loopI
//            }
//            println("$i * $j = ${i * j}")
//        }
//    }
//}

// return to label
fun main() {
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("") test@{
        if (it == "") {
            return@test
        } else {
            println("Dimas")
        }
    }
}