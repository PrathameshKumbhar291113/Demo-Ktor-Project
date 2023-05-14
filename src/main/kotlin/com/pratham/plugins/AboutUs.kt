package com.pratham.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.aboutUsModule(){
    routing {
        get ("/about-us"){
            call.respond("This is about us class")
        }

        get("/faq"){
            call.respond("This is the faq page")
        }
    }
}