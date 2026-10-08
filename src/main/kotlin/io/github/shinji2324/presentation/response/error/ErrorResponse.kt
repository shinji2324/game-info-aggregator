package io.github.shinji2324.presentation.response.error

import io.github.shinji2324.presentation.response.shared.Response
import io.quarkus.runtime.annotations.RegisterForReflection

@RegisterForReflection
data class ErrorResponse(
    val status: Int,
    val message: String,
) : Response
