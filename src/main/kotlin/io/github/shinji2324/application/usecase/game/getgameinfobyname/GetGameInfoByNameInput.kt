package io.github.shinji2324.application.usecase.game.getgameinfobyname

import io.github.shinji2324.application.usecase.shared.UseCaseInput

data class GetGameInfoByNameInput(
    val name: String,
) : UseCaseInput
