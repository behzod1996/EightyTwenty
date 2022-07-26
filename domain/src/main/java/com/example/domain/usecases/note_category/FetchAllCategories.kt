package com.example.domain.usecases.note_category

import com.example.core_data.Resource
import com.example.domain.models.NoteCategoryDomainModel
import kotlinx.coroutines.flow.Flow

interface FetchAllCategories {
    operator fun invoke(): Flow<Resource<List<NoteCategoryDomainModel>>>
}