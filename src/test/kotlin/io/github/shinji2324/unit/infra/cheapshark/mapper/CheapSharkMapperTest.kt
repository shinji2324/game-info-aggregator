package io.github.shinji2324.unit.infra.cheapshark.mapper

import io.github.shinji2324.infra.cheapshark.mapper.CheapSharkMapper
import io.github.shinji2324.support.factory.CheapSharkSearchResponseFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheapSharkMapperTest {
    @Test
    fun `must convert a cheapshark provider result to domain`() {
        val result = CheapSharkSearchResponseFactory.createSingleGame()
        val game = CheapSharkMapper.toDomain(result)
        assertEquals(result.external, game.name)
        assertEquals(result.cheapest.toFloat(), game.cheapest)
    }
}
