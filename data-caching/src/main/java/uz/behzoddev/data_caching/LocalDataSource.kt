package uz.behzoddev.data_caching

import kotlinx.coroutines.flow.Flow
import uz.behzoddev.data_caching.entities.notes.NoteCategoryEntity
import uz.behzoddev.data_caching.entities.notes.NoteEntity

interface LocalDataSource {

    // All functions that related to note category.

    suspend fun insertNoteCategory(noteCategory: NoteCategoryEntity)

    suspend fun updateNoteCategory(noteCategory: NoteCategoryEntity)

    suspend fun deleteNoteCategory(noteCategory: NoteCategoryEntity)

    suspend fun incrementNoteCount(noteCategoryId: Long)

    suspend fun decrementNoteCount(noteCategoryId: Long)

    suspend fun fetchAllCategories(): List<NoteCategoryEntity>

    suspend fun fetchIfCategoryIdExists(id: Int): Boolean

    // All functions that related to note.

    suspend fun insertNote(note: NoteEntity)

    suspend fun updateNote(note: NoteEntity)

    suspend fun delete(note: NoteEntity)

    suspend fun fetchTrashedNotes(): List<NoteEntity>

    suspend fun fetchAllNotes(): List<NoteEntity>


}