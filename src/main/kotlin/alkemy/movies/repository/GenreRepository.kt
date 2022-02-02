package alkemy.movies.repository

import alkemy.movies.model.Genre
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GenreRepository : JpaRepository<Genre,Long>{
}