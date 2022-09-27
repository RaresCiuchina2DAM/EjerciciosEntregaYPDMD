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


// Crea una lista con todas las ciudades que tengan la letra "a" mayuscula o minuscula
println(ejercicio1(ciudades))

// Crea una lista de todas las ciudades que tengan la letra "a" mayúscula o minúscula.
// Las que tengan una "A" deberán ser mostradas en mayúsculas todas las letras.
println(ejercicio2(ciudades))

// Elimina todas las ciudades que tengan 8 letras. Recuerda que tu lista debe ser Mutable para poder eliminar elementos
println(ejercicio3(ciudades))

// Escribe la lista de ciudades. Aquellas ciudades con una cantidad de letras impar al revés. Ej. Ibiza - azibI
// Resultado esperado: [Alicante, aíremlA, anolecraB, Bilbao, Burgos, zidáC, anegatraC, abodróC, Gerona, nójiG, adanarG, Huelva, Tenerife, azibI, zereJ, Madrid, Málaga, Marbella, Murcia, Oviedo, Pamplona, adnoR, acnamalaS, náitsabeS naS, rednatnaS, Santiago, alliveS, anogarraT, Toledo, Valencia, Zaragoza]
println(ejercicio4(ciudades))
}

Testing

Utiliza el siguiente código en los test para comprobar que tu solución es correcta:

import org.junit.jupiter.api.Test
class Test {
    @Test
    fun test_ej1() {
        val input = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
            , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
            , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
            "Valencia", "Zaragoza")

        val outputEsperado = listOf("Alicante","Almería","Barcelona","Bilbao","Cartagena","Córdoba","Gerona","Granada","Huelva",
            "Ibiza","Madrid","Málaga","Marbella","Murcia","Pamplona","Ronda","Salamanca","San Sebastián","Santander",
            "Santiago","Sevilla","Tarragona","Valencia","Zaragoza",)

        val output = ejercicio1(input)
        assert(output == outputEsperado)
    }

    @Test
    fun test_ej2() {
        val input = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
            , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
            , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
            "Valencia", "Zaragoza")
        val outputEsperado = listOf("ALICANTE","ALMERÍA","Barcelona","Bilbao","Cartagena","Córdoba","Gerona","Granada","Huelva",
            "Ibiza","Madrid","Málaga","Marbella","Murcia","Pamplona","Ronda","Salamanca","San Sebastián","Santander",
            "Santiago","Sevilla","Tarragona","Valencia","Zaragoza")
        val output = ejercicio2(input)
        assert(output == outputEsperado)
    }

    @Test
    fun test_ej3() {
        val input = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
            , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
            , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
            "Valencia", "Zaragoza")
        val outputEsperado = listOf("Almería","Barcelona","Bilbao","Burgos","Cádiz","Cartagena","Córdoba","Gerona","Gijón",
            "Granada","Huelva","Ibiza","Jerez","Madrid","Málaga","Murcia","Oviedo","Ronda","Salamanca","San Sebastián",
            "Santander","Sevilla","Tarragona","Toledo",)
        val output = ejercicio3(input)
        assert(output == outputEsperado)
    }


    @Test
    fun test_ej4() {
        val input = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
            , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
            , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
            "Valencia", "Zaragoza")
        val outputEsperado = listOf("Alicante","aíremlA","anolecraB","Bilbao","Burgos","zidáC","anegatraC","abodróC",
            "Gerona","nójiG","adanarG","Huelva","Tenerife","azibI","zereJ","Madrid","Málaga","Marbella","Murcia","Oviedo",
            "Pamplona","adnoR","acnamalaS","náitsabeS naS","rednatnaS","Santiago","alliveS","anogarraT","Toledo","Valencia",
            "Zaragoza")
        val output = ejercicio4(input)
        assert(output == outputEsperado)
    }
}
