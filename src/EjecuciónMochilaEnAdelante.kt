fun main() {
    var PersonajePropio = Jugador("","",0,0,"","")

    println("Ponle el nombre")
    PersonajePropio.nombre = readln()

    println("Dime la capacidad de la mochila")
    PersonajePropio.capacidadPesoMochilaMax = readln().toDouble()

    println("Dime la edad del personaje")
    PersonajePropio.estadoVital = readln().toInt()

    do{
        println("Dime la raza de tu jugador:")
        println("    Elfo\n    Humano\n    Enano\n    Goblin")
        PersonajePropio.razas = readln()
    } while (!(PersonajePropio.razas.equals("elfo",ignoreCase = true))
        &&!(PersonajePropio.razas.equals("Humano",ignoreCase = true))
        &&!(PersonajePropio.razas.equals("Enano",ignoreCase = true))
        &&!(PersonajePropio.razas.equals("Goblin",ignoreCase = true)))


    do{
        println("Dime la clase de tu jugador:")
        println("    Mago\n    Ladron\n    Guerrero\n    Berserker")
        PersonajePropio.oficio = readln()
    } while (!(PersonajePropio.oficio.equals("Mago",ignoreCase = true))
        &&!(PersonajePropio.oficio.equals("Ladron",ignoreCase = true))
        &&!(PersonajePropio.oficio.equals("Guerrero",ignoreCase = true))
        &&!(PersonajePropio.oficio.equals("Berserker",ignoreCase = true)))



    var respuesta=""
    while (respuesta != "*"){
        println("Hablemos con el jugador")
        println(hablarConJugador(readln(),PersonajePropio))
    }





}