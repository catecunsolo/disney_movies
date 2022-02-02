package alkemy.movies.mapper

interface AbstractMapper<D,E> {
    fun toEntity(dto :D): E
    fun toDto(entity :E):D
}