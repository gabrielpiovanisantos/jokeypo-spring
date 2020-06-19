package com.gabriel.jokeypo.servicesTests

import com.gabriel.jokeypo.entities.Player
import com.gabriel.jokeypo.services.PlayerService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PlayerServiceTests {

    @Autowired
    lateinit var playerService: PlayerService

    @Test
    fun `insert and get a player by its name`() {
        val name = "Gabriel"
        val player = Player(name)
        playerService.save(name)
        assertThat(player).isEqualTo(playerService.getByName(name))
    }
}