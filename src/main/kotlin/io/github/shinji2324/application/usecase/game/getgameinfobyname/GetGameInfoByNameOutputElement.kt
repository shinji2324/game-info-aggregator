package io.github.shinji2324.application.usecase.game.getgameinfobyname

data class GetGameInfoByNameOutputElement(
    val name: String,
    val description: String,
    val genres: List<String> = emptyList(),
)
