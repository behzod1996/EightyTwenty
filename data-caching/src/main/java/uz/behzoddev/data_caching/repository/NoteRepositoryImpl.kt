package uz.behzoddev.data_caching.repository

import com.example.domain.models.NoteDomainModel
import com.example.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import uz.behzoddev.data_caching.LocalDataSource
import uz.behzoddev.data_caching.mapper.NoteMapper
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val source: LocalDataSource,
    private val noteMapper: NoteMapper
) : NoteRepository {

    override suspend fun insertNote(note: NoteDomainModel): Long {
        return source.insertNote(noteMapper.toEntity(note))
    }

    override suspend fun updateNote(note: NoteDomainModel) {
        return source.updateNote(noteMapper.toEntity(note))
    }

    override suspend fun delete(note: NoteDomainModel) {
        return source.delete(noteMapper.toEntity(note))
    }

    override fun fetchTrashedNotes(): Flow<List<NoteDomainModel>> {
        return flow {

        }
    }

    override fun fetchAllNotes(): Flow<List<NoteDomainModel>> {
        TODO("Not yet implemented")
    }
}