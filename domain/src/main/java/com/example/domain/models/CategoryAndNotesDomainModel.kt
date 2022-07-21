package com.example.domain.models

data class CategoryAndNotesDomainModel(
    val noteCategory: NoteCategoryDomainModel,
    val notes: List<NoteDomainModel>
)
