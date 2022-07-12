package uz.behzoddev.data_caching.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import uz.behzoddev.data_caching.entities.notes.NoteCategoryEntity

interface NoteCategoryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNoteCategory(noteCategory: NoteCategoryEntity): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateNoteCategory(noteCategory: NoteCategoryEntity): Long

    @Query("UPDATE note_category_table SET note_count = note_count + 1 WHERE id = :noteCategoryId")
    suspend fun incrementNoteCount(noteCategoryId: Long)

    @Query("UPDATE note_category_table SET note_count = note_count-1 WHERE id = :noteCategoryId")
    suspend fun decrementNoteCount(noteCategoryId: Long)

    @Query("SELECT * FROM note_category_table ORDER BY note_category_name")
    fun fetchAllCategories(): Flow<List<NoteCategoryEntity>>

    @Query("SELECT EXISTS (SELECT id FROM note_category_table WHERE id = :id LIMIT 1)")
    suspend fun fetchIfCategoryIdExists(id: Int): Boolean
}