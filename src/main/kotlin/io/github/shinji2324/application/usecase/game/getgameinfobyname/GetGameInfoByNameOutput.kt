package io.github.shinji2324.application.usecase.game.getgameinfobyname

import io.github.shinji2324.application.usecase.shared.UseCaseOutput

data class GetGameInfoByNameOutput(
    val games: List<GetGameInfoByNameOutputElement>,
) : UseCaseOutput
