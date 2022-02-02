package alkemy.movies.controller.operation

import alkemy.movies.util.CompanionLogger
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

interface GetById<R, T : Any, ID : Any> : APIOperation<R, T, ID> {

    @GetMapping("/{id}")
    @Operation(
        summary = "Finds an element",
        description = "Given an element's identifier, it returns it's representation"
    )
    fun findById(@PathVariable id: ID) =
        service
            .log { info("Finding entity by id {}", id) }
            .findById(id)
            .log { info("Find by id successful") }

    companion object : CompanionLogger()
}
