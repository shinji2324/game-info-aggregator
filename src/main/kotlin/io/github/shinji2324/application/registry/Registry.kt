package io.github.shinji2324.application.registry

interface Registry<T> {
    fun all(): Collection<T>
}
