package com.example.domain.usecases.note_category

import com.example.domain.models.NoteCategoryDomainModel
import com.example.domain.repositories.NoteCategoryRepository
import javax.inject.Inject

class UpdateNoteCategoryImpl @Inject constructor(
    private val noteCategoryRepo: NoteCategoryRepository
): UpdateNoteCategory {

    override suspend fun invoke(params: NoteCategoryDomainModel) {
        return noteCategoryRepo.updateNoteCategory(params)
    }

}