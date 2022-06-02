
data class GestorDePersonas (
    var personas: Array<Persona>,
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
    var gender: String,
    var name: Name,
    var location: Location,
    var email: String,
    var login: Login,
    var dob: Dob,
    var registered: Dob,
    var phone: String,
    var cell: String,
    var id: ID,
    var picture: Picture,
    var nat: String
)

data class Dob (
    var date: String,
    var age: Long
)

data class ID (
    var name: String,
    var value: String? = null
)

data class Location (
    var street: Street,
    var city: String,
    var state: String,
    var country: String,
    var coordinates: Coordinates,
    var timezone: Timezone
)

data class Coordinates (
    var latitude: String,
    var longitude: String
)

data class Street (
    var number: Long,
    var name: String
)

data class Timezone (
    var offset: String,
    var description: String
)

data class Login (
    var uuid: String,
    var username: String,
    var password: String?,
    var salt: String,
    var md5: String,
    var sha1: String,
    var sha256: String
)

data class Name (
    var title: String,
    var first: String,
    var last: String
)

data class Picture (
    var large: String,
    var medium: String,
    var thumbnail: String
)
