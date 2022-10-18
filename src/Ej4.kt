fun main() {

    listas_varios_tipos()
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