package bytebros.net

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import bytebros.net.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSecurity()
        configureRouting()
        configureTemplating()
    }.start(wait = true)
}
