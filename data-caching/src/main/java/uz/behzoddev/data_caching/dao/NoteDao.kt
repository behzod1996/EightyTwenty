package uz.behzoddev.data_caching.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import uz.behzoddev.data_caching.entities.notes.NoteEntity

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: NoteEntity): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateNote(note: NoteEntity)

    @Delete
    suspend fun delete(note: NoteEntity)

    @Transaction
    @Query("SELECT * FROM note_table WHERE note_is_trashed = 1")
    fun fetchTrashedNotes(): Flow<List<NoteEntity>>

    @Transaction
    @Query("SELECT * FROM note_table WHERE note_is_trashed <> 1")
    fun fetchAllNotes(): Flow<List<NoteEntity>>

}