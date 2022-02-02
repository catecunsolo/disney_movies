package alkemy.movies.mapper

import alkemy.movies.dto.GenreDTO
import alkemy.movies.model.Genre
import org.springframework.stereotype.Component

@Component("genreMapper")
class GenreMapper : AbstractMapper<GenreDTO,Genre> {
    override fun toEntity(dto: GenreDTO) = Genre(
        id_genre = dto.id_genre,
        name_genre = dto.name_genre,
        available_genre = dto.available_genre,
        movies = null
    )

    override fun toDto(entity: Genre) = GenreDTO(
        id_genre = entity.id_genre,
        name_genre = entity.name_genre,
        available_genre = entity.available_genre,
        movies = null
    )
}