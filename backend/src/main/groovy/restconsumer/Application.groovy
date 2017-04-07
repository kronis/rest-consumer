package restconsumer

import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import restconsumer.config.RestConsumerConfig

/**
 * @author Tor Håvard Bieltvedt
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
@Import([
        RestConsumerConfig,
])
@Slf4j
@EnableCaching
@EnableCircuitBreaker
class Application {

    Application() {
    }

    static void main(String[] args) throws Exception {
        SpringApplication.run Application, args
    }
}
