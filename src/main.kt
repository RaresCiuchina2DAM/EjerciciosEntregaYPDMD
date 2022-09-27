import kotlin.random.Random

fun main (args : Array<String>){
    val fav = 13L
    print("El numero $fav es mi numero favorito\n")
    println("El numero ${fav.toDouble()} no me gusta")

    println( funcionConParámetros(4))
    textoNombre("Marikiki")
    diEdad("Marikiki", 13)

    diResultado(sumaInteger(5,9),sumaString("5","9"))
    var num = 0

    //ES IGUAL A 0 O ESTA EN UN RANGO CON IF
    if (num == 0) println("el $num es igual a 0")
        else println("$num es diferente a 0")
    if (num in 0..9) println("$num está entre 0 y 9")
        else println("$num es mayor que 9")

    calcularPrecio(23,"Victor")
    calcularPrecioWhen(68,"Pepe")
    Mostrar_Caracteres(500)
    println()
    dibujarPiramide(2)
    juegoAdivinar()

}



fun funcionConParámetros (param : Int ) : Double{
    return param.toDouble()
}
fun textoNombre (persona : String){
    println("Hola $persona")
}
fun diEdad (persona: String , edad :Int ){
    println("Soy $persona y tengo $edad")
}

fun sumaInteger(num1 : Int , num2 : Int): Int {
    return  num1 + num2
}
fun sumaString (num1 : String , num2 : String ): Double{
    return (num1.toInt()+num2.toInt()).toDouble()

}
fun diResultado (fun1 : Int , fun2 : Double ){
    println("SumaInteger ha devuelto $fun1 y SumaString ha devuelto $fun2")
}

fun calcularPrecio (edad: Int , persona: String) {
    if (edad in 0..17)  println("$persona debe abonar 5€")
    if (edad in 18..64)  println("$persona debe abonar 10€")
    if (edad > 65 )  println("$persona es gratis")
}
fun calcularPrecioWhen(edad: Int , persona: String) {
    when (edad) {

        in 0..17 -> println("$persona debe abonar 5€")
        in 18..64 -> println("$persona debe abonar 10€")
        else -> println("$persona debe abonar 0€")
    }
}

fun Mostrar_Caracteres (num : Int){
    repeat(num){
        print(it.toChar())
        if (it % 10 == 0){
            println()
        }
    }
}
fun dibujarPiramide(lado : Int) {
        repeat(lado) {
            repeat(lado - it) {
                print(' ') }

            print('/')
            repeat(it) {
                print("__")
            }
            println("\\")
    }
}

fun readIntFromKeyboard(): Int {
    var result : Int?
    do {
        val selectedOption = readLine()
        result = try {
            selectedOption?.toInt()
        } catch (e: NumberFormatException) {
            println("Lo que has introducido no es un número.")
            null
        }
    } while (result == null)
    return result
}

fun getRandomNumber(rango: IntRange): Int {
    return rango.random()
}
fun juegoAdivinar(){
    val rango= 1..20
    val numeroBuscado=getRandomNumber(rango)
    println("Encuentra un numero entre $rango")
    do{
        println("Escribe tu numero:")
        var numero = readIntFromKeyboard()
        var encontrado = when {
            numeroBuscado > numero -> {
                println("El numero buscado es mas grande")
                false
            }

            numeroBuscado < numero -> {
                println("El numero buscado es mas pequeño")
                false
            }

            else -> {
                println("EL NUMERO $numero es el BUSCADO!!")
                true
            }
        }
        }while (encontrado == false)
    }

fun listasMix(){
    val listaRandom=crearListaAleatorio()
    val listaResultado = encontrarListas(listaRandom)
    println("ListaRandom = $listaRandom")
    println("lista resultado = $listaResultado")

}
fun crearListaAleatorio() : List<Int>{
    return MutableList(Random.nextInt(90,110)){ Random.nextInt(0,10) }
}

fun encontrarListas(listaRandom : List<Int>) : List<Int> {
    var output = mutableListOf<Int>()
    var num = 0
    for (num in 0..9) {
        var acum = 0
        for (numRandom in listaRandom) {
            if (numRandom == num) {
                acum++
            }
        }
        output.add(num, acum)
    }
    return output
}







