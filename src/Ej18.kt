fun ej18_1 () {

    val caja = arrayOf<Double>(
        2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01
    )

    var arr = Array<Int>(8) {0}

    var dinero = 0.0f
    var cont = 0

    println("Escribe una cantidad de dinero para saber cuantas monedas necesitas: ")
    dinero = readln().toFloat()

    for (i in caja.indices){
//        println("${caja[i]}")
        cont = (dinero / caja[i]).toInt()
        dinero -= (caja[i] * cont).toFloat()
        arr[i] = cont
    }

    println("Necesitarás: ")
    println("${arr[0]} monedas de 2 euros")
    println("${arr[1]} monedas de 1 euro")
    println("${arr[2]} monedas de 50 céntimos")
    println("${arr[3]} monedas de 20 céntimos")
    println("${arr[4]} monedas de 10 céntimos")
    println("${arr[5]} monedas de 5 céntimos")
    println("${arr[6]} monedas de 2 céntimos")
    println("${arr[7]} monedas de 1 céntimo")

}

fun main() {

    //para no tener que usar decimales, multiplicamostodo por 100
    val caja = arrayOf(
        200, 100, 50, 20, 10, 5, 2, 1
    )
    val arr = Array(8) {0}

    //dinero haremos que sea también int, para seguir la similitud del array caja
    var dinero = 0
    var cont = 0

    println("Escribe una cantidad de dinero para saber cuantas monedas necesitas: ")
    //Dinero recoge un float, que multiplica por 100, y lo pasa a Int, para seguir con el formato del array caja
    dinero = (readln().toFloat() * 100).toInt()

    for (i in caja.indices){
        //aquí, tenemos en cuenta de que todolo ha multiplicado por 100, por lo tanto, el resultado es igual
        //si divides 13,86/2 que 1386/200el resultado es el mismo
        //así evitamos que el lenguaje tenga que hacer operaciones con decimales, que no suele ser su punto fuerte
        cont = (dinero / caja[i])
        dinero -= cont * caja[i]
        arr[i] = cont
    }

    println("Necesitarás: ")
    println("${arr[0]} monedas de 2 euros")
    println("${arr[1]} monedas de 1 euro")
    println("${arr[2]} monedas de 50 céntimos")
    println("${arr[3]} monedas de 20 céntimos")
    println("${arr[4]} monedas de 10 céntimos")
    println("${arr[5]} monedas de 5 céntimos")
    println("${arr[6]} monedas de 2 céntimos")
    println("${arr[7]} monedas de 1 céntimo")
}