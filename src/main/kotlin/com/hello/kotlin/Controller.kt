package com.hello.kotlin

import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RequiredArgsConstructor
@RestController
class Controller (
    private val testFlyWayApp: TestFlyWayApp
){

    @GetMapping("/save")
    fun save(){
        testFlyWayApp.save(
            Member(
                name = "노경준",
                age = 19
            )
        )
    }
}