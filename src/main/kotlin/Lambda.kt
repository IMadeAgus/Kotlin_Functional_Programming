package org.example

//Lambda function = anonymous function
//Dengan lambda
val message :(String) -> String = { name: String ->
    "Hello $name"
}

//Cara normal
fun getMessage(name: String): String {
    return "Hello $name"
}

// Menyederhanakan anonymous class
//Sebelum
val comparator = object :Runnable{
    override fun run() {
        // TODO:
    }
}

//Sesuadah
val comparatorLambda = Runnable {
    // TODO:
}


//Contoah Lambda Singakt
val printMessage = { message: String -> println(message) }
val messageLenght = { message: String -> message.length} // Mengembalikan nilai

fun main() {
    printMessage("Hello From Lambda")
    messageLenght("Made")

    //Foreach merupakan extension function yg menerapkan lamda
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }

    //Foreach indexed
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    //hanya mencetak indexnya
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }

}