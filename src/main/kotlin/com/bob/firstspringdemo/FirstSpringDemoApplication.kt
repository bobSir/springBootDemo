package com.bob.firstspringdemo

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("com.bob.firstspringdemo.mapper")
class FirstSpringDemoApplication

fun main(args: Array<String>) {
    runApplication<FirstSpringDemoApplication>(*args)
}
