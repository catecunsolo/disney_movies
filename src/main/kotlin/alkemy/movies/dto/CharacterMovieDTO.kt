package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Schema(name = "Character", description = "A character object")
data class CharacterMovieDTO(
    @field:Schema(
        description = "The character id",
        example = "1250",
        required = false
    )
    val id_character: Long? = null,
    @field:Schema(
        description = "The character name",
        example = "A name",
        required = true
    )
    var name_character: String = "",
    @field:Schema(
        description = "The age value",
        example = "A value",
        required = false
    )
    var age_character: Int? = null,
    @field:Schema(
        description = "The weight value",
        example = "A value",
        required = false
    )
    var weight_character: Double? = null,
    @field:Schema(
        description = "The history value",
        example = "A value",
        required = false
    )
    var history_character: String = "",
    @field:NotNull
    @field:NotEmpty
    var available_character: Boolean = true,
    @field:Schema(
        description = "The list of movies",
        example = "A list",
        required = false
    )
    var movies: List<MovieDTO>? = null)
 {
}