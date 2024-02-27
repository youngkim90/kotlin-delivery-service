package io.github.youngkim90.hellowebsocket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWebsocketApplication

fun main(args: Array<String>) {
	runApplication<HelloWebsocketApplication>(*args)
}
