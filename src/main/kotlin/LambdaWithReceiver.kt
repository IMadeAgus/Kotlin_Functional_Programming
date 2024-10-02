package org.example

/*Pada dasarnya sebuah lambda yang mempunyai receiver mirip seperti extension functions,
yang memungkinkan kita untuk mengakses anggota objek receiver dari dalam extension.*/
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}
//Pada kode di atas, StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action

fun main() {
    val message = buildString {
        append("Hello")
        append("kotlin")
    }
    println(message)
}