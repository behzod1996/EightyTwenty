package uz.behzoddev.data_caching.repository

import com.example.core_data.Resource
import com.example.domain.models.NoteCategoryDomainModel
import com.example.domain.repository.NoteCategoryRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import uz.behzoddev.data_caching.LocalDataSource
import uz.behzoddev.data_caching.mapper.NoteCategoryMapper
import javax.inject.Inject

class NoteCategoryRepositoryImpl @Inject constructor(
    private val source: LocalDataSource,
    private val mapper: NoteCategoryMapper
) : NoteCategoryRepository {

    override suspend fun insertNoteCategory(noteCategory: NoteCategoryDomainModel): Long {
        return source.insertNoteCategory(mapper.toEntity(domain = noteCategory))
    }

    override suspend fun updateNoteCategory(noteCategory: NoteCategoryDomainModel) {
        return source.updateNoteCategory(mapper.toEntity(domain = noteCategory))
    }

    override suspend fun incrementNoteCount(noteCategoryId: Long) {
        return source.incrementNoteCount(noteCategoryId)
    }

    override suspend fun decrementNoteCount(noteCategoryId: Long) {
        return source.decrementNoteCount(noteCategoryId)
    }

    override fun fetchAllCategories(): Flow<Resource<List<NoteCategoryDomainModel>>> {
        return flow {
            
        }
    }

    override suspend fun fetchIfCategoryIdExists(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}