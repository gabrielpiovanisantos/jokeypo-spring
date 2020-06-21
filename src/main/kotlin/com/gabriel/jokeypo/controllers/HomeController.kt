package com.gabriel.jokeypo.controllers

import com.gabriel.jokeypo.services.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @Autowired
    private lateinit var gameService: GameService

    @GetMapping("/")
    fun home(): String = "Jokeyy Pow"

    @GetMapping("/game")
    fun game() = gameService.match()
}