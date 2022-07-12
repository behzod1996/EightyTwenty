package uz.behzoddev.data_caching.repository

import com.example.domain.models.NoteDomainModel
import com.example.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import uz.behzoddev.data_caching.LocalDataSource
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val source: LocalDataSource
): NoteRepository {

    override suspend fun insertNote(note: NoteDomainModel): Long {
       TODO()
    }

    override suspend fun updateNote(note: NoteDomainModel) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(note: NoteDomainModel){
        TODO("Not yet implemented")
    }

    override fun fetchTrashedNotes(): Flow<List<NoteDomainModel>> {
        TODO("Not yet implemented")
    }

    override fun fetchAllNotes(): Flow<List<NoteDomainModel>> {
        TODO("Not yet implemented")
    }
}