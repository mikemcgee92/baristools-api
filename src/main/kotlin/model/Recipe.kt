package com.model

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Serializable
data class Recipe(
    val id: Int,
    val label: String,
    val recipeCategory: String,
    val ingredients: List<String>,
    val steps: List<String>,
    val notes: String,
    val imageUrl: String,
    val creatorId: String,
    @Contextual val createdDate: LocalDateTime
)