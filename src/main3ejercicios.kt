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


val ciudades = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
    , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
    , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
    "Valencia", "Zaragoza")

