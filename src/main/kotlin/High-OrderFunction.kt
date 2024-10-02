package org.example

/*Dalam mendeklarasi lambda, khususnya jika ingin ditetapkan agar dapat mengembalikan nilai,
terkadang kompiler tidak dapat menentukan tipenya.
 Alhasil, kita perlu menuliskannya secara eksplisit.*/




fun main() {
    //cara 1
    printResult(10 ,sum)
    // output = 20

    //cara 2, lngsg melampirkan isi lambda
    printResult(10, { value ->
        value + value
    })
    // output = 20


}
//lambda yang memiliki 1 (satu) parameter bertipen data Int dengan tipe kembalian Int
var sum: (Int) -> Int = { value -> value + value }

// Var sum dijadikan argumen, ini disebut high order function
//yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

//untuk menghindari pemanggilan instance yang banyak , gunakan inline
inline fun printResultInline(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}
//Penggunakan inline juga dapat menyebabkan file binary program menjadi lebih besar dan memperlambat waktu kompilasi