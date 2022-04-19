import com.google.gson.Gson
import java.io.File

var gson = Gson()

fun main() {

    var a = File("aaaa.txt")
    a.writeText("dalshhjadfskladfs")
    println(a.readText())
    a.exists()

    val listaPokemon = if (ListaPokemon.fileExist()) {
        ListaPokemon.cargarListaPokemonDeFichero()
    } else {
        ObtenerPokemonRequest.get()
    }
    listaPokemon.guardarEnFichero()

    listaPokemon.imprimirPokemons()

    println("¿Escribe el nombre del Pokemon que quieres buscar?")
    val nombreBuscado = readLine()
    nombreBuscado?.let {
        val listaPokemonFiltrada = listaPokemon.buscarPokemonPorNombre(it)
        listaPokemonFiltrada.imprimirPokemons()
    }

    println("¿Escribe el tipo que quieres buscar?")
    val tipoBuscado = readLine()
    tipoBuscado?.let {
        val listaPokemonFiltrada = listaPokemon.buscarPokemonPorTipo(it)
        listaPokemonFiltrada.imprimirPokemons()
    }
}