package uz.behzoddev.data_caching

import kotlinx.coroutines.flow.Flow
import uz.behzoddev.data_caching.entities.notes.NoteCategoryEntity
import uz.behzoddev.data_caching.entities.notes.NoteEntity

interface LocalDataSource {

    suspend fun insertNoteCategory(noteCategory: NoteCategoryEntity): Long

    suspend fun updateNoteCategory(noteCategory: NoteCategoryEntity): Long

    suspend fun incrementNoteCount(noteCategoryId: Long)

    suspend fun decrementNoteCount(noteCategoryId: Long)

    fun fetchAllCategories(): Flow<List<NoteCategoryEntity>>

    suspend fun fetchIfCategoryIdExists(id: Int): Boolean

    suspend fun insertNote(note: NoteEntity): Long

    suspend fun updateNote(note: NoteEntity): Long

    suspend fun delete(note: NoteEntity): Long

    fun fetchTrashedNotes(): Flow<List<NoteEntity>>

    fun fetchAllNotes(): Flow<List<NoteEntity>>


}