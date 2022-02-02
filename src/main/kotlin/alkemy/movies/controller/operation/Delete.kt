package alkemy.movies.controller.operation

import io.swagger.v3.oas.annotations.Operation
import alkemy.movies.util.CompanionLogger
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable

interface Delete<R, T : Any, ID : Any> : APIOperation<R, T, ID> {

    @DeleteMapping("/{id}")
    @Operation(
        summary = "Deletes an element",
        description = "Deletes an entity given it's identifier"
    )
    fun delete(@PathVariable id: ID) =
        service
            .log { info("Deleting entity with id $id") } // REGISTRO ->peticion
            .deleteById(id) //proceso
            .log { info("Delete successful") }

    companion object : CompanionLogger()
}
