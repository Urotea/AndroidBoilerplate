package com.example.takao.androidboilerplate.dao

import com.example.takao.androidboilerplate.entity.PingPong

interface NetworkDao {
    fun getPingPongFromServer(): PingPong
}