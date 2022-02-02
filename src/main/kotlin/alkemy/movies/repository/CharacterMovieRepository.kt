package alkemy.movies.repository

import alkemy.movies.model.CharacterMovie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CharacterMovieRepository : JpaRepository<CharacterMovie,Long>{
}