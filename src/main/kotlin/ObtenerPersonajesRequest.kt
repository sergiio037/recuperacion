import com.google.gson.reflect.TypeToken
import okhttp3.OkHttpClient
import okhttp3.Request

class ObtenerPersonajesRequest {

    companion object {
        fun get(): Array<Personaje> {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url("http://hp-api.herokuapp.com/api/characters")
                .build()
            val response = client.newCall(request).execute()

            if (response.isSuccessful) {
                response.body?.string().let { responseBody ->
                    val itemType = object : TypeToken<List<Personaje>>() {}.type
                    return gson.fromJson<List<Personaje>?>(responseBody, itemType).toTypedArray()
                }

            } else
                throw DownloadingException()
        }
    }

    class DownloadingException : Exception()

}