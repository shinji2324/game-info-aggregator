package io.github.shinji2324.domain.exception

abstract class BaseException(
    override val message: String,
) : Exception(message)
