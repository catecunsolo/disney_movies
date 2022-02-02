package alkemy.movies.mapper

import alkemy.movies.dto.CredentialDTO
import alkemy.movies.model.Credential
import org.springframework.stereotype.Component

@Component("credentialMapper")
class CredentialMapper : AbstractMapper<CredentialDTO, Credential> {
    override fun toEntity(dto: CredentialDTO) = Credential(
        id_credential = dto.id_credential,
        username = dto.username,
        password = dto.password,
        available_credential = dto.available_credential,
        email = dto.email
    )

    override fun toDto(entity: Credential) = CredentialDTO(
        id_credential = entity.id_credential,
        username = entity.username,
        password = entity.password,
        available_credential = entity.available_credential,
        email = entity.email
    )
}