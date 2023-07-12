package com.bob.firstspringdemo.entity

import java.io.Serializable

data class Opinion(
    var id:Int? = null,
    var nickname: String? = null,
    var userId: String? = null,
    var phoneNum: String? = null,
    var opinionContent: String? = null,
    var img: String? = null,
    var link: String? = null,
    var state: String? = null,
    var createTime: String? = null
) : Serializable