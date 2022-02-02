package alkemy.movies.controller.operation

import alkemy.movies.util.CompanionLogger
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import javax.validation.Valid

interface Post<R, T : Any, ID : Any> : APIOperation<R, T, ID> {

    @PostMapping
    @Operation(
        summary = "Creates an element",
        description = "Given a representation it creates an entity with it's information"
    )
    fun create(@Valid @RequestBody dto: R) =
        service
            .log { info("Creating entity") }
            .save(dto)
            .log { info("Entity successfully created") }

    companion object : CompanionLogger()
}
