import java.io.File

class ObtenerPersonasRequest {

    companion object {
        fun get(): GestorDePersonas {
            return gson.fromJson(File("users.json").readText(), GestorDePersonas::class.java)
        }
    }

}