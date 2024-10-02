package org.example

fun main() {

    //Let
    val message: String? = null
    message?.let { ////Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }

    val messageNull: String? = null
    messageNull?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    //Also
    /*Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek.
    Namun untuk konteks objeknya tersedia sebagai argumen (it)*/
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}