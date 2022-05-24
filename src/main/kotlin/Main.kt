import com.google.gson.Gson

var gson = Gson()

fun main() {
    val examen = Examen()
    examen.personajes.obtenerTodos().forEach { println(it) }
    println(examen.personajes.obtenerPersonajesConImagen().size)
}
