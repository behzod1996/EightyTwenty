package uz.behzoddev.data_caching.repository

import com.example.core_data.DispatcherProvider
import com.example.core_data.Resource
import com.example.core_data.execute
import com.example.domain.models.NoteCategoryDomainModel
import com.example.domain.repository.NoteCategoryRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.behzoddev.data_caching.LocalDataSource
import uz.behzoddev.data_caching.mapper.NoteCategoryMapper
import javax.inject.Inject

class NoteCategoryRepositoryImpl @Inject constructor(
    private val source: LocalDataSource,
    private val mapper: NoteCategoryMapper,
    private val dispatcher: DispatcherProvider
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
            val result = execute {
                source.fetchAllCategories().map { mapper.toDomain(it) }
            }

            when (result) {
                is Resource.Empty -> emit(Resource.Empty())
                is Resource.Failure -> emit(Resource.Failure(result.message!!))
                is Resource.Loading -> emit(Resource.Loading())
                is Resource.Success -> emit(Resource.Success(result.data!!))
            }

        }.flowOn(dispatcher.io)
    }

    override suspend fun fetchIfCategoryIdExists(id: Int): Boolean {
        return source.fetchIfCategoryIdExists(id)
    }
}