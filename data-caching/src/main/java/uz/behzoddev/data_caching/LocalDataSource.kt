package uz.behzoddev.data_caching

import kotlinx.coroutines.flow.Flow
import uz.behzoddev.data_caching.entities.notes.NoteCategoryEntity
import uz.behzoddev.data_caching.entities.notes.NoteEntity

interface LocalDataSource {

    suspend fun insertNoteCategory(noteCategory: NoteCategoryEntity): Long

    suspend fun updateNoteCategory(noteCategory: NoteCategoryEntity)

    suspend fun incrementNoteCount(noteCategoryId: Long)

    suspend fun decrementNoteCount(noteCategoryId: Long)

    suspend fun fetchAllCategories(): List<NoteCategoryEntity>

    suspend fun fetchIfCategoryIdExists(id: Int): Boolean

    suspend fun insertNote(note: NoteEntity): Long

    suspend fun updateNote(note: NoteEntity)

    suspend fun delete(note: NoteEntity)

    suspend fun fetchTrashedNotes(): List<NoteEntity>

    suspend fun fetchAllNotes(): List<NoteEntity>


}