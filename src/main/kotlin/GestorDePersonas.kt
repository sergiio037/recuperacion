
data class GestorDePersonas (
    val personas: Array<Persona>,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GestorDePersonas

        if (!personas.contentEquals(other.personas)) return false

        return true
    }

    override fun hashCode(): Int {
        return personas.contentHashCode()
    }
}

data class Persona (
    val gender: String,
    val name: Name,
    val location: Location,
    val email: String,
    val login: Login,
    val dob: Dob,
    val registered: Dob,
    val phone: String,
    val cell: String,
    val id: ID,
    val picture: Picture,
    val nat: String
)

data class Dob (
    val date: String,
    val age: Long
)

data class ID (
    val name: String,
    val value: String? = null
)

data class Location (
    val street: Street,
    val city: String,
    val state: String,
    val country: String,
    val coordinates: Coordinates,
    val timezone: Timezone
)

data class Coordinates (
    val latitude: String,
    val longitude: String
)

data class Street (
    val number: Long,
    val name: String
)

data class Timezone (
    val offset: String,
    val description: String
)

data class Login (
    val uuid: String,
    val username: String,
    var password: String?,
    val salt: String,
    val md5: String,
    val sha1: String,
    val sha256: String
)

data class Name (
    val title: String,
    val first: String,
    val last: String
)

data class Picture (
    val large: String,
    val medium: String,
    val thumbnail: String
)
