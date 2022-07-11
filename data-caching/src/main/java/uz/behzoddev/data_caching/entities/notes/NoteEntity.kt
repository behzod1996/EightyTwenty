package uz.behzoddev.data_caching.entities.notes

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import com.example.core_data.Empty
import kotlinx.parcelize.Parcelize
import java.time.ZonedDateTime

@Entity(
    tableName = "note_table"
)
@Parcelize
data class NoteEntity(
    @ColumnInfo(name = "note_id")
    val id: Long = Long.Empty,
    @ColumnInfo(name = "note_title")
    val title: String = String.Empty,
    @ColumnInfo(name = "note_description")
    val description: String = String.Empty,
    @ColumnInfo(name = "note_timestamp")
    val timestamp: ZonedDateTime = ZonedDateTime.now(),
    @ColumnInfo(name = "note_is_trashed")
    val isTrashed: Boolean = false,
    @ColumnInfo(name = "note_category_id")
    val categoryId: Long = Long.Empty
): Parcelable