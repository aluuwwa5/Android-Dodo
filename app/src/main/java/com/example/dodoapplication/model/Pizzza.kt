package com.example.dodoapplication.model

import java.io.Serializable
import java.util.UUID

data class Pizzza(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String,
    val cost: String,
    val image: Int
//    val size: String,
//    val typeOfDought: String,
//    val weight: Int
) : Serializable
