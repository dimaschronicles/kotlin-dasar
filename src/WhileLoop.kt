/*
While Loops
-> While adalah satu perulangan yang sangat flexible, dimana kode while akan melakukan pengecekan kondisi,
   jika kondisi bernilai true, maka dia akan menajalankan blok while, dan terus diulangi sampai kondisi while bernilai false

*/

fun main() {
    var i = 0
    while (i < 10) {
        println("Index ke $i")
        i++
    }
    println("Selesai perulangan")
}