package alkemy.movies.controller

import alkemy.movies.dto.CredentialDTO
import alkemy.movies.model.Credential
import alkemy.movies.service.CredentialService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController("credential")
@RequestMapping("credentials")
@Tag(name="Credentials", description = "Credentials API")
class CredentialController(service: CredentialService):
        CrudController<CredentialDTO, Credential, Long>(service)