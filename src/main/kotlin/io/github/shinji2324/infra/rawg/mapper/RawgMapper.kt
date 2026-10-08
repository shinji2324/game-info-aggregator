package io.github.shinji2324.infra.rawg.mapper

import io.github.shinji2324.domain.entity.Game
import io.github.shinji2324.infra.rawg.dto.RawgGameResponse
import java.util.UUID

object RawgMapper {
    fun toDomain(rawgGameResponse: RawgGameResponse): Game =
        Game(
            uuid = UUID.randomUUID(),
            name = rawgGameResponse.name,
            description = rawgGameResponse.description ?: "",
            genres = rawgGameResponse.genres.map { it.name },
        )
}
