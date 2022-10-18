fun main() {

    var numeroPisos = 10
    var numeroVentanas = 4
    var numeroTorres = 3

    crearRascacielos(numeroPisos,numeroVentanas,numeroTorres)


}

fun crearRascacielos(numeroPisos: Int, numeroVentanas:Int, numeroTorres:Int) {

    repeat(numeroTorres) {
        repeat(numeroVentanas * 3 + 2) {
            print("_")
        }
        repeat(numeroVentanas * 3 + 2) {
            print(" ")
        }
    }
    println()


    repeat(numeroPisos) {
        repeat(numeroTorres) {
            print("|")
            repeat(numeroVentanas) {
                print("_▋_")
            }
            print("|")
            repeat(numeroVentanas * 3 + 2) {
                print(" ")
            }
        }
        println()
    }
}
