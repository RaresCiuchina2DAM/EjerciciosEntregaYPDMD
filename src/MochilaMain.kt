import kotlin.math.max

fun main() {
    var Ladron = Persona("Ladrón","Jack",100)
    var objeto1 = Objeto(10,50)
    var objeto2 = Objeto(95, 10 )
    var objeto3 = Objeto(5,155)
    val listaObjetos = arrayOf<Objeto>(objeto1,objeto2,objeto3)


    cogerConMasValor(Ladron,listaObjetos)


}

fun cogerConMasValor(Ladron : Persona , articulos : Array<Objeto> ){
    val rentabilidad = Array<Double>(size = articulos.size){0.00}
    for (i  in articulos.indices){
        rentabilidad[i] = (articulos[i].valor/articulos[i].peso).toDouble()
        println(rentabilidad[i])
    }
    println(rentabilidad.max())

    for (i in rentabilidad.indices){
        if (rentabilidad.max() =)
        if ()

    }


}
