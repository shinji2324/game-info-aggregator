package io.github.shinji2324.infra.rawg.client

import io.github.shinji2324.infra.rawg.dto.RawgSearchResponse
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.QueryParam
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient

@RegisterRestClient(configKey = "rawg-api")
interface RawgApiClient {
    @GET
    @Path("/games")
    suspend fun search(
        @QueryParam("search") name: String,
        @QueryParam("key") apiKey: String,
    ): RawgSearchResponse
}
