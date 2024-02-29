package io.github.youngkim90.websocketchatting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebsocketChattingApplication

fun main(args: Array<String>) {
	runApplication<WebsocketChattingApplication>(*args)
}
