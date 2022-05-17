import com.google.gson.Gson

var gson = Gson()

fun main() {
    val ej5 = Ejercicio5()
    ej5.arrayPersonajes = ObtenerPersonajesRequest.get()
    ej5.iniciarEjercicio5()
    ej5.all.forEach { println(it) }
}
