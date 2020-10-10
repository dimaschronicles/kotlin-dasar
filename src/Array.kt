fun main() {
//    val members: Array<String> = arrayOf("Dimas", "Cahyo", "Nur", "Aditya")
//    val values: Array<Byte> = arrayOf(100, 90, 80)
//    val balances: Array<Int> = arrayOf(1, 2, 3, 4, 5)

//    val names: Array<String> = arrayOf("Dimas", "Anggie", "Farhan")
    // names.set(1, "Delta")
//    names[1] = "Delta"
//
//    println(names.size)
//    println(names.get(1))
//    println(names[2])
//
//    val nilai: Array<Int> = arrayOf(100, 90, 80)
//    println(nilai[0])
//    println(nilai[1])
//    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Dimas"
    members[1] = "Anggie"
    members[2] = "Farhan"
    members[3] = "Delta"
    members[4] = "Refri"
    members[5] = "Faiq"
    println(members[3])

}