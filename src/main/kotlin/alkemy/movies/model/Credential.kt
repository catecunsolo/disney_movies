package alkemy.movies.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.SQLDelete
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.convert.ThreeTenBackPortConverters
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@SQLDelete(sql="UPDATE credential c SET c.available=false WHERE c.id=?")
@Table(name = "credential", schema = "disney_movies")
class Credential(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id_credential: Long? = null,
    @Column(nullable = false)
    var username: String = "",
    @Column(nullable = false)
    var password: String = "",
    @Column(nullable = false, name = "available", columnDefinition = "TINYINT(1)")
    var available_credential: Boolean = true,
    @Column(nullable = false)
    var email: String = "",
    @CreatedDate
    @Column(updatable =false, nullable = false)
    @JsonIgnore
    var creation_date: LocalDate = LocalDate.now(),
    @LastModifiedDate
    @JsonIgnore
    var modified_date: LocalDate = LocalDate.now()
){}