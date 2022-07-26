package com.example.domain.usecases.note_category

import com.example.core_data.Resource
import com.example.domain.models.NoteCategoryDomainModel
import com.example.domain.repositories.NoteCategoryRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchAllCategoriesImpl @Inject constructor(
    private val noteCategoryRepo: NoteCategoryRepository
) : FetchAllCategories {

    override fun invoke(): Flow<Resource<List<NoteCategoryDomainModel>>> {
        return noteCategoryRepo.fetchAllCategories()
    }
}