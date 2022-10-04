//Transforma las siguientes funciones en Lambdas
fun main() {

    //EJERCICIOS DESDE LAMBDAS EN ADELANTE HASTA

    val ejercicio1 = { println("Hola") }
    val ejercicio2 = {integer : Int -> println("Hola $integer")}
    val ejercicio3 = {integer : Int , listInteger : List<Any> ->    println("Hola ${integer + listInteger.size}")}
    val ejercicio4 : (Int,List<Any>) -> Int = { integer : Int, listInteger : List<Any> -> integer+listInteger.size }
}
fun ejercicio1() {
    println("Hola")
}

fun ejercicio2(integer : Int) {
    println("Hola $integer")
}

fun ejercicio3(integer : Int, listInteger : List<Any>) {
    println("Hola ${integer + listInteger.size}")
}

fun ejercicio4(integer : Int, listInteger : List<Any>) : Int {
    return integer + listInteger.size
}







