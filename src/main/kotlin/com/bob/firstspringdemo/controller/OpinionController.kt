package com.bob.firstspringdemo.controller

import com.bob.firstspringdemo.entity.Opinion
import com.bob.firstspringdemo.mapper.OpinionDao
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

@RestController
@RequestMapping("/opinion")
class OpinionController {
    @Resource
    private var opinionDao: OpinionDao? = null

    @GetMapping("findAll")
    fun findAll(): List<Opinion>? {
        return opinionDao?.selectAll()
    }

    @PostMapping("insert")
    fun insert(opinion: Opinion) {
        opinionDao?.insert(opinion)
    }
}