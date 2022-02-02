package alkemy.movies.controller

import alkemy.movies.controller.operation.*
import alkemy.movies.service.AbstractService

open class CrudController<D, E : Any, ID : Any>(
    override val service: AbstractService<D, E, ID>, //trailing comma
) : GetById<D, E, ID>,
    Get<D, E, ID>,
    Post<D, E, ID>,
    Put<D, E, ID>,
    Delete<D, E, ID>
