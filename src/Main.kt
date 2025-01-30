fun main() {

    fun pedirNombre(): String{

        var nombre = ""

        do{
            println("Introduce un nombre")
            nombre = readln()

        }
        while(nombre.isNullOrEmpty())

        return nombre
    }

    val persona1 = Persona(peso=23.06, altura = 24.06 )
    persona1.nombre = pedirNombre()
    println("${persona1.nombre}, ${persona1.peso} kg, ${persona1.altura} cm")

    val persona3 = Persona("Paco", peso=56.06, altura = 154.06)
    println(persona3)
    persona3.altura = 1.80

    println(persona3)


    val persona2 = Persona(peso = 90.0, altura = 1.85)
    persona2.altura = persona3.altura
    println(persona2)
    println(persona3)
    println("${if (persona2 == persona3) "Son iguales" else "No son iguales"}")

    val persona4 = Persona("Ana", peso = 56.5, altura = 1.75)
    val persona5 = Persona("Lola", peso = 76.2, altura = 1.65)
    val persona6 = Persona("Cristina", peso = 24.0, altura = 1.40)
    val persona7 = Persona("Luna", peso = 92.0, altura = 1.50)
    val persona8 = Persona("Iris", peso = 100.0, altura = 1.80)

    Persona.personasCreadas.forEach{
        println("${it.obtenerDesc()}\n")
    }





}