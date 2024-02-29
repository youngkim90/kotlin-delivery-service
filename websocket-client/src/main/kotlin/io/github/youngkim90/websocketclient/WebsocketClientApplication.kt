package io.github.youngkim90.websocketclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebsocketClientApplication

fun main(args: Array<String>) {
  runApplication<WebsocketClientApplication>(*args)
}
