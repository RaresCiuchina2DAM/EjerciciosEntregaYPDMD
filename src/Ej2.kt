fun main() {
    println("-----------------------------------------------------\n")
    //EJERCICIO CLASES 2
    var dado1 = Dado();
    var dado2 = Dado(1,3)
    var dado3 = Dado(4,6)
    var jugadores = Array<Int>(10) {0}


    repeat(jugadores.size) {

        for (i in jugadores.indices) {
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

