/*
Operasi &&
Nilai 1     Operator        Nilai 2       Hasil
===============================================
true        &&              true          true
true        &&              false         false
false       &&              true          false
false       &&              false         false

Operasi ||
Nilai 1     Operator        Nilai 2       Hasil
===============================================
true        ||              true          true
true        ||              false         true
false       ||              true          true
false       ||              false         false

 */

fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiExtra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusExtra = nilaiExtra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
    println(apakahLulus)

}
