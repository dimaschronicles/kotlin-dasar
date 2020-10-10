fun main() {

    var address: String = """
        |Pliken RT06/RW06,
        |Kecamatan Kembaran,
        |Kabupaten Banyumas
    """.trimMargin()

    var address2: String = """
        >Pliken RT06/RW06,
        >Kecamatan Kembaran,
        >Kabupaten Banyumas
    """.trimMargin(">")

    println(address2)

    var firstName: String = "Dimas"
    var lastName: String = "Aditya"
    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName, panjang karakter = ${fullName.length}"
    println(desc)
}