package bytebros.net

import io.ktor.auth.*
import io.ktor.util.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.sessions.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.features.*
import kotlinx.css.*
import io.ktor.html.*
import kotlinx.html.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import kotlin.test.*
import io.ktor.server.testing.*
import bytebros.net.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ configureRouting() }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }
}