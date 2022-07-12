package uz.behzoddev.data_caching.entities.notes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.core_data.Empty

@Entity(tableName = "note_sub_category_table")
data class NoteSubCategoryEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "note_sub_category_id")
    val id: Long = Long.Empty,
    val name: String = String.Empty,
    val count: Int = Int.Empty
)
