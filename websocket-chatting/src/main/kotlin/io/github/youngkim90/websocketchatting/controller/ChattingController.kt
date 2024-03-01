package io.github.youngkim90.websocketchatting.controller

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import org.springframework.web.util.HtmlUtils

@Controller
class ChattingController {
  private val logger = KotlinLogging.logger {}

  @MessageMapping("/chatting-message")
  @SendTo("/topic/chatting")
  fun chatting(message: ChattingMessageDto): ChattingResponseDto {
    logger.info { message.message }
    return ChattingResponseDto(HtmlUtils.htmlEscape(message.message))
  }
}