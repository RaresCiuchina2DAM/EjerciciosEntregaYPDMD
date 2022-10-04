import kotlin.random.Random

//se encuentra realizado desde el ejercicio 1, hasta el ejercicio Listas Mix
fun main (args : Array<String>){
    val fav = 13L
    print("El numero $fav es mi numero favorito\n")
    println("El numero ${fav.toDouble()} no me gusta")


    textoNombre("Marikiki")
    diEdad("Marikiki", 13)

    diResultado(sumaInteger(5,9),sumaString("5","9"))
    funcionConParametros(34)
    println(transformarIntADouble(12))
    diHola("Victor")
    diEdad(12,"Pablo")
    calcularPrecio(23,"Victor")
    calcularPrecioWhen(68,"Pepe")
    Mostrar_Caracteres(500)
    println()
    dibujarPiramide(2)
    juegoAdivinar()
    listasMix()
    calcularPrecioWhen(20,"PEPE")
    calcularPrecio(15)
    println("======================================================================")
    println("funcion1 = ${funcion1(1,2,3,4)}")
    println("funcion1 = ${funcion1(1,2,3,null)}")
    println("funcion1 = ${funcion1(null,null,null,null)}")
    println("======================================================================")
    println("funcion2 = ${funcion2(1,2,3,4)}")
    println("funcion2 = ${funcion2(1,2,3,null)}")
    println("funcion2 = ${funcion2(null,null,null,null)}")
    println("======================================================================")
    println("funcion3 = ${funcion3(1,2,3,4)}")
    println("funcion3 = ${funcion3(1,2,3,null)}")
    println("funcion3 = ${funcion3(null,null,null,null)}")
    println("======================================================================")
    edificio(15,10)
}

fun transformarIntADouble(numero : Int): Double {
    return numero.toDouble()
}
fun diHola(nombre : String) {
    println("Hola $nombre")
}
fun diEdad(edad: Int, nombre: String) {
    println("Hola, soy $nombre y tengo $edad años.")
}
fun sumaInteger(num1: Int, num2: Int): Double {
    return (num1+num2).toDouble()
}
fun sumaString(String1: String, String2: String): Double {
    return (String1+String2).toDouble()
}
fun diResultado(num1: Double, num2:Double){
    println("sumaIntegers ha devuelto un $num1 y sumaStrings ha devuelto $num2")
}

fun funcionConParametros (param : Int ) : Double{
    return param.toDouble()
}
fun textoNombre (persona : String){
    println("Hola $persona")
}
fun diEdad (persona: String , edad :Int ){
    println("Soy $persona y tengo $edad")
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

fun calcularPrecio(edad : Int){
    if (edad in 0..17) {
        println("TIENES OFERTA DE MENOR ")
    }
    if (edad in 0..65) {
        println("PRECIO NORMAL ")
    }
    if (edad > 65) {
        println("PRECIO DE SEÑOR MAYOR")
    }
}
fun calcularPrecioWhen(edad : Int){
    when (edad){
        in 0..17 -> println("TIENES OFERTA DE MENOR DE EDAD")
        in 18..64 -> println("No tienes oferta")
        in 65..160 -> println( "GRATIS!")    }
}
fun funcion1(num1: Int?,num2: Int?,num3:Int?,num4:Int?): Int? {

    return if (num1 ==null || num2 == null || num3 == null || num4==null){null}
    else return num1+num2+num3+num4

}
fun funcion2(num1: Int?,num2: Int?,num3:Int?,num4:Int?): Int? {
    var suma = num1?:0
    suma += num2?:0
    suma += num3?:0
    suma += num4?:0
    return suma
}
fun funcion3(num1: Int?,num2: Int?,num3:Int?,num4:Int?): Int? {
    return if (num1 ==null || num2 == null || num3 == null || num4==null){null}
    else{
        var suma = num1?:0
        suma += num2?:0
        suma += num3?:0
        suma += num4?:0
        return suma}
}
fun edificio (pisos: Int,ventanas: Int) {
    repeat(ventanas*3+2){
        print("_")
    }
    println()
    repeat(pisos) {
        print("|")
        repeat(ventanas){
            print("_?_")
        }
        println("|")
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
        }while (!encontrado)
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










