package io.github.shinji2324.domain.exception

class GameNotFoundException(
    gameName: String,
) : BaseException(
        message = "Game '$gameName' not found.",
    )
