package alkemy.movies.controller.operation

import alkemy.movies.service.AbstractService

interface APIOperation<R, T : Any, ID : Any> {
    val service: AbstractService<R, T, ID>
}
