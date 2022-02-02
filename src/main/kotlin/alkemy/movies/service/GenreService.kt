package alkemy.movies.service

import alkemy.movies.dto.GenreDTO
import alkemy.movies.mapper.GenreMapper
import alkemy.movies.model.Genre
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service("genreService")
class GenreService(
    repository: JpaRepository<Genre, Long>,
    mapper: GenreMapper
): AbstractService<GenreDTO, Genre, Long>(repository, mapper)