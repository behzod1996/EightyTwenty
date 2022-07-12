package uz.behzoddev.data_caching

import kotlinx.coroutines.flow.Flow
import uz.behzoddev.data_caching.dao.NoteCategoryDao
import uz.behzoddev.data_caching.dao.NoteDao
import uz.behzoddev.data_caching.entities.notes.NoteCategoryEntity
import uz.behzoddev.data_caching.entities.notes.NoteEntity
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private val noteCategoryDao: NoteCategoryDao,
    private val noteDao: NoteDao
) : LocalDataSource {

    override suspend fun insertNoteCategory(noteCategory: NoteCategoryEntity): Long {
        return noteCategoryDao.insertNoteCategory(noteCategory = noteCategory)
    }

    override suspend fun updateNoteCategory(noteCategory: NoteCategoryEntity) {
        return noteCategoryDao.updateNoteCategory(noteCategory = noteCategory)
    }

    override suspend fun incrementNoteCount(noteCategoryId: Long) {
        return noteCategoryDao.incrementNoteCount(noteCategoryId = noteCategoryId)
    }

    override suspend fun decrementNoteCount(noteCategoryId: Long) {
       return noteCategoryDao.decrementNoteCount(noteCategoryId = noteCategoryId)
    }

    override fun fetchAllCategories(): Flow<List<NoteCategoryEntity>> {
        return noteCategoryDao.fetchAllCategories()
    }

    override suspend fun fetchIfCategoryIdExists(id: Int): Boolean {
        return noteCategoryDao.fetchIfCategoryIdExists(id)
    }

    override suspend fun insertNote(note: NoteEntity): Long {
        return noteDao.insertNote(note = note)
    }

    override suspend fun updateNote(note: NoteEntity) {
        return noteDao.updateNote(note = note)
    }

    override suspend fun delete(note: NoteEntity) {
        return noteDao.delete(note = note)
    }

    override fun fetchTrashedNotes(): Flow<List<NoteEntity>> {
        return noteDao.fetchTrashedNotes()
    }

    override fun fetchAllNotes(): Flow<List<NoteEntity>> {
        return noteDao.fetchAllNotes()
    }
}