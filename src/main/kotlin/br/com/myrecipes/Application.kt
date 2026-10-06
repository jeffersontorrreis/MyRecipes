package br.com.myrecipes

import br.com.myrecipes.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureHttp()
    configureMonitoring()
    configureSerialization()
    configureSecurity()
    configureWebsockets()
    configureStatusPages()
    configureRouting()
}