package com.model

import kotlinx.serialization.Serializable

@Serializable
data class Ingredient(
    val id: Int,
    val label: String,
)