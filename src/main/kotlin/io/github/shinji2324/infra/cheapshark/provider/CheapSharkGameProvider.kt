package io.github.shinji2324.infra.cheapshark.provider

import io.github.shinji2324.domain.entity.Game
import io.github.shinji2324.domain.provider.GameProvider
import io.github.shinji2324.infra.cheapshark.gateway.CheapSharkGameGateway
import io.github.shinji2324.infra.cheapshark.mapper.CheapSharkMapper
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class CheapSharkGameProvider(
    private val gateway: CheapSharkGameGateway,
) : GameProvider {
    override suspend fun find(name: String): List<Game> = gateway.findGame(name).map { CheapSharkMapper.toDomain(it) }
}
