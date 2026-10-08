package io.github.shinji2324.infra.registry

import io.github.shinji2324.application.registry.Registry
import io.github.shinji2324.domain.provider.GameProvider
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Instance

@ApplicationScoped
class CdiGameProviderRegistry(
    providers: Instance<GameProvider>,
) : Registry<GameProvider> {
    private val providers = providers.toList()

    override fun all(): Collection<GameProvider> = providers.toList()
}
