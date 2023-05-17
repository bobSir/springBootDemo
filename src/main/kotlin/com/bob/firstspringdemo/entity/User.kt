package com.bob.firstspringdemo.entity

import java.io.Serializable


class User : Serializable {
    var id: Int? = null

    /**
     * 账号
     */
    var username: String? = null

    /**
     * 昵称
     */
    var nickname: String? = null

    /**
     * 密码
     */
    var password: String? = null

    override fun equals(that: Any?): Boolean {
        if (this === that) {
            return true
        }
        if (that == null) {
            return false
        }
        if (javaClass != that.javaClass) {
            return false
        }
        val other = that as User
        return ((if (id == null) other.id == null else id == other.id)
                && (if (username == null) other.username == null else username == other.username)
                && (if (nickname == null) other.nickname == null else nickname == other.nickname)
                && if (password == null) other.password == null else password == other.password)
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + if (id == null) 0 else id.hashCode()
        result = prime * result + if (username == null) 0 else username.hashCode()
        result = prime * result + if (nickname == null) 0 else nickname.hashCode()
        result = prime * result + if (password == null) 0 else password.hashCode()
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(javaClass.simpleName)
        sb.append(" [")
        sb.append("Hash = ").append(hashCode())
        sb.append(", id=").append(id)
        sb.append(", username=").append(username)
        sb.append(", nickname=").append(nickname)
        sb.append(", password=").append(password)
        sb.append(", serialVersionUID=").append(serialVersionUID)
        sb.append("]")
        return sb.toString()
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}