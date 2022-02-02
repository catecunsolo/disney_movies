package alkemy.movies.mapper

import alkemy.movies.dto.CharacterMovieDTO
import alkemy.movies.model.CharacterMovie
import org.springframework.stereotype.Component

@Component("characterMovieMapper")
class CharacterMovieMapper : AbstractMapper<CharacterMovieDTO,CharacterMovie> {
    override fun toEntity(dto: CharacterMovieDTO)= CharacterMovie(
        id_character = dto.id_character,
        name_character = dto.name_character,
        age_character = dto.age_character,
        weight_character = dto.weight_character,
        history_character = dto.history_character,
        movies = null,
        available_character = dto.available_character
    )

    override fun toDto(entity: CharacterMovie)= CharacterMovieDTO(
        id_character = entity.id_character,
        name_character = entity.name_character,
        age_character = entity.age_character,
        weight_character = entity.weight_character,
        history_character = entity.history_character,
        movies = null,
        available_character = entity.available_character
    )
}