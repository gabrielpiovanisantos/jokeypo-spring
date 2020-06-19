package com.gabriel.jokeypo.services

import com.gabriel.jokeypo.entities.Player
import com.gabriel.jokeypo.repositories.PlayerRepository
import org.springframework.stereotype.Service

@Service
class PlayerService {
    fun save(name: String) = playerRepository.players.add(Player(name))

    fun getByName(name: String): Player = playerRepository.getByName(name)

    var playerRepository = PlayerRepository()

}
