import okhttp3.OkHttpClient
import okhttp3.Request

class ObtenerPokemonRequest {

    companion object {
        fun get(): MutableList<Pokemon> {
            val listaPokemon = mutableListOf<Pokemon>()
            val client = OkHttpClient()
            for (i in 1..9) {
                val request = Request.Builder()
                    .url("https://pokeapi.co/api/v2/pokemon/${i}")
                    .build()
                val response = client.newCall(request).execute()

                if (response.isSuccessful) {
                    response.body?.string().let { responseBody ->
                        val pokemon = gson.fromJson(responseBody, Pokemon::class.java)
                        listaPokemon.add(pokemon)
                    }

                } else
                    println("Algo ha ido mal")
            }
            return listaPokemon
        }
    }

}