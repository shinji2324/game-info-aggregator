package io.github.shinji2324.presentation.resource

import io.github.shinji2324.application.usecase.game.getgameinfobyname.GetGameInfoByNameInput
import io.github.shinji2324.application.usecase.game.getgameinfobyname.GetGameInfoByNameOutput
import io.github.shinji2324.application.usecase.game.getgameinfobyname.GetGameInfoByNameUseCase
import io.github.shinji2324.presentation.mapper.GameResourceMapper
import io.github.shinji2324.presentation.response.game.GetGameInfoByNameResponse
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/games")
class GameResource(
    private val useCase: GetGameInfoByNameUseCase,
) {
    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    suspend fun getGameInfoByName(
        @PathParam("name") name: String,
    ): GetGameInfoByNameResponse {
        val input: GetGameInfoByNameInput = GameResourceMapper.toInput(name)
        val output: GetGameInfoByNameOutput = useCase.execute(input)
        return GameResourceMapper.toResponse(output)
    }
}
