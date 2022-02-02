package alkemy.movies.controller

import alkemy.movies.dto.CharacterMovieDTO
import alkemy.movies.model.CharacterMovie
import alkemy.movies.service.CharacterMovieService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController("characterMovieController")
@RequestMapping("characters")
@Tag(name = "Characters", description = "Characters API")
class CharacterMovieController(service: CharacterMovieService):
        CrudController<CharacterMovieDTO,CharacterMovie,Long>(service)