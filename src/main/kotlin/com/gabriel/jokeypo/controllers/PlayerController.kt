package com.gabriel.jokeypo.controllers

import com.gabriel.jokeypo.services.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/player")
class PlayerController {

    @Autowired
    lateinit var playerService: PlayerService

    @GetMapping("/save")
    fun save(@RequestParam name : String) = playerService.save(name)

    @GetMapping("/get")
    fun get(@RequestParam name : String) = playerService.getByName(name)

}
