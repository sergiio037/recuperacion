import com.google.gson.Gson

var gson = Gson()

fun main() {
    val listaPokemon = ObtenerPokemonRequest.get()

    listaPokemon.forEach {
        println(it.decirNombreYTipo())
    }

    println("¿Escribre el tipo que quieres buscar?")
    val tipoBuscado = readLine()
    tipoBuscado?.let {
        // TODO muéstrame todos los pokemon de ese tipo. Si no hay, dime que no hay
    }
}