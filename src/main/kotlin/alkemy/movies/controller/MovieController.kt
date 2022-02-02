package alkemy.movies.controller

import alkemy.movies.dto.MovieDTO
import alkemy.movies.model.Movie
import alkemy.movies.service.MovieService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController("movieController")
@RequestMapping("movies")
@Tag(name = "Movies", description = "Movies API")
class MovieController(service: MovieService) :
CrudController<MovieDTO, Movie,Long>(service)