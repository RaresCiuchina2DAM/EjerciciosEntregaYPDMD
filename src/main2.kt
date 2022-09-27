fun main() {
    // Ejercicios con entrega de clase
    var numeroPisos = 10
    var numeroVentanas = 8
    var numeroTorres = 5

    crearRascacielos(numeroPisos,numeroVentanas,numeroTorres)
    println("-----------------------------------------------------\n Ejercicio Listas de varios tipos:\n")

    listas_varios_tipos()

}

fun crearRascacielos(numeroPisos: Int, numeroVentanas:Int, numeroTorres:Int) {

    repeat(numeroTorres) {
        repeat(numeroVentanas * 3 + 2) {
            print("_")
        }
        repeat(numeroVentanas * 3 + 2) {
            print(" ")
        }
    }
    println()


        repeat(numeroPisos) {
            repeat(numeroTorres) {
                print("|")
                repeat(numeroVentanas) {
                    print("_▋_")
                }
                print("|")
                repeat(numeroVentanas * 3 + 2) {
                    print(" ")
                }
            }
            println()
        }
    }


fun listas_varios_tipos(){
    val lista = listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?")
    var contStrings =""
    var sumDouble = ""


    lista.forEach {
        when (it) {
            is String -> contStrings += "$it "
            is Double -> sumDouble += it
            is Int -> sumDouble += it
        }
    }

    println("El contenido de tipo String es : $contStrings")
    println("El contenido sumatorio es : $sumDouble")

}





