package com.gabriel.jokeypo.controllers

import com.gabriel.jokeypo.entities.Move
import com.gabriel.jokeypo.entities.Player
import com.gabriel.jokeypo.services.MoveService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/move")
class MoveController {

    @Autowired
    lateinit var moveService: MoveService

    @GetMapping("/save")
    fun save(@RequestParam name: String, @RequestParam move: String) = moveService.save(Move(Player(name), move))

    @GetMapping("/get")
    fun get(): ArrayList<Move> = moveService.getMoves()


}

