package com.example.domain.repository

import com.example.core_data.Resource
import com.example.domain.models.NoteCategoryDomainModel
import kotlinx.coroutines.flow.Flow

interface NoteCategoryRepository {
    suspend fun insertNoteCategory(noteCategory: NoteCategoryDomainModel): Long

    suspend fun updateNoteCategory(noteCategory: NoteCategoryDomainModel)

    suspend fun incrementNoteCount(noteCategoryId: Long)

    suspend fun decrementNoteCount(noteCategoryId: Long)

    fun fetchAllCategories(): Flow<Resource<List<NoteCategoryDomainModel>>>

    suspend fun fetchIfCategoryIdExists(id: Int): Boolean

}