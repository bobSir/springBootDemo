package com.bob.firstspringdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/test")
class ApiTest {
    @GetMapping("testJson")
    fun testJson(): Any {
        val map = mutableMapOf<String, Any>("a" to "a1", "b" to "b1")
        return map
    }
}