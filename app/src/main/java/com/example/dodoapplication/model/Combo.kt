package com.example.dodoapplication.model
import java.io.Serializable
import java.util.UUID
data class Combo(
    override val id: String = UUID.randomUUID().toString(),
    override val title: String,
    override val description: String,
    override val cost: String,
    override val image: Int
) : Serializable, Pizza(id, title, description, cost, image)