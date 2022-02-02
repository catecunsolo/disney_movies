package alkemy.movies.service

import alkemy.movies.exception.ResourceNotFoundException
import alkemy.movies.mapper.AbstractMapper
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.findByIdOrNull

abstract class AbstractService<D,E:Any,ID:Any>(
    private val repository: PagingAndSortingRepository<E,ID>,
    private val mapper: AbstractMapper<D, E>
){
    fun findAll(pageable: Pageable) =
        repository
            .findAll(pageable)

    fun findById(id: ID) =
        repository
            .findByIdOrNull(id)
            ?: throw ResourceNotFoundException("Resource with $id not found")

    fun save(dto: D) =
        mapper
            .toEntity(dto)
            .persist()

    fun deleteById(id: ID) =
        repository.deleteById(id)

    private fun E.persist() =
        repository.save(this)

}