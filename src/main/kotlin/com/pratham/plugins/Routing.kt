package com.pratham.plugins

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRoutingModule() {
    routing {
        get("/") {
            call.respondText("Hello World! this the home page")
            println("URI: ${call.request.uri}")
            println("Headers: ${call.request.headers.names()}")
            println("Accept: ${call.request.headers["Accept"]}")
            println("Connection: ${call.request.headers["Connection"]}")
            println("User-Agent: ${call.request.headers["User-Agent"]}")
            println("Postman-Token: ${call.request.headers["Postman-Token"]}")
            println("Host: ${call.request.headers["Host  "]}")
            println("Query Params: ${call.request.queryParameters.names()}")
            println("Name: ${call.request.queryParameters["name"]}")
            println("Email: ${call.request.queryParameters["email"]}")
        }

    }
}
