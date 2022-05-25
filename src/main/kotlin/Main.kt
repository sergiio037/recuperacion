import com.google.gson.Gson

var gson = Gson()

fun main() {
    val examen = Examen()
    examen.gestorDePersonas.personas.forEach { println(it) }
}

