package io.github.shinji2324.application.usecase.shared

interface UseCase<I : UseCaseInput, O : UseCaseOutput> {
    suspend fun execute(input: I): O
}
