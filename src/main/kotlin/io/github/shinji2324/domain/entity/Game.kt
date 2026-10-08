package io.github.shinji2324.domain.entity

import java.util.UUID

data class Game(
    override val uuid: UUID,
    val name: String,
    val description: String,
    val genres: List<String>,
    val cheapest: Float? = null,
) : Entity
