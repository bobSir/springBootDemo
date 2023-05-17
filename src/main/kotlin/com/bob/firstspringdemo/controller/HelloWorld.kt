package com.bob.firstspringdemo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorld {

    @RequestMapping("helloWorld")
    fun helloWorld(): String {
        return "hello world"
    }
}
