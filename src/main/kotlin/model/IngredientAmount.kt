package com.model

import kotlinx.serialization.Serializable

@Serializable
data class IngredientAmount(
    val recipe: Recipe,
    val size: String,
    val ingredient: Ingredient,
    val amount: String
)