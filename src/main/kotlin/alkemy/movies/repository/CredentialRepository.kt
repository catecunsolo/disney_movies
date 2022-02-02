package alkemy.movies.repository

import alkemy.movies.model.Credential
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CredentialRepository : JpaRepository<Credential,Long> {
}