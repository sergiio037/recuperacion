import java.io.File

class ObtenerPersonasRequest {

    companion object {
        fun get(): Personas {
            return gson.fromJson(File("users.json").readText(), Personas::class.java)
        }
    }

}