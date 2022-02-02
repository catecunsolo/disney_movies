package alkemy.movies.service

import alkemy.movies.dto.CharacterMovieDTO
import alkemy.movies.mapper.CharacterMovieMapper
import alkemy.movies.model.CharacterMovie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service("characterMovieService")
class CharacterMovieService (
    repository: JpaRepository<CharacterMovie, Long>,
    mapper: CharacterMovieMapper
): AbstractService<CharacterMovieDTO, CharacterMovie, Long>(repository, mapper)