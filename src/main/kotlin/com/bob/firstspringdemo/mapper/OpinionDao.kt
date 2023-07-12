package com.bob.firstspringdemo.mapper

import com.bob.firstspringdemo.entity.Opinion

interface OpinionDao {
    fun insert(opinion: Opinion?): Int

    fun selectAll(): List<Opinion>
}