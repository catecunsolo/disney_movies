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
@SQLDelete(sql="UPDATE movie m SET m.available=false WHERE m.id=?")
@Table(name = "movie", schema = "disney_movies")
class Movie (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id_movie: Long?=null,
    @Column(name = "title", nullable = false)
    var title_movie: String="",
    @Column(name = "realease", nullable = false)
    var release_date: LocalDate= LocalDate.now(),
    @Column(name = "score", nullable = false)
    var score_movie: Int = 0,
    @Column(nullable = false, name = "available", columnDefinition = "TINYINT(1)")
    var available_movie: Boolean = true,
    @JoinTable(name = "movies_characters",
        joinColumns = [JoinColumn(name = "FK_MOVIE")],
        inverseJoinColumns = [JoinColumn(name = "FK_CHARACTER")])
    @ManyToMany(cascade = arrayOf(CascadeType.ALL))
    var characters: List<CharacterMovie>? = null,
    @CreatedDate
    @Column(updatable =false, nullable = false)
    @JsonIgnore
    var creation_date: LocalDate=LocalDate.now(),
    @LastModifiedDate
    @JsonIgnore
    var modified_date: LocalDate=LocalDate.now(),
    @JoinColumn(name="genre")
    @ManyToOne
    var genre_movie: Genre? = Genre()
        ){
}