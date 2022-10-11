class Persona {
    var oficio = ""
    var nombre = ""
    var capacidadPesoMochilaMax=0
    constructor(oficio : String , nombre : String , capacidadPesoMochilaMax : Int){
        this.oficio = oficio
        this.nombre=nombre
        this.capacidadPesoMochilaMax = capacidadPesoMochilaMax

    }
}

class Objeto {
    var peso = 0
    var valor = 0
    constructor(peso : Int , valor : Int){
        this.peso=peso
        this.valor=valor
    }
}