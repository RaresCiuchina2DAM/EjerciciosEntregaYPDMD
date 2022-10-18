fun main() {
    var clave =0
    println("Dime en que clave quieres hacer el cifrado(entre 1 y 26)")
    clave = readln().toInt()
    println("Contraseña:")
    var paswd = readln()
    println(cifradoCesar(clave, paswd.lowercase()))

}

fun cifradoCesar(clave: Int , paswd: String): String{

    var clave1=clave
    while (clave1 >25){
        clave1 -= 25
    }
    val paswd1 = paswd.toCharArray()
    var passcif = ""
    for(element in paswd1 ){
        if ( element + clave1 > 'z'){
            passcif += element + clave1 -26
        }else passcif += element + clave1
    }
    return passcif
}


