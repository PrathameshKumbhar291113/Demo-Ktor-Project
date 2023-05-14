package com.pratham

import com.pratham.plugins.aboutUsModule
import com.pratham.plugins.configureRoutingModule
import com.pratham.plugins.featuresModule
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0"){
        configureRoutingModule()
        aboutUsModule()
        featuresModule()
    }.start(wait = true)
}

fun Application.module() {
    configureRoutingModule()
}

fun Routing.homeRoute(){
    get("/"){
        call.respond("Hello My Demo Project 7.")
    }
}
