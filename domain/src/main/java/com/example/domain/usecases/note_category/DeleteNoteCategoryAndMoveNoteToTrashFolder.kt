package com.example.domain.usecases.note_category

import com.example.domain.models.CategoryAndNotesDomainModel
import com.example.domain.models.NoteCategoryDomainModel

interface DeleteNoteCategoryAndMoveNoteToTrashFolder {
    suspend operator fun invoke(params: CategoryAndNotesDomainModel)
}