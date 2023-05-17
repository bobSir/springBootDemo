package com.bob.firstspringdemo.controller

import com.bob.firstspringdemo.entity.User
import com.bob.firstspringdemo.mapper.UserDao
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

@RestController
@RequestMapping("/user")
class UserController {
    @Resource
    private var userDao: UserDao? = null

    @GetMapping("findAll")
    fun findAll(): List<User>? {
        return userDao?.selectAll()
    }

    @GetMapping("insertUser")
    fun insertUser(user: User) {
        userDao?.insert(user)
    }
}