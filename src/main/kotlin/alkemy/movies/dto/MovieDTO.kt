package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDate

@Schema(name = "Movie", description = "A movie object")
data class MovieDTO(
    val id_movie: Long?=null,
    var title_movie: String="",
    var release_date: LocalDate = LocalDate.now(),
    var score_movie: Int = 0,
    var available_movie: Boolean = true,
    var characters: List<CharacterMovieDTO>? = null,
    var genre_movie: GenreDTO? = GenreDTO()
) {
}