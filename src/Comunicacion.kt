import java.util.*

fun Comunicacion (respuesta : String, jugador: Jugador): String {

        when (jugador.estadoVital) {
             in 0..21 ->
                if (esMayuscula(respuesta) &&
                    respuesta.get(index = 1) == '¿' &&
                    respuesta.get(index = respuesta.length) == '?'
                ) {
                    return "Tranqui, se lo que hago"
                } else if (respuesta.equals("¿Como estas?")) {
                    return "De lujo"
                } else if (esMayuscula(respuesta)) {
                    return "Eh , relajate"
                } else if (respuesta == jugador.nombre) {
                    return "¿Que pasa?"
                } else return "Yo que sé"

            in 22..65 ->
                if (esMayuscula(respuesta) &&
                    respuesta.get(index = 1) == '¿' &&
                    respuesta.get(index = respuesta.length) == '?'
                ) {
                    return "Estoy buscando la mejor solución"
                } else if (respuesta.equals("¿Como estas?")) {
                    return "En la flor de la vida,\n" +
                                "pero me empieza a doler la espalda"

                } else if (esMayuscula(respuesta)) {
                    return "No me levantes la voz mequetrefe"
                } else if (respuesta == jugador.nombre) {
                    return "¿Necesitas algo?"
                } else return "No sé de qué me estás hablando"

            else ->
                if (esMayuscula(respuesta) &&
                    (respuesta.get(index = 1) == '¿') &&
                    (respuesta.get(index = respuesta.length) == '?')
                ) {
                    return "Que no te escucho!"
                } else if (respuesta.equals("¿Como estas?")) {
                    return "No me puedo mover"
                } else if (esMayuscula(respuesta)) {
                    return "Háblame más alto que no te escucho"
                } else if (respuesta == jugador.nombre) {
                    return "Las 5 de la tarde"
                } else return "En mis tiempos esto no pasaba"

        }
    }


//FUNCIONES DE COMUNICACIÓN
fun esMayuscula(s: String): Boolean {
    return s == s.uppercase(Locale.getDefault())
}

fun hablarConJugador(texto: String, jugador: Jugador): String {

    if (jugador.razas.equals("Humano",true)) {
        return Comunicacion(texto, jugador)
    }else if (jugador.razas.equals("Elfo",true)){
            return cifradoCesar(13,Comunicacion(texto,jugador))
        }else if (jugador.razas.equals("Enano",true)){
                return Comunicacion(texto,jugador).uppercase()
            }else if (jugador.razas.equals("Elfo",true)){
                    return cifradoCesar(13,Comunicacion(texto,jugador)) }
    else return "a"
    }


