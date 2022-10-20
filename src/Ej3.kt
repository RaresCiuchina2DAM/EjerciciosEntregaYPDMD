// EJERCICIO DE CLASES 3
//Clase Jugador y función juegoLanzarDado

fun main() {
    val jug1 = Jugador2()
    val jug2 = Jugador2()
    val dadoEj3 = Dado(10, 20)

    juegoLanzarDado(jug1, jug2, 6, dadoEj3)

}

class Jugador2(var kills : Int = 0, var muertes : Int = 0 , var puntuacion : Int = 0 ){
    override fun toString(): String {
        return "Jugador(kills=$kills, muertes=$muertes, puntuacion=$puntuacion)"
    }
}
fun juegoLanzarDado(jug1 : Jugador2 , jug2 : Jugador2, numeroCombate : Int,dado : Dado){
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



