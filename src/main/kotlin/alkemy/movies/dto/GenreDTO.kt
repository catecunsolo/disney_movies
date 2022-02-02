package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(name = "Genre", description = "A genre object")
data class GenreDTO (
    val id_genre: Long? = null,
    var name_genre: String = "",
    var available_genre: Boolean = true,
    var movies: List<MovieDTO>? = null,
) {
}