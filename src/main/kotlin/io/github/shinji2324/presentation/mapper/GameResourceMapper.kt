package io.github.shinji2324.presentation.mapper

import io.github.shinji2324.application.usecase.game.getgameinfobyname.GetGameInfoByNameInput
import io.github.shinji2324.application.usecase.game.getgameinfobyname.GetGameInfoByNameOutput
import io.github.shinji2324.application.usecase.game.getgameinfobyname.GetGameInfoByNameOutputElement
import io.github.shinji2324.presentation.response.game.GetGameInfoByNameResponse
import io.github.shinji2324.presentation.response.game.GetGameInfoByNameResponseElement

object GameResourceMapper {
    fun toInput(name: String) = GetGameInfoByNameInput(name)

    fun toResponse(output: GetGameInfoByNameOutput) =
        GetGameInfoByNameResponse(
            results = output.games.map { toResponseElement(it) },
        )

    private fun toResponseElement(outputElement: GetGameInfoByNameOutputElement) =
        GetGameInfoByNameResponseElement(
            name = outputElement.name,
            description = outputElement.description,
            genres = outputElement.genres,
        )
}
