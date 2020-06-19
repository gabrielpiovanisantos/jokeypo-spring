package com.gabriel.jokeypo.repositories

import com.gabriel.jokeypo.entities.Player

class PlayerRepository {
    var players = ArrayList<Player>()

    fun getByName(name: String): Player = players.single { it.name == name }

}
