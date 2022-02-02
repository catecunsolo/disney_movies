package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(name = "Credential", description = "A credential object")
data class CredentialDTO (
    val id_credential: Long? = null,
    var username: String = "",
    var password: String = "",
    var available_credential: Boolean = true,
    var email: String = ""
) {
}