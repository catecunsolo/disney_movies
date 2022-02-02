package alkemy.movies.util

import org.slf4j.Logger
import org.slf4j.LoggerFactory

abstract class CompanionLogger {
    val log: Logger by lazy { LoggerFactory.getLogger(javaClass.enclosingClass) }

    inline fun <T> T.log(block: Logger.(T) -> Unit): T =
        also { block(log, this) }
}