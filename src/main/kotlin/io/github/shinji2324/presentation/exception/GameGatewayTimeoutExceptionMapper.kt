package io.github.shinji2324.presentation.exception

import io.github.shinji2324.domain.exception.GameGatewayTimeoutException
import io.github.shinji2324.presentation.response.error.ErrorResponse
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import jakarta.ws.rs.ext.ExceptionMapper
import jakarta.ws.rs.ext.Provider

@Provider
class GameGatewayTimeoutExceptionMapper : ExceptionMapper<GameGatewayTimeoutException> {
    override fun toResponse(exception: GameGatewayTimeoutException): Response =
        Response
            .status(Response.Status.SERVICE_UNAVAILABLE)
            .entity(ErrorResponse(Response.Status.SERVICE_UNAVAILABLE.statusCode, exception.message))
            .type(MediaType.APPLICATION_JSON)
            .build()
}
