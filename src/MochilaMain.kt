fun main() {
    var Ladron = Persona("Ladrón","Jack",100)
    var objeto1 = Objeto(0,0)
    var objeto2 = Objeto(,95, 10 )
    var objeto3 = Objeto(5,155)
    var articulos = arrayOf(objeto1,objeto2,objeto3)

}

fun cogerConMasValor(Ladron : Persona , articulos : Array<Objeto> ){
    var puedeEntrar = arrayOf<Objeto>()
    for (i in articulos.indices){
        if (articulos[i].peso < Ladron.capacidadPesoMochilaMax ){
            puedeEntrar[i] = articulos[i]

        }
    }
}