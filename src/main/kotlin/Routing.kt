package com

import com.model.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.time.LocalDateTime

fun Application.configureRouting() {
    routing {
        staticResources("static", "static")

        get("/recipes") {
            call.respond(
                listOf(
                    // hasty example
                    Recipe(
                        1,
                        "Drip Coffee",
                        "Hot Drinks",
                        listOf("Coffee"),
                        listOf("pour coffee"),
                        "it's hot",
                        "ht",
                        "1",
                        LocalDateTime.now().toString()
                    )
                )
            )
        }
    }
}