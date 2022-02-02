package alkemy.movies.controller

import alkemy.movies.dto.GenreDTO
import alkemy.movies.model.Genre
import alkemy.movies.service.GenreService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController("genreController")
@RequestMapping("genres")
@Tag(name = "Genres", description = "Genres API")
class GenreController (service: GenreService) :
    CrudController<GenreDTO, Genre,Long>(service)