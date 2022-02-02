package alkemy.movies.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.SQLDelete
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@SQLDelete(sql="UPDATE genre g SET g.available=false WHERE g.id=?")
@Table(name = "genre", schema = "disney_movies")
class Genre (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id_genre: Long? = null,
    @Column(name = "name", nullable = false)
    var name_genre: String = "",
    @Column(nullable = false, name = "available", columnDefinition = "TINYINT(1)")
    var available_genre: Boolean = true,
    @OneToMany(mappedBy = "genre_movie")
    var movies: List<Movie>? = null,
    @CreatedDate
    @Column(updatable =false, nullable = false)
    @JsonIgnore
    var creation_date: LocalDate = LocalDate.now(),
    @LastModifiedDate
    @JsonIgnore
    var modified_date: LocalDate = LocalDate.now()
        ){}