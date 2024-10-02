package org.example



fun main() {
    val text = "Hello"
    //Run
    /*Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
    Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this).
    Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian*/
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")

    //With
    // Pada dasarnya fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa
    val message = "Hello Kotlin!"
    val resultWith = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }
    println(resultWith)

    //Aplly
    /*Berbeda dengan fungsi-fungsi sebelumnya, nilai yang dikembalikan dari fungsi apply
    adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this)*/
    val messageApply = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(messageApply.toString())
}