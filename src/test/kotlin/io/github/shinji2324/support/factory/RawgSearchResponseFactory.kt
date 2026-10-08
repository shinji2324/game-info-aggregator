package io.github.shinji2324.support.factory

import io.github.shinji2324.infra.rawg.dto.RawgGameResponse
import io.github.shinji2324.infra.rawg.dto.RawgGenreResponse
import io.github.shinji2324.infra.rawg.dto.RawgSearchResponse
import io.github.serpro69.kfaker.Faker
import io.github.serpro69.kfaker.games.GamesFaker

object RawgSearchResponseFactory {
    private val faker = Faker()
    private val gamesFaker = GamesFaker()

    fun create(size: Int = 5): RawgSearchResponse {
        val games =
            List(size) {
                this.createSingleGame()
            }
        return RawgSearchResponse(results = games)
    }

    fun createSingleGame(): RawgGameResponse {
        val name = gamesFaker.game.title()
        val description = "Description ${faker.random.nextUUID()}"
        val rawgGenreResponse: List<RawgGenreResponse> =
            GameGenresListFactory
                .generateGenres()
                .map {
                    RawgGenreResponse(it)
                }
        return RawgGameResponse(
            name = name,
            description = description,
            genres = rawgGenreResponse,
        )
    }
}
