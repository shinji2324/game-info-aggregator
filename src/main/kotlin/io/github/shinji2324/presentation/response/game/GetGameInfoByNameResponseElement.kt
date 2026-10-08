package io.github.shinji2324.presentation.response.game

import io.quarkus.runtime.annotations.RegisterForReflection

@RegisterForReflection
data class GetGameInfoByNameResponseElement(
    val name: String,
    val description: String,
    val genres: List<String> = emptyList(),
)
