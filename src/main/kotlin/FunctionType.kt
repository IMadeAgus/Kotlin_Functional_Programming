package org.example
//Function Type => dapat membuat sebuah fungsi menjadi tipe data
/*Kotlin sendiri menggunakan function type untuk tipe deklarasi yang berhubungan dengan sebuah fungsi. */

/*Ketika kita mempunyai beberapa fungsi yang memiliki function type yang sama, kita bisa menyederhanakannya*/
typealias Arithmetic = (Int, Int) -> Int

//Nullable
typealias NullArithmetic = ((Int, Int) -> Int)?

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    val sumNull: NullArithmetic = { valueA, valueB -> valueA + valueB }

    //Untuk insialisasinya kita bisa memaki operator invoke()
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply(20, 20) // bisa menuliskannya secara langsung dengan menghilangkan operator invoke():
    val nullSum = sumNull?.invoke(30, 10) // Nullable

    println(sumResult)
    println(multiplyResult)
    println(nullSum)


}