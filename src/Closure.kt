/*
Closure
- CLosure adalah kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan data data disekitarnya dalam scope yang sama
- Harap gunakan fitur closure ini dengan bijak saat kita membuat aplikasi
 */

fun main() {
    var counter: Int = 0

    val lambdaIncrement = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}