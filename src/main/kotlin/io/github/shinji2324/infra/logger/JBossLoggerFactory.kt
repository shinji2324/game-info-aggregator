package io.github.shinji2324.infra.logger

import io.github.shinji2324.application.logger.LoggerFactory
import jakarta.enterprise.context.ApplicationScoped
import org.jboss.logging.Logger

@ApplicationScoped
class JBossLoggerFactory : LoggerFactory {
    override fun getLogger(clazz: Class<*>): JBossLogger {
        val logger = Logger.getLogger(clazz)
        return JBossLogger(logger)
    }
}
