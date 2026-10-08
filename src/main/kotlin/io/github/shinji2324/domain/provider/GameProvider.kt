package io.github.shinji2324.domain.provider

import io.github.shinji2324.domain.entity.Game

interface GameProvider {
    suspend fun find(name: String): List<Game>
}
