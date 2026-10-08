package io.github.shinji2324.infra.cheapshark.gateway

import io.github.shinji2324.application.logger.LoggerFactory
import io.github.shinji2324.domain.exception.GameGatewayTimeoutException
import io.github.shinji2324.domain.exception.TimeoutException
import io.github.shinji2324.infra.cheapshark.client.CheapSharkApiClient
import io.github.shinji2324.infra.cheapshark.dto.CheapSharkGameResponse
import io.github.shinji2324.infra.retry.RetryExecutor
import jakarta.enterprise.context.ApplicationScoped
import org.eclipse.microprofile.config.inject.ConfigProperty
import org.eclipse.microprofile.rest.client.inject.RestClient

@ApplicationScoped
class CheapSharkGameGateway(
    @RestClient
    private val client: CheapSharkApiClient,
    @ConfigProperty(name = "cheapshark.max-attempts")
    private val maxAttempts: Int,
    @ConfigProperty(name = "cheapshark.retry-delay")
    private val retryDelay: Int,
    private val retryExecutor: RetryExecutor,
    private val loggerFactory: LoggerFactory,
) {
    private val logger = this.loggerFactory.getLogger(CheapSharkGameGateway::class.java)

    suspend fun findGame(title: String): List<CheapSharkGameResponse> {
        try {
            return retryExecutor.execute(
                maxAttempts = maxAttempts,
                retryDelay = retryDelay,
            ) {
                client.searchGame(title)
            }
        } catch (_: TimeoutException) {
            logger.error("Could not connect to CheapShark API.")
            throw GameGatewayTimeoutException("CheapShark")
        }
    }
}
