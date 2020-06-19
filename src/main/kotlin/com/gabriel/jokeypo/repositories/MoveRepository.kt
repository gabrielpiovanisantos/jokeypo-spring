package com.gabriel.jokeypo.repositories

import com.gabriel.jokeypo.entities.Move
import com.gabriel.jokeypo.entities.Player

class MoveRepository {

    val moves = ArrayList<Move>()

    fun getByPlayer(element: Player): Move = moves.single{ it.player == element}

}
