package com.gabriel.jokeypo.repositoriesTests

import com.gabriel.jokeypo.entities.Player
import com.gabriel.jokeypo.repositories.PlayerRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PlayerRepositoryTests {

     val playerRepository = PlayerRepository()

    @BeforeAll
    fun setUp() {
        playerRepository.players.add(Player("Gabriel"))
    }

    @Test
    fun `get player by name`() {
        val player = Player("Gabriel")
        assertThat(player).isEqualTo(playerRepository.getByName(player.name))
    }

    @AfterAll
    fun tearDown() {
        playerRepository.players.clear()
    }
}