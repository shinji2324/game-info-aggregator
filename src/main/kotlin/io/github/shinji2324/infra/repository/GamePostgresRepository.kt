package io.github.shinji2324.infra.repository

import io.github.shinji2324.domain.repository.GameRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GamePostgresRepository :
    PostgresRepository(),
    GameRepository
