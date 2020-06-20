package com.gabriel.jokeypo.services

import com.gabriel.jokeypo.entities.Move
import com.gabriel.jokeypo.entities.Player
import com.gabriel.jokeypo.repositories.MoveRepository
import org.springframework.stereotype.Service

@Service
class MoveService {

    val moveRepository = MoveRepository()

    fun save(moveInst: Move) = moveRepository.moves.add(moveInst)
    fun getByPlayer(player: Player): Move = moveRepository.getByPlayer(player)

}
