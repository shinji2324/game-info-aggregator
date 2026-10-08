package io.github.shinji2324.presentation.response.game

import io.github.shinji2324.presentation.response.shared.Response
import io.quarkus.runtime.annotations.RegisterForReflection

@RegisterForReflection
data class GetGameInfoByNameResponse(
    val results: List<GetGameInfoByNameResponseElement> = emptyList(),
) : Response
