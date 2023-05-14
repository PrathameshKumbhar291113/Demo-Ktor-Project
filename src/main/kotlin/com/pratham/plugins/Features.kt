package com.pratham.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.featuresModule(){
    routing {
        get ("/features"){
            call.respond("This is features routing page")
        }
    }
}