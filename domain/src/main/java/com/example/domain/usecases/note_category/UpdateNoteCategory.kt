package com.example.domain.usecases.note_category

import com.example.domain.models.NoteCategoryDomainModel

interface UpdateNoteCategory {
    suspend operator fun invoke(params: NoteCategoryDomainModel)
}