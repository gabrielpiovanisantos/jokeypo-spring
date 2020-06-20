package com.gabriel.jokeypo.servicesTests

import com.gabriel.jokeypo.entities.Move
import com.gabriel.jokeypo.entities.Player
import com.gabriel.jokeypo.services.GameService
import com.gabriel.jokeypo.services.MoveService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GameServiceTests {

    @Autowired
    lateinit var gameService: GameService

    @Autowired
    lateinit var moveService: MoveService

    @Test
    fun `simple winning`() {
        val name1 = "Gabriel"
        val player1 = Player(name1)
        val name2 = "Lucas"
        val player2 = Player(name2)
        val move1 = "Paper"
        val movePlayer1 = Move(player1, move1)
        val move2 = "Stone"
        val movePlayer2 = Move(player2, move2)
        val move3 = "Spock"
        val name3 = "Julio"
        val player3 = Player(name3)
        val movePlayer3 = Move(player3, move3)
        val moves = arrayListOf(movePlayer1, movePlayer2, movePlayer3)
        moveService.moveRepository.moves.addAll(moves)
        assertThat(player1.name).isEqualTo(gameService.match())
    }

    @Test
    fun `a draw`() {
        val name1 = "Gabriel"
        val player1 = Player(name1)
        val name2 = "Lucas"
        val player2 = Player(name2)
        val move1 = "Paper"
        val movePlayer1 = Move(player1, move1)
        val move2 = "Stone"
        val movePlayer2 = Move(player2, move2)
        val move3 = "Lizard"
        val name3 = "Julio"
        val player3 = Player(name3)
        val movePlayer3 = Move(player3, move3)
        val moves = arrayListOf(movePlayer1, movePlayer2, movePlayer3)
        moveService.moveRepository.moves.addAll(moves)
        assertThat("Draw").isEqualTo(gameService.match())
    }
}