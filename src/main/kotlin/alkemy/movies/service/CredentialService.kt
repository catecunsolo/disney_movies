package alkemy.movies.service

import alkemy.movies.dto.CredentialDTO
import alkemy.movies.mapper.CredentialMapper
import alkemy.movies.model.Credential
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service("credentialService")
class CredentialService(
    repository: JpaRepository<Credential, Long>,
    mapper: CredentialMapper
): AbstractService<CredentialDTO, Credential, Long>(repository, mapper)