package alkemy.movies.controller.operation

import alkemy.movies.util.CompanionLogger
import io.swagger.v3.oas.annotations.Operation
import org.springdoc.api.annotations.ParameterObject
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping

interface Get<R, T : Any, ID : Any> : APIOperation<R, T, ID> {

    @GetMapping
    @Operation(
        summary = "Find elements",
        description = "Finds elements given the pagination parameters"
    )
    fun findAll(@ParameterObject pageable: Pageable) =
        service
            .log { info("Finding all elements") }
            .findAll(pageable)
            .log { info("findAll successful") }

    companion object : CompanionLogger()
}
