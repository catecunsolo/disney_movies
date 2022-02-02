package alkemy.movies.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.hibernate.annotations.SQLDelete
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@SQLDelete(sql="UPDATE character c SET c.available=false WHERE c.id=?")
@Table(name = "character_movie", schema = "disney_movies")
class CharacterMovie (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id_character: Long? = null,
    @Column(nullable = false, name = "name")
    var name_character: String = "",
    @Column(name = "age")
    var age_character: Int? = null,
    @Column(name = "weight")
    var weight_character: Double? = null,
    @Column(nullable = false, name = "history")
    var history_character: String = "",
    @Column(nullable = false, name = "available", columnDefinition = "TINYINT(1)")
    var available_character: Boolean = true,
    @CreatedDate
    @Column(updatable =false, nullable = false)
    @JsonIgnore
    var creation_date: LocalDate = LocalDate.now(),
    @LastModifiedDate
    @JsonIgnore
    var modified_date: LocalDate = LocalDate.now(),
    @ManyToMany(mappedBy = "characters")
    @JsonIgnoreProperties("characters")
    var movies: List<Movie>? = null){}