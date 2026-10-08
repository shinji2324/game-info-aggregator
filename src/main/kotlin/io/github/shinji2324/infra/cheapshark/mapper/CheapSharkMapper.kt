package io.github.shinji2324.infra.cheapshark.mapper

import io.github.shinji2324.domain.entity.Game
import io.github.shinji2324.infra.cheapshark.dto.CheapSharkGameResponse
import java.util.UUID

object CheapSharkMapper {
    fun toDomain(response: CheapSharkGameResponse): Game =
        Game(
            uuid = UUID.randomUUID(),
            name = response.external,
            description = "",
            genres = emptyList(),
            cheapest = response.cheapest.toFloat(),
        )
}
