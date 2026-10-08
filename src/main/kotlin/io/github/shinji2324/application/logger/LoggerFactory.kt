package io.github.shinji2324.application.logger

interface LoggerFactory {
    fun getLogger(clazz: Class<*>): Logger
}
