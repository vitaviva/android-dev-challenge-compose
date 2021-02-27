package com.example.androiddevchallenge.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


data class Puppy(
    val id: Int,
    val name: String,
    val sex: Sex,
    val age: String,
    val breed: String,
    val color: String,
    val location: String,
    val images: List<Int> = emptyList(),
    val story: String = "",
    val fee: Int = 0
)

enum class Sex(val str: String, val label: ImageVector, val color: Color) {
    Male("Male", Icons.Default.Male, Color(0xFF1DA1F2)),
    Female("Female", Icons.Default.Female, Color(0xFFf44336))
}