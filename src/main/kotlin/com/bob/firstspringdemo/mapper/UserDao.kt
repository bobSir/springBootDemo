package com.bob.firstspringdemo.mapper

import com.bob.firstspringdemo.entity.User


interface UserDao {
    fun deleteByPrimaryKey(id: Int?): Int
    fun insert(record: User?): Int
    fun selectAll(): List<User>
    fun insertSelective(record: User?): Int
    fun selectByPrimaryKey(id: Int?): User?
    fun updateByPrimaryKeySelective(record: User?): Int
    fun updateByPrimaryKey(record: User?): Int
}