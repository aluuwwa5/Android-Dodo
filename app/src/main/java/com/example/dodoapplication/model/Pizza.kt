package com.example.dodoapplication.model
import java.io.Serializable
import java.util.UUID
open class Pizza(
    open val id: String = UUID.randomUUID().toString(),
    open val title: String,
    open val description: String,
    open val cost: String,
    open val image: Int
):Serializable
