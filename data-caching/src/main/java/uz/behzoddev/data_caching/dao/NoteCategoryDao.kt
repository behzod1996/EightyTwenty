package uz.behzoddev.data_caching.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import uz.behzoddev.data_caching.entities.notes.NoteCategoryEntity

@Dao
interface NoteCategoryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNoteCategory(noteCategory: NoteCategoryEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateNoteCategory(noteCategory: NoteCategoryEntity)

    @Delete
    suspend fun deleteNoteCategory(noteCategory: NoteCategoryEntity)

    @Query("UPDATE note_category_table SET note_count = note_count + 1 WHERE id = :noteCategoryId")
    suspend fun incrementNoteCount(noteCategoryId: Long)

    @Query("UPDATE note_category_table SET note_count = note_count-1 WHERE id = :noteCategoryId")
    suspend fun decrementNoteCount(noteCategoryId: Long)

    @Query("SELECT * FROM note_category_table ORDER BY note_category_name")
    suspend fun fetchAllCategories(): List<NoteCategoryEntity>

    @Query("SELECT EXISTS (SELECT id FROM note_category_table WHERE id = :id LIMIT 1)")
    suspend fun fetchIfCategoryIdExists(id: Int): Boolean
}