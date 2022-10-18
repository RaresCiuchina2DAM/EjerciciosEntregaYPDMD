import kotlin.math.max

fun main() {
    var Ladron = Personaje("Ladrón","Jack",10)
    var objeto1 = Objeto(5,10)
    var objeto2 = Objeto(4, 40 )
    var objeto3 = Objeto(6,30)
    var objeto4 = Objeto(4,50)
    val listaObjetos = arrayOf<Objeto>(objeto1,objeto2,objeto3,objeto4)


    cogerConMasValor(Ladron,listaObjetos)


}

fun cogerConMasValor(Ladron : Personaje , articulos : Array<Objeto> ){
    val rentabilidad = Array<Double>(size = articulos.size){0.00}
    for (i  in articulos.indices) {
        rentabilidad[i] = (articulos[i].valor / articulos[i].peso).toDouble()
        println(rentabilidad[i])

        }
    println("----------------------")
    println(rentabilidad.max())

        var acum=0.0
        for (i in rentabilidad.indices) {
            if (rentabilidad[i] == rentabilidad.max() && Ladron.capacidadPesoMochilaMax >= articulos[i].peso) {
                acum += articulos[i].peso.toDouble()
                Ladron.sumValor = articulos[i].valor
                rentabilidad[i] = 0.0
                articulos[i].valor = 0
                articulos[i].peso = 0
            }

        }
        Ladron.capacidadPesoMochilaMax = acum


    println(" " + Ladron.capacidadPesoMochilaMax +  " " + Ladron.sumValor)


}



