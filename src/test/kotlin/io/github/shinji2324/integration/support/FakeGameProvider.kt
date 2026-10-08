package io.github.shinji2324.integration.support

import io.github.shinji2324.domain.entity.Game
import io.github.shinji2324.domain.provider.GameProvider
import io.github.shinji2324.support.factory.GameFactory
import io.quarkus.test.Mock
import jakarta.enterprise.context.ApplicationScoped

@Mock
@ApplicationScoped
class FakeGameProvider : GameProvider {
    override suspend fun find(name: String): List<Game> = listOf(GameFactory.create(name = name))
}
