package uz.behzoddev.data_caching.repository

import com.example.core_data.DispatcherProvider
import com.example.core_data.Resource
import com.example.core_data.execute
import com.example.domain.models.NoteDomainModel
import com.example.domain.repositories.NoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.behzoddev.data_caching.LocalDataSource
import uz.behzoddev.data_caching.mapper.NoteMapper
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val source: LocalDataSource,
    private val noteMapper: NoteMapper,
    private val dispatcher: DispatcherProvider
) : NoteRepository {

    override suspend fun insertNote(note: NoteDomainModel) {
        return source.insertNote(noteMapper.toEntity(note))
    }

    override suspend fun updateNote(note: NoteDomainModel) {
        return source.updateNote(noteMapper.toEntity(note))
    }

    override suspend fun delete(note: NoteDomainModel) {
        return source.delete(noteMapper.toEntity(note))
    }

    override fun fetchTrashedNotes(): Flow<Resource<List<NoteDomainModel>>> {
        return flow {
            val result = execute {
                source.fetchTrashedNotes().map { noteMapper.toDomain(it) }
            }

            when(result) {
                is Resource.Empty -> {
                    emit(Resource.Empty())
                }
                is Resource.Failure -> {
                    emit(Resource.Failure(result.message!!))
                }
                is Resource.Loading -> {
                    emit(Resource.Loading())
                }
                is Resource.Success -> {
                    emit(Resource.Success(data = result.data!!))
                }
            }
        }.flowOn(dispatcher.io)
    }

    override fun fetchAllNotes(): Flow<Resource<List<NoteDomainModel>>> {
        return flow {
            val result = execute {
                source.fetchAllNotes().map { noteMapper.toDomain(it) }
            }

            when(result) {
                is Resource.Empty -> {
                    emit(Resource.Empty())
                }
                is Resource.Failure -> {
                    emit(Resource.Failure(result.message!!))
                }
                is Resource.Loading -> {
                    emit(Resource.Loading())
                }
                is Resource.Success -> {
                    emit(Resource.Success(data = result.data!!))
                }
            }
        }.flowOn(dispatcher.io)
    }
}