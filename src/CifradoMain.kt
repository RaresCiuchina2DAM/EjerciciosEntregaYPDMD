fun main() {
    var clave =0
    do {
        println("Dime en que clave quieres hacer el cifrado(entre 1 y 26)")
         clave = readln().toInt()
    }while (!(clave >= 0 || clave <= 26) )
        //1 --x
    //a cifrado de 2 vva a ser c
    println("Contraseña:")
    val paswd = readln()

    println(cifradoCesar(clave, paswd.lowercase()))
}

fun cifradoCesar(clave : Int , paswd : String): String {

    val paswd1 = paswd.toCharArray()
    var passcif = ""
    for (i in paswd1.indices) {
        var char1 = paswd1[i]

        if (char1 in 'a'..'z') {
            char1 += clave
            if (char1 > 'z') {
                char1 = ((char1.code - 'z'.code)).toChar()
                char1 = ((char1.code + 'a'.code)).toChar()
            }
        }
        passcif += char1

    }
    return passcif
}




