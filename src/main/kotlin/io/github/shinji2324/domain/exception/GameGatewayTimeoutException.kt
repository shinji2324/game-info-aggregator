package io.github.shinji2324.domain.exception

class GameGatewayTimeoutException(
    gateway: String,
) : BaseException(
        message = "Game gateway '$gateway' did not connected in time.",
    )
