class Persona (val peso: Double, var altura: Double) {
    var imc: Double = 0.0

        private set

        get() {
            field = peso / (altura * altura)
            return field
        }


    var nombre = ""

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura){
        imc = peso / (altura * altura)

        this.nombre = nombre
    }


    companion object{
        val personasCreadas = mutableListOf<Persona>()

        //Hago una lista de personas vacías que se va modificando//

    }

    init{
        personasCreadas.add(this)
        //Con esto cada vez que se cree un objeto lo añade a una lista//
    }

    fun saludar():String{
        return "Hola $nombre"
    }

    fun alturaEncimaMedia():Boolean{
        if(altura >= 1.75){
            return true
        }else return false
    }

    fun pesoEncimaMedia():Boolean{
        if (peso >= 70){
            return true
        }else return false
    }

    fun obtenerDescImc(){
        when{
            imc < 18.5 -> "peso insuficiente"
            imc >= 18.5 || imc <= 24.9 -> "peso saludable"
            imc >= 25.0 || imc <= 29.9 -> "sobrepeso"
            imc > 30 -> "obesidad"
        }
    }

    fun obtenerDesc():String{
        return "$nombre, con una altura de $altura m (${if(alturaEncimaMedia()) "Por encima de la media" else "Por debajo de la media"}) y un peso $peso (${if(pesoEncimaMedia()) "Por encima de la media" else "Por debajo de la media"}) tiene un IMC de $imc (${obtenerDescImc()}."
    }

    override fun toString(): String {
        return "Nombre: $nombre, peso: $peso, altura: $altura, imc: $imc"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return nombre == other.nombre && peso == other.peso &&  altura == other.altura && imc == other.imc
    }

    override fun hashCode(): Int {
        return  nombre.hashCode() * 31 + peso.hashCode() * 31 + altura.hashCode() * 31 + imc.hashCode()
    }
}