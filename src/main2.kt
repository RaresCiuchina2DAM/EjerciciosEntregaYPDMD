import kotlin.random.Random
fun main() {
    // Ejercicios con entrega de clase
    var numeroPisos = 10
    var numeroVentanas = 8
    var numeroTorres = 5

    crearRascacielos(numeroPisos, numeroVentanas, numeroTorres)
    println("-----------------------------------------------------\n Ejercicio Listas de varios tipos:\n")

    listas_varios_tipos()


    println("-----------------------------------------------------\n")
    //EJERCICIO CLASES 2
    val dado1 = Dado();
    val dado2 = Dado(1, 3)
    val dado3 = Dado(4, 6)
    val jugadores = Array<Int>(10) { 0 }


    repeat(jugadores.size) {
        for (i in 0..jugadores.size - 1) {
            jugadores[i] = jugadores[i] +
                    dado1.tiradaUnica() +
                    dado2.tiradaUnica() +
                    dado3.tiradaUnica()
            println(jugadores[i])
        }

    }
    darResultado(jugadores)

    println("-----------------------------------------------------\n")
    // EJERCICIO DE CLASES 3
    //Clase Jugador y función juegoLanzarDado

    val jug1 = Jugador()
    val jug2 = Jugador()
    val dadoEj3 = Dado(10, 20)

    juegoLanzarDado(jug1, jug2, 6, dadoEj3)




}

class Jugador(var kills : Int = 0, var muertes : Int = 0 , var puntuacion : Int = 0 ){
    override fun toString(): String {
        return "Jugador(kills=$kills, muertes=$muertes, puntuacion=$puntuacion)"
    }
}
fun juegoLanzarDado(jug1 : Jugador , jug2 : Jugador, numeroCombate : Int,dado : Dado){
    var i = 0
    while (i <= numeroCombate){
        jug1.puntuacion = dado.tiradaDoble()
        jug2.puntuacion = dado.tiradaDoble()
        println(jug1.puntuacion)
        println(jug2.puntuacion)

        if (jug1.puntuacion > jug2.puntuacion) {
            jug1.kills += 1
            jug2.muertes = +1
            println(jug1.toString())
            println(jug2.toString())
            i++
        } else if (jug2.puntuacion > jug1.puntuacion) {
            jug2.kills += 1
            jug1.muertes = +1
            println(jug1.toString())
            println(jug2.toString())
            i++
        } else println("EMPATE, SE VOLVERÁ A TIRAR PARA DESEMPATAR")
    }
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










