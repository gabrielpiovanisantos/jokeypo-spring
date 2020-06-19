package com.gabriel.jokeypo.repositoriesTests

import com.gabriel.jokeypo.entities.Move
import com.gabriel.jokeypo.entities.Player
import com.gabriel.jokeypo.repositories.MoveRepository
import com.gabriel.jokeypo.repositories.PlayerRepository
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class MoveRepositoryTests {

    val moveRepository = MoveRepository()

    val playerRepository = PlayerRepository()

    val element = Player("Gabriel")

    @BeforeAll
    fun setUp() {
        playerRepository.players.add(element)
        moveRepository.moves.add(Move(element, "paper"))
    }

    @Test
    fun `get move by player`() {
        moveRepository.getByPlayer(element)
    }

    @AfterAll
    fun tearDown() {
        playerRepository.players.clear()
        moveRepository.moves.clear()
    }
}