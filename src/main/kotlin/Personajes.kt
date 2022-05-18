class Personajes(private val personajes: Array<Personaje>) {

    fun obtenerPotters() : Array<Personaje> {
        return personajes.filter {
            it.name.contains("Potter")
        }.toTypedArray()
    }

    fun obtenerTodos(): Array<Personaje> {
        return personajes
    }

    fun obtenerPersonajesConImagen() : Array<Personaje> {
        return personajes.filter {
            it.image.isNotEmpty()
        }.toTypedArray()
    }
}