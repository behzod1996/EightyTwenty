package com.example.domain.models

import java.time.ZonedDateTime

data class NoteDomainModel(
    val id: Long,
    val title: String,
    val description: String,
    val timestamp: ZonedDateTime,
    val isTrashed: Boolean,
    val categoryId: Long
)
