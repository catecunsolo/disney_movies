package alkemy.movies

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableJpaAuditing //permite el registro automatico de fechas created and lastmodified
@EnableAsync //envio asincrono de mails
class MoviesApplication

fun main(args: Array<String>) {
	runApplication<MoviesApplication>(*args)
}
