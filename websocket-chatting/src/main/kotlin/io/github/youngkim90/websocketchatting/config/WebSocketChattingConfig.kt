package io.github.youngkim90.websocketchatting.config

import org.springframework.context.annotation.Configuration
import org.springframework.messaging.simp.config.MessageBrokerRegistry
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker
import org.springframework.web.socket.config.annotation.StompEndpointRegistry
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer

@Configuration
@EnableWebSocketMessageBroker // 메세지 브로커를 이용한 웹소켓 활성화
class WebSocketChattingConfig : WebSocketMessageBrokerConfigurer {
  companion object {
    private const val ENDPOINT = "/websocket-chatting"
    private const val SIMPLE_BROKER = "/topic"
    private const val PUBLISH = "/app"
  }

  // 메시지 브로커는 서버와 클라이언트 간의 메시지를 중계하는 역할을 한다.
  override fun configureMessageBroker(registry: MessageBrokerRegistry) {
    registry.enableSimpleBroker(SIMPLE_BROKER) // 브로커 이름
    registry.setApplicationDestinationPrefixes(PUBLISH) // 메세지 처리 라우팅 설정
  }

  override fun registerStompEndpoints(registry: StompEndpointRegistry) {
    registry
      .addEndpoint(ENDPOINT)
      .setAllowedOriginPatterns("*")
  }
}
