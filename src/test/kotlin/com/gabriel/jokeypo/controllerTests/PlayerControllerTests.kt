package com.gabriel.jokeypo.controllerTests

import com.gabriel.jokeypo.controllers.PlayerController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PlayerControllerTests {

    @Autowired
    lateinit var playerController: PlayerController

    fun `new player`() {
        val name = "Gabriel"
        playerController.save(name)

    }
}