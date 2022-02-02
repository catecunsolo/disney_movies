package alkemy.movies.mapper

import alkemy.movies.dto.MovieDTO
import alkemy.movies.model.Movie
import org.springframework.stereotype.Component

@Component("movieMapper")
class MovieMapper : AbstractMapper<MovieDTO,Movie> {
    override fun toEntity(dto: MovieDTO) = Movie (
        id_movie = dto.id_movie,
        title_movie = dto.title_movie,
        release_date = dto.release_date,
        score_movie = dto.score_movie,
        available_movie = dto.available_movie,
        characters = null,
        genre_movie = null
)

    override fun toDto(entity: Movie) = MovieDTO (
        id_movie = entity.id_movie,
        title_movie = entity.title_movie,
        release_date = entity.release_date,
        score_movie = entity.score_movie,
        available_movie = entity.available_movie,
        characters = null,
        genre_movie = null
    )
}