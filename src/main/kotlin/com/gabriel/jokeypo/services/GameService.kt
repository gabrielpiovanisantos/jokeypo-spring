package com.gabriel.jokeypo.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameService {

    @Autowired
    lateinit var moveService: MoveService

    fun match(): String {

        val moves = moveService.moveRepository.moves

        var winner = ""

        val graph = hashMapOf(
                "Spock" to listOf("Scissor", "Stone"),
                "Scissor" to listOf("Paper", "Lizard"),
                "Paper" to listOf("Spock", "Stone"),
                "Stone" to listOf("Lizard", "Scissor"),
                "Lizard" to listOf("Spock", "Paper"))

        for (move in moves) {
            val aux = move.move
            val opponents = moves.filter { it != move }
            var beat = 0
            for (opponent in opponents) {
                if (opponent.move !in graph[aux]!!)
                    break
                beat++
            }
            if (beat == (moves.size - 1))
                winner = move.player.name
        }
        if (winner == "")
            winner = "Draw"

        moveService.moveRepository.moves.clear() // cleaning the move repository after the game
        return winner
    }

}
