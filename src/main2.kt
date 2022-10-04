fun main() {
    // Ejercicios con entrega de clase
    var numeroPisos = 10
    var numeroVentanas = 8
    var numeroTorres = 5

    crearRascacielos(numeroPisos,numeroVentanas,numeroTorres)
    println("-----------------------------------------------------\n Ejercicio Listas de varios tipos:\n")
    listas_varios_tipos()



    println("-----------------------------------------------------\n")
    //EJERCICIO CLASES 2
    var dado1 = Dado();
    var dado2 = Dado(1,3)
    var dado3 = Dado(4,6)
    var jugadores = Array<Int>(10) {0}


    repeat(jugadores.size) {

        for (i in 0..jugadores.size-1) {
            jugadores[i]= jugadores[i] +
                    dado1.tiradaUnica() +
                    dado2.tiradaUnica() +
                    dado3.tiradaUnica()
            println(jugadores[i])
        }

    }
            darResultado(jugadores)

    println("-----------------------------------------------------\n")


}

fun darResultado(jugadores : Array<Int>) {

    ordenarMayor(jugadores,jugadores.size)
    for (i in 0..jugadores.size-1){
        println("Jugador : " +  i + " tiene: " + jugadores[i] + " puntos" )
    }
}

fun ordenarMayor(listNum: Array<Int>, cant: Int) {
    var tmp = 0
    for(x in 0 until cant) {
        for(y in 0 until cant) {
            if(listNum[x] > listNum[y]) {
                tmp = listNum[x]
                listNum[x] = listNum[y]
                listNum[y] = tmp
            }
        }
    }

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
    var sumDouble = 0.0


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








