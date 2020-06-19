package com.gabriel.jokeypo.servicesTests

import com.gabriel.jokeypo.entities.Move
import com.gabriel.jokeypo.entities.Player
import com.gabriel.jokeypo.services.MoveService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MoveServiceTests {

    @Autowired
    lateinit var moveService: MoveService

    @Test
    fun `insert a move and get by player`() {
        val name = "Gabriel"
        val player = Player(name)
        val move = "Papel"
        val moveInst = Move(player, move)
        moveService.save(moveInst)
        assertThat(moveInst).isEqualTo(moveService.getByPlayer(player))
    }
}